package com.seb.card.generator.adapter.mapper;

import org.mapstruct.Mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface GenericMapper {
    default LocalDate mapOptionalToLocalDate(Optional<LocalDate> optional) {
        return optional.orElse(null);
    }

    default String mapOptionalToString(Optional<LocalDate> optional) {
        return optional.map(DateTimeFormatter.ISO_LOCAL_DATE::format).orElse(null);
    }

    default String mapOptionalToString(LocalDate date) {
        return DateTimeFormatter.ISO_LOCAL_DATE.format(date);
    }

    default Optional<LocalDate> mapOptionalToLocalDate(LocalDate date) {
        return Optional.ofNullable(date);
    }
}
