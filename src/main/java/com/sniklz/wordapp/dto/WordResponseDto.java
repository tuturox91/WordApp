package com.sniklz.wordapp.dto;

import lombok.Data;

@Data
public class WordResponseDto {

    private Long id;
    private String word;
    private String translatedWord;
}
