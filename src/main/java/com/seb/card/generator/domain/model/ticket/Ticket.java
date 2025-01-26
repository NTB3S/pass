package com.seb.card.generator.domain.model.ticket;

import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import com.seb.card.generator.domain.exception.ValidationError;
import com.seb.card.generator.domain.model.session.Session;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public record Ticket(String id,
                     String issuer,
                     String firstName,
                     String lastName,
                     List<Session> sessions) {

    public Ticket{
        final var errors = new ArrayList<ValidationError>();

        if(StringUtils.isBlank(id)){
            errors.add(new ValidationError("id","Cannot be blank"));
        }

        if(StringUtils.isBlank(firstName)){
            errors.add(new ValidationError("firstName","Cannot be blank"));
        }

        if(StringUtils.isBlank(lastName)){
            errors.add(new ValidationError("lastName","Cannot be blank"));
        }

        if(StringUtils.isBlank(issuer)){
            errors.add(new ValidationError("issuer","Cannot be blank"));
        }

        if(CollectionUtils.isEmpty(sessions)){
            errors.add(new ValidationError("sessions","Cannot be empty"));
        }

        if(!errors.isEmpty()){
            throw new InvalidDomainCreationException(errors);
        }
    }
}
