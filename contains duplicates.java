import java.util.Arrays;

//contains duplicates leet code easy
//input : nums=[1,2,3,1] output true
//input : nums=[1,2,3,4] output false
//input : nums=[1,1,1,3,3,4,3,2,4,2] output true
class solution {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 1 };
        int nums2[] = { 1, 2, 3, 4 };
        int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(containsDup(nums1));
        System.out.println(containsDup(nums2));
        System.out.println(containsDup(nums3));
    }

    public static boolean containsDup(int[] nums) {
        Arrays.sort(nums);//sorting array so values would be {1,1,2,3} so I only have to check neighbor values
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            } else
                return false;
        }
        return false;

    }

   
}