
class Solution {
    public int searchInsert(int[] a, int target) {
        int l = 0, r = a.length - 1, mid, ans = -1;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (a[mid] == target)
                return mid;
            if (a[mid] < target) {
                l = mid + 1;
                ans = mid + 1;
            } else {
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] nums = { 1, 3, 5, 6 };

        int target = 11;
        int result = solution.searchInsert(nums, target);

        System.out.println(result);
    }
}