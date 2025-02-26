package com.hmall.cart.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hm.cart")
@Data
@Component
@RefreshScope
public class CartProperties {
    private Integer maxItems;
}
