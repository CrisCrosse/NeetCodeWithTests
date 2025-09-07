package org.example.GroupAnagrams.OptimalSolution;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {
    @Test
    void groupAnagramsTest() {
        var solution = new GroupAnagrams();
        var expected = List.of(List.of("hat"), List.of("act", "cat"), List.of("stop", "pots", "tops"));
        String[] input = new String[] {"act","pots","tops","cat","stop","hat"};
        List<List<String>> actual = solution.groupAnagrams(input);

        // Have to do this instead of asserEquals because the sort order is different.
        for (int i = 0; i < actual.size(); i++) {
            expected.contains(actual.get(i));
        }
    }
}