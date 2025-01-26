package com.seb.card.generator;


import com.seb.card.generator.application.session.service.SessionService;
import com.seb.card.generator.application.session.service.impl.SessionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public SessionService createSessionService(){
        return new SessionServiceImpl();
    }

}
