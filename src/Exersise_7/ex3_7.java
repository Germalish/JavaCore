package Exersise_7;

import java.util.Scanner;

public class ex3_7 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Nhập m: ");
        int m = new Scanner(System.in).nextInt();
        for(int i = 1; i <= m; i++){
            for (int j = 1 ; j<= n; j++){
                System.out.print("*   ");
            }
            System.out.println(" ");
        }
    }
}
