public class Solution215 {
    private int size;

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 5, 6, 4};
        Solution215 t = new Solution215();
        System.out.println(t.findKthLargest2(a, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, k, 0, nums.length - 1);
    }

    private int findKthLargest(int[] nums, int k, int l, int r) {
        int v = partition(nums, l, r);
        if (v + 1 == k) {
            return nums[v];
        }
        if (v + 1 > k) {
            return findKthLargest(nums, k, l, v - 1);
        }
        return findKthLargest(nums, k, v + 1, r);
    }

    private int partition(int[] nums, int l, int r) {
        int e = nums[l], j = l;
        for (int i = l + 1; i <= r; i++) {
            if (nums[i] >= e) {
                swap(nums, ++j, i);
            }
        }
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int findKthLargest2(int[] nums, int k) {
        int len = nums.length;
        heapfy(nums, len);
        for (int i = len - 1; i >= nums.length - k; i--) {
            swap(nums, 0, i);
            siftDown(nums, i, 0);
        }
        return nums[nums.length - k];
    }

    private void heapfy(int[] nums, int len) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            siftDown(nums, len, i);
        }
    }

    private void siftDown(int[] nums, int len, int siftPoint) {
        int pointValue = nums[siftPoint];
        int j;
        while (siftPoint * 2 + 1 < len) {
            j = siftPoint * 2 + 1;
            if (j + 1 < len && nums[j] < nums[j + 1]) {
                j++;
            }
            if (pointValue >= nums[j]) {
                break;
            }
            nums[siftPoint] = nums[j];
            siftPoint = j;
        }
        nums[siftPoint] = pointValue;
    }
}
