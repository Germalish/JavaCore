package Exersise_2;

import java.util.Scanner;

public class ex3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số : ");
        int a = Integer.parseInt(sc.nextLine());
        int n = 0;
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                System.out.println("ước của " + a + " là: " + i);
                n++;
            }
        }
        System.out.println("Có tổng cộng: " + n + " ước");
    }
}
