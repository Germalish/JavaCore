package Exersise_7;

import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Nhập phần tử :" + i);
            arr[i] = new Scanner(System.in).nextInt();
        }
        LaMangDoiXung(arr);

    }

    public static void LaMangDoiXung(int[] arrF) {
        int kt = 1;
        for (int i = 0; i < arrF.length; i++) {
            if (arrF[i] != arrF[arrF.length - 1 - i]) {
                kt = 0;
                break;
            }
        }
        if (kt == 0) {
            System.out.println("Ko là mảng đối xứng");
        } else {
            System.out.println("Là mảng đối xứng");
        }
    }
}