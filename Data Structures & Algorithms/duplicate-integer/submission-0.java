class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenBefore = new HashSet();

        for (int num : nums) {
            if (seenBefore.contains(num)) {
                return true;
            }

            seenBefore.add(num);
        }

        return false;
    }
}