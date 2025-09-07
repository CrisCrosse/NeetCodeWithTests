package org.example.GroupAnagrams.InitialAttempt;

import java.util.Dictionary;
import java.util.Hashtable;

public class Word {
    private final String word;
    private final Dictionary dictionary;

    public Word(String word) {
        this.word = word;
        this.dictionary = createDictionaryFromWord(word);
    }

    private Dictionary createDictionaryFromWord(String word) {
        Dictionary<Character, Integer> characterCount = new Hashtable<>();
        for (char c : word.toCharArray()) {
            var count = characterCount.get(c);
            if (count == null) {
                characterCount.put(c, 1);
            } else {
                characterCount.put(c, characterCount.get(c) + 1);
            }
        }
        return characterCount;
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public String getWord() {
        return word;
    }
}
