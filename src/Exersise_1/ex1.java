package Exersise_1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập b: ");
        float b = Float.parseFloat(sc.nextLine());
        float c = (-b/a);
        String result_a_is_0 = (a == 0 && b!= 0)? "Phương trình vô nghiệm":"Phương trình vô số nghiệm";
        String result = (a!=0)? "Phương trình có nghiệm là: " + c : result_a_is_0;
        System.out.println(result);
    }
}
