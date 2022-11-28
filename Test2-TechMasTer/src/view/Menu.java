package view;

public class Menu {
    public static void startMenu() {
        System.out.println("Welcome to Yahoo !");
        System.out.println("1.Sign up");
        System.out.println("2.Register");
        System.out.print("Choose: ");
    }

    public static void menuSignupDone() {
        System.out.println("1.Thay đổi username.");
        System.out.println("2.Thay đổi email.");
        System.out.println("3.Thay đổi password.");
        System.out.println("4.Đăng xuất.");
        System.out.println("0.Thoát chương trình.");
        System.out.print("Choose: ");
    }
}
