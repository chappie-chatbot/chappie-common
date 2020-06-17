package com.chg.hackdays.chappie.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncodeUtil {
    public static final String DEFAULT_ENCODING = "text";
    private static final String DEFAULT_DIGEST = "SHA-256";

    public static byte[] decode(String str) {
        return decode(null, str);
    }

    public static byte[] decode(String encoding, String str) {
        if (encoding == null)
            encoding = DEFAULT_ENCODING;
        switch (encoding.trim().toLowerCase()) {
            case "base64":
                return Base64.getDecoder().decode(str);
            case "text":
                return str.getBytes();
            default:
                throw new UnsupportedOperationException("Unsupported encoding: " + encoding);
        }
    }

    public static String encode(byte[] data) {
        return encode(null, data);
    }

    public static String encode(String encoding, byte[] data) {
        if (encoding == null)
            encoding = DEFAULT_ENCODING;
        switch (encoding.trim().toLowerCase()) {
            case "base64":
                return new String(Base64.getEncoder().encode(data));
            case "text":
                return new String(data);
            default:
                throw new UnsupportedOperationException("Unsupported encoding: " + encoding);
        }
    }

    public static byte[] hash(byte[] data) {
        return hash(null, data);
    }

    public static byte[] hash(String digest, byte[] data) {
        if (digest == null)
            digest = DEFAULT_DIGEST;
        try {
            return MessageDigest.getInstance(digest).digest(data);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
