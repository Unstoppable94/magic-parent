package com.magic.autoconfigure;

public class MagicService {

    private final MagicProperties properties;

    public MagicService(MagicProperties properties) {
        this.properties = properties;
    }

    public String say(String name) {
        return properties.getPrefix()
                + " "
                + name
                + " "
                + properties.getSuffix();
    }
}
