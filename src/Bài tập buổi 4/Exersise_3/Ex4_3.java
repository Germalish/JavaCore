package Exersise_3;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int [] arr = new int[n];
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.println("Nhập phần tử :" + i);
            arr[i] = new Scanner(System.in).nextInt();
        }
        sapxep(arr);
        System.out.println("------------------");
        System.out.println("Theo thứ tự tăng dần: ");
        show(arr);

    }
    public static void sapxep(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr){
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print( arr[i] + " ");
        }
    }
    }


