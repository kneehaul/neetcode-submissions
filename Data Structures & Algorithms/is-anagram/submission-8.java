class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray(); // x x
        char[] tArray = t.toCharArray(); // x

        Map<Character, Integer> sCharCount = buildCharacterCountMap(s); // x : 2
        Map<Character, Integer> tCharCount = buildCharacterCountMap(t); // x : 1

        System.out.println(sCharCount);
        System.out.println(tCharCount);

        if (!sCharCount.keySet().equals(tCharCount.keySet())) {
            System.out.println("keysets not equal");
            return false;
        }

    
        for (Character c : sCharCount.keySet()) {
            if (!tCharCount.keySet().contains(c)) {
                System.out.println("target missing source: " + c);
                return false;
            }

            if (!(sCharCount.get(c).equals(tCharCount.get(c)))) {
                System.out.println("source and target counts don't match for: " + c);
                System.out.println("sCharCount: " + sCharCount.get(c));
                System.out.println("tCharCount: " + tCharCount.get(c));

                return false;
            }
        }

        return true;
    }

    private Map<Character, Integer> buildCharacterCountMap(String str) {
        Map<Character, Integer> output = new HashMap();


        for (Character c : str.toCharArray()) {
            if(!output.containsKey(c)) {
                output.put(c, 1);
            } else {
                output.put(c, output.get(c) + 1);
            }
        }

        return output;
    }
}
