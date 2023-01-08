package com.sniklz.wordapp.service.mapper;

public interface RequestDtoMapper<T, D> {
    D toModel(T requestDto);
}
