package Exersie_4;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày sinh: ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tháng sinh: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập năm sinh: ");
        int year = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(year, month ,day);
        LocalDate now  = LocalDate.now();
        String wasdate = (year > 2022)? "Bạn chưa trào đời" : "Ngày sinh của bạn là " + date;
        System.out.println(wasdate);
        int year_now = now.getYear();
        String result = (year > 2022)? "Bạn chưa trào đời" : "Tuổi của bạn là " + (year_now - year);
        System.out.println(result);
    }
}
