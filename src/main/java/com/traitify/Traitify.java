package com.traitify;

public abstract class Traitify {

    public static final String LIVE_API_BASE = "https://api.traitify.com";
    public static final String VERSION = "0.0.14";
    public static String apiKey;
    public static String apiVersion = "v1";

    private static String apiBase = LIVE_API_BASE;

    /**
     * (FOR TESTING ONLY)
     * If you'd like your API requests to hit your own (mocked) server,
     * you can set this up here by overriding the base api URL.
     */
    public static void overrideApiBase(final String overriddenApiBase) {
        apiBase = overriddenApiBase;
    }

    public static String getApiBase() {
        return apiBase;
    }

}
