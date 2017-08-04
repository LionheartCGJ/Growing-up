package com.shiyanlou.string.judge.empty;

public class StringUtils {
    public static boolean allIsNotNull(String... s) {
        if (s == null) {
            return false;
        }
        for (String str : s) {
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean allIsNotEmpty(String... s) {
        if (s == null) {
            return false;
        }
        for (String str : s) {
            if (str == null || "".equals(str)) {
                return false;
            }
        }
        return true;
    }
}
