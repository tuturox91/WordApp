package com.sniklz.wordapp.service.mapper.impl;

import com.sniklz.wordapp.dto.WordRequestDto;
import com.sniklz.wordapp.dto.WordResponseDto;
import com.sniklz.wordapp.model.Word;
import com.sniklz.wordapp.service.mapper.RequestDtoMapper;
import com.sniklz.wordapp.service.mapper.ResponseDtoMapper;
import org.springframework.stereotype.Component;

@Component
public class WordMapper implements
        RequestDtoMapper<WordRequestDto, Word>,
        ResponseDtoMapper<WordResponseDto, Word> {

    @Override
    public Word toModel(WordRequestDto requestDto) {
        Word word = new Word();
        word.setWord(requestDto.getWord());
        word.setTranslatedWord(requestDto.getTranslatedWord());
        return word;
    }

    @Override
    public WordResponseDto toResponse(Word model) {
        WordResponseDto responseDto = new WordResponseDto();
        responseDto.setId(model.getId());
        responseDto.setWord(model.getWord());
        responseDto.setTranslatedWord(model.getTranslatedWord());
        return responseDto;
    }
}
