package com.seb.card.generator;

import com.seb.card.generator.adapter.mapper.EntityMapper;
import com.seb.card.generator.adapter.persistence.jpa.JpaSessionRepository;
import com.seb.card.generator.adapter.persistence.jpa.JpaTicketRepository;
import com.seb.card.generator.adapter.persistence.jpa.SessionRepositoryAdapter;
import com.seb.card.generator.adapter.persistence.jpa.TicketRepositoryAdapter;
import com.seb.card.generator.port.out.SessionRepository;
import com.seb.card.generator.port.out.TicketRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public SessionRepository sessionRepository(JpaSessionRepository repository,
                                               EntityMapper entityMapper){
        return new SessionRepositoryAdapter(repository, entityMapper);
    }

    @Bean
    public TicketRepository ticketRepository(JpaTicketRepository repository,
                                             EntityMapper entityMapper){
        return new TicketRepositoryAdapter(repository, entityMapper);
    }

}
