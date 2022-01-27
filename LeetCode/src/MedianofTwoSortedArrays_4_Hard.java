public class MedianofTwoSortedArrays_4_Hard {
    //https://leetcode.com/problems/median-of-two-sorted-arrays/ ->Problem
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;
        int[] arr = new int[nums1Length + nums2Length];
        int i = 0, j = 0, x = 0;
        while (i < nums1Length && j < nums2Length) {
            if (nums1[i] <= nums2[j]) {
                arr[x] = nums1[i];
                i++;
                x++;
            } else {
                arr[x] = nums2[j];
                x++;
                j++;
            }
        }
        for (; i < nums1Length; i++) {
            arr[x] = nums1[i];
            x++;
        }
        for (; j < nums2Length; j++) {
            arr[x] = nums2[j];
            x++;
        }
        int arrLength = arr.length;
        if (arrLength % 2 != 0) result = (double) arr[arrLength / 2];
        else {
            result = (double) (arr[(arrLength - 1) / 2] + arr[(arrLength / 2)]) / 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
/*
//Aynı veriyi 2 kere giremediğin için hata oluşuyor
TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums1.length; i++) {
            treeSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            treeSet.add(nums2[i]);
        }
        treeSet.forEach(item -> System.out.println(item));

        Integer[] arr = new Integer[treeSet.size()];
        arr = treeSet.toArray(arr);


        if (arr.length % 2 == 0) {
            return (double) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }

        return (double) (arr[arr.length / 2]);
 */

