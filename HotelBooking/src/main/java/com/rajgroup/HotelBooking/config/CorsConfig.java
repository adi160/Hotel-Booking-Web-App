package com.rajgroup.HotelBooking.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author : adi
 * Created on : 12:47 AM , 14/02/24
 */

@Configuration
public class CorsConfig {

    @Value("${allowed.origin}")
    private String allowedOrigin;

    @Bean
    public WebMvcConfigurer getCorsConfiguration(){
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOrigins(allowedOrigin);
            }
        };
    }
}
