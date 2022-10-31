package Exersise_12;

import java.util.Scanner;

public class ex3_12 {
    public static void main(String[] args) {
        System.out.println("Nhập m: ");
        int m  = new Scanner(System.in).nextInt();
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        System.out.println("Các số chính phương trong khoảng: ");
        for(int i = m; i <= n; i++){
            double a = Math.sqrt(i);
            if(a % 2 == 0 || a % 3 ==  0 || a % 5 ==  0|| a % 7 ==  0){
                System.out.println(i);
                count += 1;
            }
        }
        System.out.println("Có: " + count + " số chính phương");
    }
}
