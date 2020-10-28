package com.rabbitsyrup.study.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:/conf/config.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:C:/dev/eclipse-workspace/study/config/app/conf/config.properties", ignoreResourceNotFound = true) //로컬 경로로 변경 필요
public class GlobalPropertySource {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    
    @Value("${spring.datasource.url}")
    private String url;
    
    @Value("${spring.datasource.username}")
    private String username;
    
    @Value("${spring.datasource.password}")
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}