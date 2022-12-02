package view;

import java.util.Scanner;

public class Menu {
    public static void startMenu() {
        System.out.println("Welcome to RikVip !");
        System.out.println("1.Đăng nhập");
        System.out.println("2.Đăng ký");
        System.out.print("Choose: ");
    }

    public static void manHinhCaiDat() {
        System.out.println("1.Thay đổi username.");
        System.out.println("2.Thay đổi email.");
        System.out.println("3.Thay đổi password.");
        System.out.println("4.Thoát chế độ.");
        System.out.print("Chọn: ");
    }
    public static void manHinhTrongGame(){
        System.out.println("1.Tài xỉu.");
        System.out.println("2.Rút tiền.");
        System.out.println("3.Nạp tiền.");
        System.out.println("4.Vòng quay may mắn.");
        System.out.println("5.Thông tin cá nhân.");
        System.out.println("6.Đăng xuất.");
        System.out.print("Choose: ");
    }
    public static void taiHayXiu(){
        System.out.println("Chúc bạn may mắn:");
        System.out.println("1.Tài          2.Xỉu         3.Thoát");
        System.out.print("Chọn: ");
    }
}
