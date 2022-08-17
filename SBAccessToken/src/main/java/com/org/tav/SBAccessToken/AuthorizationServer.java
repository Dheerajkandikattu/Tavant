package com.org.tav.SBAccessToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;

import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

public class AuthorizationServer extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;
 
    
 
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // TODO Auto-generated method stub
        super.configure(endpoints);
        endpoints.authenticationManager(authenticationManager);
    }
 
 
   @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // TODO Auto-generated method stub
        //super.configure(clients);
        clients.inMemory().withClient("tavant-client").secret("tavant-secret")
        .authorizedGrantTypes("password").scopes("read","write");
    }
 
    
 
    
}
