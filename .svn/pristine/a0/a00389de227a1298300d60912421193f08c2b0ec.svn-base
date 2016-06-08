package com.woohood.aihome.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {
    private static final String CONFIG_PATH = "/properties/config.properties";
    private static final String WEIXIN_PATH = "/properties/weixin.properties";
    private static final String HONGBAO_PATH = "/properties/hongbao.properties";
    private static final String BAIDU_PATH = "/properties/baidu.properties";

    private static final String LIVE = getProperty(CONFIG_PATH, "live");

    private static String getLiveProperty(String path, String key) {
        if ("true".equals(LIVE)) {
            key = "$" + key;
        }
        return getProperty(path, key);
    }

    public static String getConfigProperty(String key) {
        return getLiveProperty(CONFIG_PATH, key);
    }

    public static String getWeixinProperty(String key) {
        return getLiveProperty(WEIXIN_PATH, key);
    }

    public static String getHongbaoProperty(String key) {
        return getLiveProperty(HONGBAO_PATH, key);
    }

    public static String getBaiduProperty(String key) {
        return getLiveProperty(BAIDU_PATH, key);
    }

    public static String getProperty(String path, String key) {
        InputStream ins = null;

        try {
            ins = PropertiesUtil.class.getResourceAsStream(path);
            InputStreamReader reader = new InputStreamReader(ins);
            BufferedReader buffer = new BufferedReader(reader);
            Properties prop = new Properties();
            prop.load(buffer);
            return prop.getProperty(key).trim();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(LIVE);
        System.out.println(getWeixinProperty("server_url"));
    }
}
