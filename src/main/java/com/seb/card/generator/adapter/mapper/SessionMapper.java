package com.seb.card.generator.adapter.mapper;

import com.seb.card.generator.adapter.persistence.jpa.session.entity.SessionEntity;
import com.seb.card.generator.domain.model.session.CreateSessionRequest;
import com.seb.card.generator.domain.model.session.Session;
import org.mapstruct.Mapper;
import org.openapitools.model.CreateSessionRequestDto;
import org.openapitools.model.SessionDto;

import java.util.List;

@Mapper(componentModel = "spring", uses = GenericMapper.class)
public interface SessionMapper {

    SessionEntity toEntity(Session session);

    Session toSession(SessionEntity session);

    CreateSessionRequest toModel(CreateSessionRequestDto sessionRequestDto);

    List<CreateSessionRequest> toModel(List<CreateSessionRequestDto> sessionRequestDto);

    SessionDto toDto(Session session);

}
