package com.seb.card.generator;

import com.seb.card.generator.application.session.service.SessionService;
import com.seb.card.generator.application.ticket.usecase.CreateTicketUseCaseImpl;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import com.seb.card.generator.port.out.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class UseCaseConfig {

    @Bean
    public CreateTicketUseCase createTicketUseCase(TicketRepository repository,
                                            SessionService service){
        return new CreateTicketUseCaseImpl(repository, service);
    }
}
