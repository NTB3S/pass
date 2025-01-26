package com.seb.card.generator.adapter.web.advice;


import com.seb.card.generator.adapter.mapper.DtoMapper;
import com.seb.card.generator.adapter.web.advice.dto.ValidationErrorDto;
import com.seb.card.generator.domain.exception.InvalidDomainCreationException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@org.springframework.web.bind.annotation.RestControllerAdvice
@RequiredArgsConstructor
public class RestControllerAdvice {

    private final DtoMapper mapper;

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(InvalidDomainCreationException.class)
    protected List<ValidationErrorDto> handleIllegalArgumentException(InvalidDomainCreationException exception) {
        return mapper.toDto(exception.getErrors());
    }
}
