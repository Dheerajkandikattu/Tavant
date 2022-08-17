package com.org.tav.SBAccessToken;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableResourceServer
public class SbAccessTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbAccessTokenApplication.class, args);
	}
	@RequestMapping("/validateUser")
	public Principal user(Principal user)
	{
		return user;
	}
	@Configuration
	protected static class AuthenticatioManagerConfiguration extends GlobalAuthenticationConfigurerAdapter{
		
		
		@Override
		public void init(AuthenticationManagerBuilder auth) throws Exception {
			// TODO Auto-generated method stub
			super.init(auth);
			auth.inMemoryAuthentication().withUser("tavant").password("abc").roles("user");
		}
	}
	
	

}
