package com.sniklz.wordapp.controller;


import com.sniklz.wordapp.dto.WordResponseDto;
import com.sniklz.wordapp.service.WordService;
import com.sniklz.wordapp.service.mapper.impl.WordMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController {

    private final WordService wordService;
    private final WordMapper wordMapper;

    public WordController(WordService wordService, WordMapper wordMapper) {
        this.wordService = wordService;
        this.wordMapper = wordMapper;
    }

    @GetMapping
    public WordResponseDto getWordByWord(@RequestParam String word) {
        return wordMapper.toResponse(wordService.getWordByWord(word));
    }
}
