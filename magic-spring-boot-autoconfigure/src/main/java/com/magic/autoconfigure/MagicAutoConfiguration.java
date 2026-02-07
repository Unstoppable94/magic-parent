package com.magic.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MagicProperties.class)
@ConditionalOnProperty(
        prefix = "magic",
        name = "enabled",
        havingValue = "true",
        matchIfMissing = true
)
public class MagicAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MagicService magicService(MagicProperties properties) {
        return new MagicService(properties);
    }
}
