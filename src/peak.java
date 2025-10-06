public class peak {
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1771949842
    public int peakindexmountain(int[] nums) {
        int start=0;
        int end= nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;

            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

        
    