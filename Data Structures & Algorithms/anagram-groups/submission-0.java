class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> keyToString = new HashMap<>();

        for (String s : strs) {
            char[] characters = s.toCharArray();

            Arrays.sort(characters);
            String key = String.valueOf(characters);

            if (keyToString.containsKey(key)) {
                keyToString.get(key).add(s);
            } else {
                List<String> strings = new ArrayList<>();
                strings.add(s);

                keyToString.put(key, strings);
            }
        }

        return List.copyOf(keyToString.values());
    }
}
