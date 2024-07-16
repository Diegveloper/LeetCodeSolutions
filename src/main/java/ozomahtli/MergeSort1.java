package ozomahtli;

public class MergeSort1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] ar = nums1.clone();

        while(i<m && j <n){
            if(ar[i] < nums2[j]){
                nums1[k++] = ar[i++];
            }
            else{
                nums1[k++] = nums2[j++];
            }
        }
        while(i < m){
            nums1[k++] = ar[i++];
        }
        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }
}
