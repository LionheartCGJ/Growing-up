package com.cgj.pattern.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {

    private static Map<String, String> map;

    public static String getValue(String key) {
        if (map == null) {
            new PropertiesReader().getProperties();
        }
        return map.get(key);
    }

    private void getProperties() {
        map = new HashMap<String, String>();
        Properties props = new Properties();
        try {
            InputStream in = getClass().getResourceAsStream("type.properties");
            props.load(in);
            Set<Entry<Object, Object>> entrys = props.entrySet();
            for (Entry<Object, Object> entry : entrys) {
                map.put((String) entry.getKey(), (String) entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
