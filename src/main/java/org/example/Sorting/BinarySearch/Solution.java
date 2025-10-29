package org.example.Sorting.BinarySearch;


class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
    public int binarySearch(int lowestIndex, int maxIndex, int[] nums, int target) {
        if (lowestIndex > maxIndex) return -1;
        int middleIndex = lowestIndex + (maxIndex - lowestIndex) / 2;

        var middleValue = nums[middleIndex];
        if (middleValue == target) return middleIndex;

        if (middleValue > target) {
            return binarySearch(lowestIndex, middleIndex - 1, nums, target);
        } else {
            return binarySearch(middleIndex + 1, maxIndex, nums, target);
        }
    }
}
