package Exersise_15;

import java.util.Scanner;

public class ex3_15 {
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
        if(n1 == 1){
            System.out.println("là cặp SNT");
        }
        else {
            System.out.println("ko là cặp SNT");
        }
    }
}
