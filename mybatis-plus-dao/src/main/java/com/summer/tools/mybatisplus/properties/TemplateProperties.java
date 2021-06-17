package com.summer.tools.mybatisplus.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "template")
public class TemplateProperties {
    private Boolean enable;
}
