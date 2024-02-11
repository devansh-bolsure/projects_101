package com.smart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.annotation.security.PermitAll;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class MyConfig
{
	
	
	
	@Bean
     SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
        http.authorizeHttpRequests((authorize) ->
        {
            try {
                authorize.requestMatchers("/admin/**").hasAuthority("ADMIN")
                        .requestMatchers("/user/**").hasAuthority("USER")
                        .anyRequest().permitAll();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        
        http.formLogin(form->
        {
        	 	try 
		        {
			     form.loginPage("/signin")
	 		         .loginProcessingUrl("/dologin")
	 		         .defaultSuccessUrl("/user/index");
					
				} catch (Exception e2) 
		        {
				   e2.printStackTrace();
				}
        });
        
        http.csrf(csrf->csrf.disable());
        
        http.authenticationProvider(daoauthenticationProvider());
        
        DefaultSecurityFilterChain defaultSecurityFilterChain = http.build();
        
        return defaultSecurityFilterChain;
    }
	
	
	
	
	@Bean
	 UserDetailsService getUserDetailsService()
	{
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	 BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	@Bean
	DaoAuthenticationProvider daoauthenticationProvider()
	{
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
	

	
	

}
