import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
//    bài 1
public int removeElement(int[] nums, int val) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            nums[count++] = nums[i];
        }
    }
    return count;
}
//bài 2
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n -1;
    while(i >= 0 && j >= 0){
        if(nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            k--;
            i--;
        }
        else{
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
    while(j >= 0){
        nums1[k] = nums2[j];
        k--;
        j--;
    }
}
//bài 3
public int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int ans[]=new int[2*n];
    for(int i = 0; i < n; i++){
        ans[i] = nums[i];
        ans[i + n] = nums[i];
    }
    return ans;
}
}
