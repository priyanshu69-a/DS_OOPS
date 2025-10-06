public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {23,54,3,22,67,87,65};
        int target =22;
        int ans=sort(nums, target);
        System.out.println(ans);

    }
//    search in the array: return the index if item found
// if item not found return -1
    static int sort(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
//        run for a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
//        this line will execute if none above statements have been executed
//        hence the target has not been found
        return -1;

    }
}
