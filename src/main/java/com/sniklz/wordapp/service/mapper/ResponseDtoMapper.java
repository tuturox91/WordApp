package com.sniklz.wordapp.service.mapper;

public interface ResponseDtoMapper<T, D> {

    T toResponse(D model);
}
