package Exersise_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 4 số nguyên cần so sánh");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        if (a >= b && a >= c && a >= d) {
            System.out.println("Số lớn nhất là: " + a);
        } else if (b >= c && b >= d) {
            System.out.println("Số lớn nhất là: " + b);
        } else if (c >= d) {
            System.out.println("Số lớn nhất là: " + c);
        } else {
            System.out.println("Số lớn nhất là: " + d);
        }
    }
}
