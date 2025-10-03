package org.example.TopKFrequent.InitialAttempt;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> elementFrequencyMap = new HashMap<>();
        // List kMostFrequentElements = new ArrayList(k);
        // Integer lowestFrequencyToBeInK = 0;

        for (int num : nums) {
            Integer currentNumFrequency = elementFrequencyMap.getOrDefault(num, 0);
            Integer newNumFrequency = currentNumFrequency + 1;
            elementFrequencyMap.put(num, newNumFrequency);
        }

        var result = elementFrequencyMap
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();

        return result;


            //
            // // Check number of things in kMostFrequent elements,
            // // if less than k, add element
            // // if more than k, and current frequency
            // if (kMostFrequentElements.size() < k) {
            //     kMostFrequentElements.add(num);
            // } else {
            //     if (lowestFrequencyToBeInK < newNumFrequency) {
            //         kMostFrequentElements.remove(lowestFrequencyToBeInK);
            //         kMostFrequentElements.add(num);
            //     }
            // }

        }
        // return new RuntimeException();

}
