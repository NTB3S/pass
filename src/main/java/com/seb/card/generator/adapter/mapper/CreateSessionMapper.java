package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import org.mapstruct.Mapper;
import org.openapitools.model.CreateSessionRequestDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CreateSessionMapper {
    CreateSessionRequest toModel(CreateSessionRequestDto sessionRequestDto);

    List<CreateSessionRequest> toModel(List<CreateSessionRequestDto> sessionRequestDto);

}
