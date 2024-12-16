package com.loc.web_organic_java.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class SecurityConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        // Allow all origins (you can restrict to specific domains)
        config.addAllowedOriginPattern("*");
        // Allow specific HTTP methods
        config.addAllowedMethod("*"); // GET, POST, PUT, DELETE, etc.
        // Allow specific headers
        config.addAllowedHeader("*");
        // Allow credentials (optional, for cookies/auth)
        config.setAllowCredentials(true);

        // Register the CORS configuration
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
