package Exersise_3;

import java.util.Scanner;

public class ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 2 số a và b: ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int n1 = a;
        int n2 = b;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.println("ước chung lớn nhất là: " + n1);
        System.out.println("----------------------------------------------");
        System.out.println("Bội số chung nhỏ nhất là: " + (a * b / n1));
    }
}
