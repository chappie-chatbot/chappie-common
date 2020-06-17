package com.chg.hackdays.chappie.util;

public class MimeUtil {
    public static boolean isText(String mimeType){
        if(mimeType == null)
            return true;
        mimeType = mimeType.trim().toLowerCase();
        return mimeType.startsWith("text/") || mimeType.endsWith("/text");
    }
}
