package org.example.GroupAnagrams.OptimalSolution;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String word: strs) {
            char[] sortedWord = word.toCharArray();
            Arrays.sort(sortedWord);
            String sortedWordString = new String(sortedWord);

            groups.putIfAbsent(sortedWordString, new ArrayList<String>());
            groups.get(sortedWordString).add(word);
        }
        return new ArrayList(groups.values());
    };
}
