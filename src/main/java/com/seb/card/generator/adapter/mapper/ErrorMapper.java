package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.web.advice.dto.ValidationErrorDto;
import com.seb.card.generator.domain.exception.ValidationError;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ErrorMapper {
    List<ValidationErrorDto> toDto(List<ValidationError> validationError);
}
