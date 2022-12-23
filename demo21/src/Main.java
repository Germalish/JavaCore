import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int minI = i;
                if(a[minI] > a[j]){
                    minI = j;
                }
                if(i != minI){
                    int t = a[i];
                    a[i] = a[minI];
                    a[minI] = t;
                }
            }
        }
    }
    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i = 3; i < n; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > t ){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = t;
        }
    }
    public static int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num/10;
        }
        Arrays.sort(arr);
        return arr[0]*10 + arr[2] + arr[1]*10 + arr[3];
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            for (int j = 0; j < nums.length; j++){
                if(t > nums[j]){
                    count[i]++;
                }
            }
        }
        return count;
    }
}