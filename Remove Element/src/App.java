class Solution {
    public int removeElement(int[] nums, int val) {
        // int i = 0;
        // int p = 1;
        // int k = nums.length;
        // for (i = 0; i < k; i++) {
        // if (nums[i] == val) {
        // nums[i] = 0;
        // nums[i] = nums[k - p];
        // p++;
        // if (nums[i] == val) {
        // nums[i] = 0;
        // nums[i] = nums[k - p];
        // nums[k - p] = 0;
        // }
        // }
        // }
        // for (int j = 0; j < nums.length; j++) {
        // System.out.print(nums[j] + ",");
        // }
        // return -1;

        // dari gugel
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;

    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        int result = solution.removeElement(nums, val);
        System.out.println(result);
    }
}
