package TopInterview150.Array_String;

public class LC_88 {

    public static void main(String[] args) {
        int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = { 1, 2, 3 };
        int m = nums1.length - nums2.length;
        int n = nums2.length;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;
        int y = n - 1;
        int z = m + n - 1;
        while (x >= 0 && y >= 0) {
            if (nums1[x] > nums2[y]) {
                nums1[z] = nums1[x];
                x--;
            } else {
                nums1[z] = nums2[y];
                y--;
            }
            z--;
        }
        for (int i = 0; i <= y; i++) {
            nums1[i] = nums2[i];
        }
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}