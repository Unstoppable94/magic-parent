package com.magic.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "magic")
public class MagicProperties {

    /**
     * 是否开启注入
     */
    private boolean enabled = true;
    /**
     * 前缀拼接
     */
    private String prefix = "Hi";
    /**
     * 后缀拼接
     */
    private String suffix = "!";

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
