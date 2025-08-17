class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
public void sortColorsBrute(int[] nums) {
    int n = nums.length;
    int[] count = new int[3];

    // Count the number of 0s, 1s, and 2s
    for (int num : nums) {
        count[num]++;
    }

    // Overwrite the original array with sorted values
    int index = 0;
    for (int i = 0; i < count[0]; i++) {
        nums[index++] = 0;
    }
    for (int i = 0; i < count[1]; i++) {
        nums[index++] = 1;
    }
    for (int i = 0; i < count[2]; i++) {
        nums[index++] = 2;
    }
}
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,0,2,1,1,0};
        s.sortColorsBrute(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
