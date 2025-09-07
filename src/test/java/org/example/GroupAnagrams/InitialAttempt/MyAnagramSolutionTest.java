package org.example.GroupAnagrams.InitialAttempt;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAnagramSolutionTest {
    @Test
    void myAnagramSolutionTest() {
        var solution = new MyAnagramSolution();
        var expected = List.of(List.of("hat"), List.of("act", "cat"), List.of("stop", "pots", "tops"));
        String[] input = new String[] {"act","pots","tops","cat","stop","hat"};
        List<List<String>> actual = solution.groupAnagrams(input);
        assertEquals(expected, actual);
    }
}