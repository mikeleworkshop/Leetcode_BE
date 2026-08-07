class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        
        Set<Character> set = new HashSet<Character>();
        int checkpoint = 0;
        int result = 1;
        for (int i = checkpoint; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                result = Math.max(result, set.size());
            } else {
                result = Math.max(result, set.size());
                
                checkpoint = checkpoint + 1;
                i = checkpoint - 1;
                set.clear();
            }
        }

        return result;

    }
}
