package Exersise_1;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Student Germalish = new Student();
        System.out.println("Nhập id: ");
        Germalish.id = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên: ");
        Germalish.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập lớp: ");
        Germalish.className = new Scanner(System.in).nextLine();
        System.out.println("Nhập khóa: ");
        Germalish.season = new Scanner(System.in).nextLine();
        System.out.println("Id: " + Germalish.id + "- Họ và tên: " + Germalish.name + "- Lớp: " + Germalish.className + "- Khóa: " + Germalish.season);
    }
}
