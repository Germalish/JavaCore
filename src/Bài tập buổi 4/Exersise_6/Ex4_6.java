package Exersise_6;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập c: ");
        int c = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Nhập phần tử :" + i);
            arr[i] = new Scanner(System.in).nextInt();
        }
        tinhTB(b, arr, c);
    }
    public static void tinhTB(int b, int[] arr, int c){
        int dem = 0;
        int area = 0;
        for (int i = 0; i <= arr.length - 1; i++){
            if(arr[i] >= b && arr[i] <= c){
                area += arr[i];
                dem ++;
            }
            else {
                System.out.println("Không có phần tử nằm trong khoảng");
            }
        }
        System.out.println("Kết quả: " + area/dem);
    }
}
