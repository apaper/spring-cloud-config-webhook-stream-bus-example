package com.example.demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   protected void configure(HttpSecurity httpSecurity) throws Exception {
//                    httpSecurity.authorizeRequests().antMatchers("/").permitAll();
//                    httpSecurity.authorizeRequests().anyRequest().permitAll().and().csrf().disable();

		      /* Enable to see H2 Console when using Spring Security */
		      httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
			                      .authorizeRequests().antMatchers("/console/**").permitAll();

		      httpSecurity.csrf().disable();
		      httpSecurity.headers().frameOptions().disable();
   }
}