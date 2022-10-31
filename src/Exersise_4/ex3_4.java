package Exersise_4;

import java.util.Scanner;

public class ex3_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("Nhập n:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(n + "số nguyên tố đầu tiên là: ");
        for ( int i = 1 ; i <=n ; ) {
            for ( int j = 2 ; j <= Math.sqrt(b) ; j++ ) {
                if ( b%j == 0 ) {
                    a = 0;
                    break;
                }
            }
            if (a != 0) {
                System.out.println(b);
                i++;
            }
            a = 1;
            b++;
        }
    }
}