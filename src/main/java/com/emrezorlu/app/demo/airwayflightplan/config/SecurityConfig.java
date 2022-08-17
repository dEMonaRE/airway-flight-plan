package com.emrezorlu.app.demo.airwayflightplan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;


@Configuration
public class SecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().antMatchers("/**", "/ignore2",
                // -- Swagger UI v2
                "/v2/api-docs", "/swagger-resources", "/swagger-resources/**", "/configuration/ui",
                "/configuration/security", "/swagger-ui/index.html", "/webjars/**",
                // -- Swagger UI v3
                "/v3/api-docs/**", "/swagger-ui/**");
    }

}
