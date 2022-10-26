package Exersise_3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập chiều rộng: ");
        float b = Float.parseFloat(sc.nextLine());
        float p = 2 * (a + b);
        float s = 1/2F * a * b;
        System.out.println("Chu vi: " + p);
        System.out.println("Diện tích: " + s);
    }
}
