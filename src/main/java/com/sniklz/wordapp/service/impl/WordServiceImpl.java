package com.sniklz.wordapp.service.impl;

import com.sniklz.wordapp.model.Word;
import com.sniklz.wordapp.repository.WordRepository;
import com.sniklz.wordapp.service.WordService;
import com.sniklz.wordapp.utils.TranslateText;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;

    public WordServiceImpl(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    @Override
    public Word save(Word word) {
        return wordRepository.save(word);
    }

    @Override
    public Word getWordByWord(String word) {
        Word word1 = wordRepository.getWordByWord(word);
        if(word1 != null) {
            return word1;
        } else {
            Word newWord = new Word();
            newWord.setWord(word);
            try {
                TranslateText translateText = new TranslateText();
                String translatedWord = translateText.TranslateCustomText(word);
                newWord.setTranslatedWord(translatedWord);
                save(newWord);
                return newWord;
            } catch (IOException e) {
                throw new RuntimeException("Can't add word");
            }
        }
    }

}
