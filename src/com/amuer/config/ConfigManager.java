package com.amuer.config;

/**
 * Created by mark on 2015/7/9.
 */
public class ConfigManager {
    private static ConfigManager instance = new ConfigManager();

    private ConfigManager()
    {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public String getValue(String key)
    {
        return "";
    }
}
