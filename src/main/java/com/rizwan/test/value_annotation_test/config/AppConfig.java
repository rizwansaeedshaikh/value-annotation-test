package com.rizwan.test.value_annotation_test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rizwan.test.value_annotation_test.model.TestBean;

@Configuration
@PropertySource(value = "classpath:config.properties")
@ComponentScan(basePackages="com.rizwan.test",value="com.rizwan.test")
public class AppConfig
{

    @Bean
    TestBean tesBean()
    {
        return new TestBean();
    }
}
