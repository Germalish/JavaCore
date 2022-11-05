package Exersise_5;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Nhập phần tử :" + i);
            arr[i] = new Scanner(System.in).nextInt();
        }
        int[] arrFake = arr;
        sapxep(arrFake);

        for(int k = 0; k <= arr.length; k++){
            if (arrFake[1] == arr[k]){
                System.out.println("Phần tử có giá trị lớn thứ 2 là: " + arrFake[1] + " vị trí tại phần tử : " + k);
            }
        }
    }

    public static void sapxep(int[] arrFake) {
        int temp = arrFake[0];
        for (int i = 0; i < arrFake.length - 1; i++) {
            for (int j = i + 1; j < arrFake.length; j++) {
                if (arrFake[i] < arrFake[j]) {
                    temp = arrFake[j];
                    arrFake[j] = arrFake[i];
                    arrFake[i] = temp;
                }
            }
        }
    }
}
