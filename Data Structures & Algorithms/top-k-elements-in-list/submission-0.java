class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numToCount = new HashMap<>();
        PriorityQueue<int[]> numToCountHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int n : nums) {
            if(numToCount.containsKey(n)) {
                numToCount.put(n, numToCount.get(n) + 1);
            } else {
                numToCount.put(n, 1);
            }
        }

        numToCount
                .entrySet()
                .forEach(entry -> numToCountHeap.offer(new int[]{entry.getKey(), entry.getValue()}));


        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numToCountHeap.poll()[0];
        }
        
        return result;
    }
}
