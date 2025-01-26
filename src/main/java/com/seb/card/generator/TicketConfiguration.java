package com.seb.card.generator;

import com.seb.card.generator.adapter.mapper.TicketMapper;
import com.seb.card.generator.adapter.persistence.jpa.ticket.JpaTicketRepository;
import com.seb.card.generator.adapter.persistence.jpa.ticket.TicketRepositoryAdapter;
import com.seb.card.generator.application.service.CreateSessionService;
import com.seb.card.generator.application.service.impl.CreateSessionServiceImpl;
import com.seb.card.generator.application.service.impl.CreateTicketServiceImpl;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import com.seb.card.generator.port.out.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TicketConfiguration {

    @Bean
    public CreateSessionService createSessionService(){
        return new CreateSessionServiceImpl();
    }

    @Bean
    public TicketRepository ticketRepository(JpaTicketRepository repository,
                                      TicketMapper ticketMapper){
        return new TicketRepositoryAdapter(repository, ticketMapper);
    }

    @Bean
    public CreateTicketUseCase createTicketUseCase(TicketRepository repository,
                                            CreateSessionService service){
        return new CreateTicketServiceImpl(repository, service);
    }
}
