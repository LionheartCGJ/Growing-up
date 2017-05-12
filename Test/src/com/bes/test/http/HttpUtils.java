package com.bes.test.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    public static String execute(String url, String method, Map<String, String> params) {
        String response = null;
        if ("".equals(method) || "GET".equalsIgnoreCase(method)) {
            if (url.indexOf("?") > 0) {
                url = url + "&" + encodeUrl(params);
            } else {
                url = url + "?" + encodeUrl(params);
            }
        }
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setReadTimeout(60000);
            if ("POST".equalsIgnoreCase(method)) {
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                conn.getOutputStream().write(params(params).getBytes("UTF-8"));
            }
            response = read(conn.getInputStream(), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return response;
    }

    private static String read(InputStream inputStream, String enc) throws Exception {
        StringBuilder sb = new StringBuilder();
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            if (enc != null) {
                br = new BufferedReader(new InputStreamReader(inputStream, enc), 1000);
            } else {
                br = new BufferedReader(new InputStreamReader(inputStream), 1000);
            }
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                sb.append(line);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (isr != null) {
                    isr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception ex) {
                throw ex;
            }
        }
        inputStream.close();
        return sb.toString();
    }

    private static String params(Map<String, String> params) {
        if (null == params) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String key : params.keySet()) {
            if (first) {
                first = false;
            } else {
                sb.append("&");
            }
            sb.append(key + "=" + params.get(key));
        }
        return sb.toString();
    }

    private static String encodeUrl(Map<String, String> params) {
        if (params == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String key : params.keySet()) {
            if (first) {
                first = false;
            } else {
                sb.append("&");
            }
            String v = params.get(key);
            try {
                v = URLEncoder.encode(v, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
                ;
            }
            sb.append(key + "=" + v);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Map<String, String> paramMap = new HashMap<String, String>();
        String url = "http://utf8.sms.webchinese.cn/";
        String method = "GET";
        paramMap.put("UID", "bessms");
        paramMap.put("KEY", "eeec0d02edd050cc1096");
        paramMap.put("smsMob", "18366139183");
        paramMap.put("smsText", "yanzhengma：8888Just+test+it.");
        System.out.println(execute(url, method, paramMap));
    }

}
