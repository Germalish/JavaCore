package Exersise_4;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int [] arr = new int[n];
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println("Nhập phần tử :" + i);
            arr[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Số cặp phần tử có giá trị giống nhau: ");
        demMang(arr);
    }
    public static void demMang(int [] arr){
        int dem = 0;
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dem ++;
                }
            }
        }
        System.out.println(dem);
    }
}
