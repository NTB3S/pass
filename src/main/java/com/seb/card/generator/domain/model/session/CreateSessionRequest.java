package com.seb.card.generator.domain.model.session;

import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import com.seb.card.generator.domain.exception.ValidationError;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;

public record CreateSessionRequest(LocalDate dueDate, String description) {
    public CreateSessionRequest {
        final var errors = new ArrayList<ValidationError>();

        if (dueDate == null) {
            errors.add(new ValidationError("dueDate", "Cannot be null"));
        }

        if (StringUtils.isBlank(description)) {
            errors.add(new ValidationError("description", "Cannot be blank"));
        }

        if (!errors.isEmpty()) {
            throw new InvalidDomainCreationException(errors);
        }
    }
}
