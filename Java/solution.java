class Solution {
    public int main removeElement(int[] nums, int val) {
        
        int index=0;
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
                
            }
        
        }
        return index;
    }
}