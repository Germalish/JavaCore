package Exersise_10;

import java.util.Scanner;

public class Ex4_10 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử: ");
        int n = new Scanner(System.in).nextInt();
        int [] a = new int[n];
        int temp;
        for(int i = 0; i < n; i++){
            System.out.println("Nhập phần tử: " + i);
            temp = new Scanner(System.in).nextInt();
            if (kiemtra(a, n, temp) == true){
                System.out.println("Bị lặp giá trị, hãy nhập lại.");
                i --;
            }
            else {
                a[i] = temp;
            }
        }
        show(a);

    }
    public static boolean kiemtra(int [] a, int n, int value){
        for(int i = 0; i < n; i++){
            if(a[i] == value){
                return true;
            }
        }
        return false;
    }
    public static void show(int [] a){
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++){
            System.out.print( a[i] + " ");
        }
        System.out.println("]");
    }
}
