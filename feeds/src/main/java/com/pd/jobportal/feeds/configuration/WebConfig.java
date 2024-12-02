package com.pd.jobportal.feeds.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${cors.allowed.origins}")
    private String[] allowedOrigins;

    @Value("${cors.allowed.methods}")
    private String[] allowedMethods;

    @Value("${cors.allowed.headers}")
    private String[] allowedHeaders;

    @Value("${cors.allow.credentials}")
    private boolean allowCredentials;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow CORS for all endpoints
                .allowedOrigins(allowedOrigins) // Allow requests from React app running on localhost:3000
                .allowedMethods(allowedMethods) // Allow specific HTTP methods
                .allowedHeaders(allowedHeaders) // Allow all headers
                .allowCredentials(allowCredentials); // Allow credentials (cookies, HTTP authentication)
    }
}
