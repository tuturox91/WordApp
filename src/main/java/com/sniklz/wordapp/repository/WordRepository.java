package com.sniklz.wordapp.repository;

import com.sniklz.wordapp.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {
    Word getWordByWord(String word);
}
