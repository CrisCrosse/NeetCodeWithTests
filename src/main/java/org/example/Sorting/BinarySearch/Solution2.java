package org.example.Sorting.BinarySearch;

public class Solution2 {
    public class IterativeSolution {
        public int search(int[] nums, int target) {
            var lowestIndex = 0;
            var maxIndex = nums.length - 1;

            while (lowestIndex <= maxIndex) {
                var middleIndex = lowestIndex + ((maxIndex - lowestIndex) / 2);
                var middleValue = nums[middleIndex];

                if (middleValue == target) return middleIndex;
                if (middleValue < target) {
                    lowestIndex = middleIndex + 1;
                }
                else if (target < middleValue) {
                    maxIndex = middleIndex - 1;
                }
            }
            return -1;
        }
    }
}
