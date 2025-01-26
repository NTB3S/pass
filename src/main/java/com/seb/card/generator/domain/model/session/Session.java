package com.seb.card.generator.domain.model.session;

import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import com.seb.card.generator.domain.exception.ValidationError;
import lombok.With;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

@With
public record Session(String id,
                      LocalDate dueDate,
                      Optional<LocalDate> completionDate,
                      String description,
                      boolean isCancelled) {

    public Session {
        final var errors = new ArrayList<ValidationError>();

        if(StringUtils.isBlank(id)){
            errors.add(new ValidationError("id","Cannot be blank"));
        }

        if(dueDate == null){
            errors.add(new ValidationError("dueDate","Cannot be null"));
        }

        if(StringUtils.isBlank(description)){
            errors.add(new ValidationError("description","Cannot be blank"));
        }

        if(!errors.isEmpty()){
            throw new InvalidDomainCreationException(errors);
        }

    }

    public Session(String id, LocalDate dueDate, String description) {
        this(id, dueDate, Optional.empty(), description, false);
    }

    public Session(String id, LocalDate dueDate, LocalDate completionDate, String description) {
        this(id, dueDate, Optional.ofNullable(completionDate), description, false);
    }
}
