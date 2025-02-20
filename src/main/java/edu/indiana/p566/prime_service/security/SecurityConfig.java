package edu.indiana.p566.prime_service.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.security.interfaces.RSAKey;

private RSAKey rsaKey;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
    this.rsaKey = Jwks.generateRsa();
}
