class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return ""; // No strings, return ""

        String prefix = strs[0]; // Start with the first string

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) { // Check if prefix matches
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten prefix
                if (prefix.isEmpty()) return ""; // No common prefix
            }
        }
        return prefix; 
    }
}