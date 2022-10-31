package Exersise_6;

import java.util.Scanner;

public class ex3_6 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên: ");
        int num = new Scanner(System.in).nextInt();
        int messi;
        int tong = 0;
        while (num > 0){
            messi = num % 10;
            num = num/10;
            tong += messi;
        }
        System.out.println("Tổng: " + tong);
    }
}
