package com.seb.card.generator;

import com.seb.card.generator.adapter.mapper.SessionMapper;
import com.seb.card.generator.adapter.persistence.jpa.session.JpaSessionRepository;
import com.seb.card.generator.adapter.persistence.jpa.session.SessionRepositoryAdapter;
import com.seb.card.generator.application.service.impl.CreateSessionServiceImpl;
import com.seb.card.generator.port.in.CreateSessionUseCase;
import com.seb.card.generator.port.out.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SessionConfiguration {
    @Bean
    public SessionRepository sessionRepositoryAdapter(JpaSessionRepository repository,
                                               SessionMapper sessionMapper){

        return new SessionRepositoryAdapter(repository, sessionMapper);
    }

    @Bean
    public CreateSessionUseCase createSessionUseCase(SessionRepository sessionRepository){
        return new CreateSessionServiceImpl(sessionRepository);
    }
}
