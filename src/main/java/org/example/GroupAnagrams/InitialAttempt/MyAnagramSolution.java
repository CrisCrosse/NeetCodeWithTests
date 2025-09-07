package org.example.GroupAnagrams.InitialAttempt;

import java.util.*;

public class MyAnagramSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Word[] words = Arrays.stream(strs).map(word -> new Word(word)).toArray(Word[]::new);

        var result = new Hashtable<Dictionary, List<String>>();
        for (var word : words) {
            Dictionary key = word.getDictionary();
            var groupAnagrams = result.get(key);
            if (groupAnagrams == null) {
                var newList = new ArrayList<String>();
                newList.add(word.getWord());
                result.put(key, newList);
            } else {
                groupAnagrams.add(word.getWord());
                result.put(key, groupAnagrams);
            }
        }
        var actualResult = new ArrayList<List<String>>();
        for (var anagrams : result.values()) {
            actualResult.add(anagrams);
        }
        return actualResult;
    }
}
