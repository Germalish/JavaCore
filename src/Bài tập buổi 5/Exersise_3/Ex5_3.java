package Exersise_3;

import java.util.Scanner;

public class Ex5_3 {
    public static void main(String[] args) {
        Rectange rectange = new Rectange();
        System.out.println("Nhập chiều dài HCN: ");
        double height = new Scanner(System.in).nextDouble();
        rectange.setHeight(height);
        System.out.println("Nhập chiều rộng HCN: ");
        double width = new Scanner(System.in).nextDouble();
        rectange.setWidth(width);
        System.out.println("Nhập màu HCN: ");
        String color = new Scanner(System.in).nextLine();
        rectange.setColor(color);
        System.out.println("Hình chữ nhật có: " + " chiều dài: " + rectange.getHeight() + " - chiều rộng: " + rectange.getWidth() + "- màu: " + rectange.getColor());
        System.out.println("Chu vi: " + rectange.findPerimeter() + " / Diện tích: " + rectange.findArea());

    }
}
