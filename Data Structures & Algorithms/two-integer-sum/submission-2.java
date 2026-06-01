class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueToIndex = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            int desiredValue = target - nums[i];
            
            if (valueToIndex.containsKey(desiredValue)) {
                return new int[]{valueToIndex.get(target - nums[i]), i};
            }

            valueToIndex.put(nums[i], i);
        }

        throw new RuntimeException();
    }
}
