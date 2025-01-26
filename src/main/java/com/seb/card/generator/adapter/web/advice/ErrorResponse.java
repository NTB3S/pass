package com.seb.card.generator.adapter.web.advice;

import java.util.List;

public record ErrorResponse(List<ValidationErrorDto> errors) {
}
