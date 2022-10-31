package Exersise_8;

import java.util.Scanner;

public class ex3_8 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        int j = 1;
        for(int i = 1; i <= m; i++){
            if(i == 1 || i == m){
                for(j = 1; j <= n; j++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for(j = 2;j <= n - 1; j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

