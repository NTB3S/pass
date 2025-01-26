package com.seb.card.generator;

import com.seb.card.generator.application.service.SessionService;
import com.seb.card.generator.application.service.usecase.SessionUseCaseImpl;
import com.seb.card.generator.application.service.usecase.TicketUseCaseImpl;
import com.seb.card.generator.port.in.CancelSessionUseCase;
import com.seb.card.generator.port.in.CreateTicketUseCase;
import com.seb.card.generator.port.out.SessionRepository;
import com.seb.card.generator.port.out.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
@RequiredArgsConstructor
public class UseCaseConfig {

    @Bean
    public CreateTicketUseCase createTicketUseCase(TicketRepository repository,
                                            SessionService service){
        return new TicketUseCaseImpl(repository, service);
    }

    @Bean
    public CancelSessionUseCase cancelSessionUseCase(SessionRepository repository,
                                                    SessionService service){
        return new SessionUseCaseImpl(repository, service);
    }
}
