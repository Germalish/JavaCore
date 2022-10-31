package Exersise_5;

import java.util.Scanner;

public class ex3_5 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int messi = 0;
        int a = n;
        int numbertest = 0;
        while (a > 0){
            messi = a % 10;
            numbertest = numbertest * 10 +messi;
            a = a/10;
        }
        if(numbertest == n){
            System.out.println("là số đảo nghịch");
        }
    }
}
