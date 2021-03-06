package com.chg.hackdays.chappie.util;

public class StringUtil {

    public static boolean isFalsy(String str) {
        return !isTruthy(str);
    }

    public static boolean isTruthy(String str) {
        if (str == null || str.isEmpty())
            return false;
        switch (str.trim().toLowerCase().charAt(0)) {
            case 'f':
            case 'n':
            case '0':
                return false;
            case 'o':
                return !str.trim().toLowerCase().startsWith("off");
            default:
                return true;
        }
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static String toString(Object o) {
        if (o == null)
            return null;
        return o.toString();
    }
}
