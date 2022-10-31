package Exersise_13;

import java.util.Scanner;

public class ex3_13 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        for(int i = 1; i <= n; i++){
            if(i % 7 == 0){
                tong += i;
            }
        }
        System.out.println("Tổng: " + tong);
    }
}
