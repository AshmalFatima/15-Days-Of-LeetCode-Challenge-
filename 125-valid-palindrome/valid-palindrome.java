class Solution {
    public boolean isPalindrome(String s) {
        String original="";
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                original+=c;
            }
        }
        original=original.toLowerCase();
        String result="";
        for(int i=original.length()-1 ; i>=0 ; i--){
            result+=original.charAt(i);
        }
       return original.equals(result);
    }
}