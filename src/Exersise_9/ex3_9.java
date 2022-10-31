package Exersise_9;

import java.util.Scanner;

public class ex3_9 {
    public static void main(String[] args) {
        System.out.println("Nhập h: ");
        int h = new Scanner(System.in).nextInt();
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
