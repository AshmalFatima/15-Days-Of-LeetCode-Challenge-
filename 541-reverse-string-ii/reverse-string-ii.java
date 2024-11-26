class Solution {
    public String reverseStr(String s, int k) {
        String reverse = "";
        int l=0;
        while (l<s.length()) {
            String store="";
            
            for (int i = 0; i < k && l<s.length()  ; i++) {
                store = s.charAt(l) + store;
                l++;
            }
            reverse+=store;
            for (int i = 0; i < k && l<s.length(); i++) {
                reverse =  reverse + s.charAt(l);
                l++;
            }

        }
        return reverse;
    }
}