package com.mahes.archit.todowebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager cred() {

        Function<String, String> passwordEncoder
                = input -> passwordEncoder().encode(input);

        UserDetails userDetailes = User.builder()
                .passwordEncoder(passwordEncoder)
                .username("archit")
                .password("archit")
                .roles("USER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(userDetailes);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
