package org.example.TopKFrequent.InitialAttempt;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void topKFrequentTest1() {
        Solution solution = new Solution();
        var actual = solution.topKFrequent(new int[]{1,2,2,3,3,3}, 2);
        var expected = new int[]{2,3};

        assertArrayEquals(Arrays.stream(expected).sorted().toArray(), Arrays.stream(actual).sorted().toArray());
    }
}