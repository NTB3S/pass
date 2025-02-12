package com.seb.card.generator.adapter.web.advice;


import com.seb.card.generator.adapter.mapper.DtoMapper;
import com.seb.card.generator.adapter.web.advice.dto.ValidationErrorDto;
import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
@RequiredArgsConstructor
public class RestControllerAdvice extends ResponseEntityExceptionHandler {

    private final DtoMapper mapper;

    @ExceptionHandler(InvalidDomainCreationException.class)
    protected ResponseEntity<List<ValidationErrorDto>> handleIllegalArgumentException(InvalidDomainCreationException exception) {
        final var error = mapper.toDto(exception.getErrors());
        return ResponseEntity.badRequest().body(error);
    }
}
