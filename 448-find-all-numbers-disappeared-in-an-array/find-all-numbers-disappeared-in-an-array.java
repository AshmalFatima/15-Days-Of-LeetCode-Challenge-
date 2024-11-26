class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNums=new ArrayList<Integer>();
        int[] contain=new int[nums.length+1];
        for(int c:nums){
            contain[c]=1;
        }
        for(int i=1 ; i<=nums.length ; i++){
            if(contain[i]!=1){
                missingNums.add(i);
            }
        }
        return missingNums;
    }
}