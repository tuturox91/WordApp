package com.sniklz.wordapp.service;

import com.sniklz.wordapp.model.Word;

public interface WordService {

    Word save(Word word);

    Word getWordByWord(String word);
}
