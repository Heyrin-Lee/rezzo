package com.rezzo.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity        //spring security 를 적용한다는 Annotation
@Configuration
public class SecurityConfig {
	
	@Autowired SecurityLogin sqLogin;
	
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
    	http.csrf().disable()
        
        .authorizeRequests()
        	.antMatchers("/resources/**").permitAll()
        	.antMatchers("/assets/**/*").permitAll()
        	.antMatchers("/css/*").permitAll()
        	.antMatchers("/js/*").permitAll()
        	.anyRequest().authenticated()
        .and()
            .formLogin()
            	.loginPage("/login")
            	.defaultSuccessUrl("/")
            	.failureUrl("/loginFail")
            	.loginProcessingUrl("/loginProc")
                .usernameParameter("id")
                .passwordParameter("pw")
                .successForwardUrl("/")
            	.permitAll()
        .and()
            .logout()
        		.logoutUrl("/logout")
        		.logoutSuccessUrl("/login")
        		.invalidateHttpSession(true);
        
        return http.build();
    }
    
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(sqLogin);
    }
    
}