package com.seb.card.generator.adapter.web.advice;


import com.seb.card.generator.adapter.mapper.ErrorMapper;
import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class RestControllerAdvice extends ResponseEntityExceptionHandler {

    private final ErrorMapper mapper;

    @ExceptionHandler(InvalidDomainCreationException.class)
    protected ResponseEntity<Object> handleIllegalArgumentException(InvalidDomainCreationException exception) {
        final var error = mapper.toDto(exception.getErrors());
        return ResponseEntity.badRequest().body(error);
    }
}
