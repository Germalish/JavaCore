package Exersise_11;

import java.util.Scanner;

public class ex3_11 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int tong = 0;
        int tongle = 0;
        int tongchan = 0;
        for(int i = 1; i <= n; i ++){
            tong += i;
        }
        for(int i = 1; i <=n ; i += 2){
            tongle += i;
        }
        for(int i = 0; i <=n ; i += 2){
            tongchan += i;
        }
        System.out.println("S = " + tong);
        System.out.println("S1 = " + tongle);
        System.out.println("S2 = " + tongchan);
    }
}
