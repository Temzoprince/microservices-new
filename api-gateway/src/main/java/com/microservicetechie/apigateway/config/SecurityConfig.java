package com.microservicetechie.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    public SecurityWebFilterChain springSecurity(ServerHttpSecurity serverHttpSecurity){

//        serverHttpSecurity.csrf()
//                .disable()
//                .authorizeExchange(exchange -> exchange
//                        .pathMatchers("/eureka/**")
//                        .permitAll()
//                        .anyExchange()
//                        .authenticated())
//                .oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
//        return serverHttpSecurity.build();
//
//        serverHttpSecurity.csrf((csrf) -> csrf.disable())
//                .authorizeExchange((exchange) -> exchange
//                        .pathMatchers("/eureka/**")
//                        .permitAll()
//                        .anyExchange()
//                        .authenticated())
//                .oauth2ResourceServer((oauth2) -> oauth2
//                        .jwt(Customizer.withDefaults()));
//        return serverHttpSecurity.build();
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(authorize -> authorize
//                        .anyRequest().authenticated()
//                )
//                .oauth2ResourceServer((oauth2) -> oauth2.jwt(Customizer.withDefaults()));
//        return http.build();
//    }

//        @Bean
//        SecurityFilterChain filterChain(ServerHttpSecurity http) {
//            http
//                    .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                    .authorizeExchange(exchanges -> exchanges
//                            .pathMatchers("/eureka/**").permitAll()
//                            .anyExchange().authenticated()
//                    )
//                    .oauth2ResourceServer(oauth2 -> oauth2
//                            .jwt(Customizer.withDefaults()));
//            return (SecurityFilterChain) http.build();
//        }

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(exchanges -> exchanges
//                        .requestMatchers("/eureka/web").permitAll()
                        .requestMatchers("/eureka/**").permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(Customizer.withDefaults()));
        return http.build();
    }
}
