package LogicHandle;

import entity.Member;
import run.Main;
import view.Menu;

import java.util.Scanner;

public class SignUpAction {
    public static void signUp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tài khoản: ");
        String userName = sc.nextLine();

        String password;
        String input;
        while (true) {
            System.out.println("Nhập mật khẩu: ");
            input = new Scanner(System.in).nextLine();
            if (MemberAction.checkValidPassword(input)) {
                password = input;
                break;
            } else {
                System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
            }
        }


        boolean isCorrectUserName = false, isCorrectPassWord = false;
        for (Member member : Main.members) {
            if (member.getUserName().equals(userName) && member.getPassWord().equals(password)) {
                isCorrectUserName = true;
                isCorrectPassWord = true;
                if (isCorrectUserName && isCorrectPassWord) {
                    System.out.println("Chào mừng " + member.getUserName() + ", bạn có thể thực hiện các công việc sau:");
                    Menu.menuSignupDone();
                    while (true) {
                        System.out.println("Chọn chức năng: ");
                        int functionChoice;
                        do {
                            functionChoice = new Scanner(System.in).nextInt();
                            if (functionChoice >= 0 && functionChoice < 5) {
                                break;
                            }
                            System.out.println("Chức năng không hợp lê, hãy nhập lại");
                        }
                        while (true);
                        switch (functionChoice) {
                            case 1:
                                System.out.println("Nhập username  mới: ");
                                String username = sc.nextLine();
                                member.setUserName(username);
                                break;
                            case 2:
                                System.out.println("Nhập email mới: ");
                                String input1;
                                String regex;
                                String email;
                                while (true) {
                                    System.out.print("Nhập Email: ");
                                    input1 = new Scanner(System.in).nextLine();
                                    if (MemberAction.checkValidEmail(input1)) {
                                        email = input1;
                                        break;
                                    } else {
                                        System.out.println("Email không hợp lệ, hãy nhập lại.");
                                    }
                                }
                                member.setEmail(email);
                                break;
                            case 3:
                                System.out.println("Nhập mật khẩu mới: ");
                                String password1;
                                String input2;
                                while (true) {
                                    System.out.println("Nhập mật khẩu: ");
                                    input2 = new Scanner(System.in).nextLine();
                                    if (MemberAction.checkValidPassword(input2)) {
                                        password1 = input2;
                                        break;
                                    } else {
                                        System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
                                    }
                                }
                                member.setPassWord(password1);
                                break;
                            case 4:
                                Main.signUpOrRegister();
                                break;
                            case 5:
                                System.out.println("Đã thoát chương trình");
                                return;
                        }
                    }
                }
                break;
            } else if (member.getUserName().equals(userName) && !member.getPassWord().equals(password)) {
                isCorrectUserName = true;
                isCorrectPassWord = false;
            System.out.println("Mật khẩu không chính xác");
            System.out.println("1.Đăng nhập lại.");
            System.out.println("2.Quên mật khẩu.");
            System.out.print("Chọn chức năng: ");
            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice > 0 && functionChoice < 3) {
                    break;
                }
                System.out.println("Chức năng không hợp lê, hãy nhập lại");
            } while (true);
            switch (functionChoice) {
                case 1:
                    Main.signUpOrRegister();
                    break;
                case 2:
                    forgotPassword();
                    break;
            }
            break;
        }
        }
        if ((!isCorrectUserName && !isCorrectPassWord || !isCorrectUserName && isCorrectPassWord)) {
            System.out.println("Kiểm tra lại username");
            System.out.println("Tài khoản không tồn tại, hãy đăng ký tài khoản.");
            Main.signUpOrRegister();
        }
    }


    private static void forgotPassword() {
        String input1;
        String regex;
        String email;
        while (true) {
            System.out.print("Nhập Email: ");
            input1 = new Scanner(System.in).nextLine();
            if (MemberAction.checkValidEmail(input1)) {
                email = input1;
                break;
            } else {
                System.out.println("Email không hợp lệ, hãy nhập lại.");
            }
        }
        boolean isCorrectEmail = false;
        for (Member member : Main.members) {
            if (member.getEmail().equals(email)) {
                isCorrectEmail = true;

                String newPassword;
                String input;
                while (true) {
                    System.out.println("Nhập mật khẩu mới: ");
                    input = new Scanner(System.in).nextLine();
                    if (MemberAction.checkValidPassword(input)) {
                        newPassword = input;
                        break;
                    } else {
                        System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
                    }
                }
                member.setPassWord(newPassword);
                System.out.println("Đổi mật khẩu thành công");
                break;
            }
        }if (!isCorrectEmail){
            System.out.println("Tài khoản không tồn tại.");
            Main.signUpOrRegister();
        }
    }
}
