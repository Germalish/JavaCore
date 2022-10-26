package Exersise6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int r = Integer.parseInt(sc.nextLine());
        double s = Math.PI * r * r;
        System.out.println("Diện tích hình tròn là: " + s);
    }
}

