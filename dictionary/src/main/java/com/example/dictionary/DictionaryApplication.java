package com.example.dictionary.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DictionaryService {

    private List<String> words;

    public List<String> getWordsStartingWith(String value) {
        return words.stream()
                    .filter(word -> word.startsWith(value))
                    .collect(Collectors.toList());
    }
    public List<String> getWordsEndingWith(String value) {
        return words.stream()
                    .filter(word -> word.endsWith(value))
                    .collect(Collectors.toList());
    }
}
