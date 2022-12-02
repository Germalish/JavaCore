package LogicHandle;

import constain.Regex;
import entity.Member;
import run.Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MemberAction {


    public Member dangKy(Scanner scanner) {
        String userName;
        while (true) {
            System.out.print("Nhập tên đăng nhập: ");
            userName = scanner.nextLine();
            boolean usernameExisted = false;
            for (Member member : Main.members) {
                if (member.getUserName().equals(userName)) {
                    usernameExisted = true;
                    break;
                }
            }
            if (!usernameExisted) {
                break;
            }
            System.out.println("Tên đăng nhập đã tồn tại, hãy tạo lại");
        }


        String password;
        String input;
        while (true) {
            System.out.print("Nhập mật khẩu: ");
            input = scanner.nextLine();
            if (checkValidPassword(input)) {
                password = input;
                break;
            } else {
                System.out.println("Mật khẩu dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;). Hãy nhập lại");
            }
        }


        String input1;
        String email;
        while (true) {
            boolean emailExisted = false;
            System.out.print("Nhập Email: ");
            input1 = scanner.nextLine();
            for (Member member : Main.members) {
                if (member.getEmail().equals(input1)) {
                    emailExisted = true;
                    break;
                }
            }
            if (!emailExisted) {
                break;
            }
            System.out.println("Email này đã được sử dụng, hãy thử lại.");
        }
        while (true) {
            if (checkValidEmail(input1)) {
                email = input1;
                break;
            } else {
                System.out.println("Email không hợp lệ, hãy nhập lại.");
            }
        }

        return new Member(userName, password, email);
    }

    public static boolean checkValidEmail(String email) {
        Pattern pattern = Pattern.compile(Regex.EMAIL_REGEX);
        if (pattern.matcher(email).find()) {
            return true;
        } else {
            return false;
        }

    }


    public static boolean checkValidPassword(String password) {
        Pattern pattern = Pattern.compile(Regex.PASSWORD_REGEX_UPPER);
        Pattern pattern1 = Pattern.compile(Regex.PASSWORD_REGEX_DOWNER);
        Pattern pattern2 = Pattern.compile(Regex.PASSWORD_REGEX_DOWNER);
        Pattern pattern3 = Pattern.compile(Regex.PASSWORD_REGEX_SPECIAL);
        if (pattern.matcher(password).find() && pattern1.matcher(password).find() && pattern2.matcher(password).find() && pattern3.matcher(password).find()
                && password.length() >= 7 && password.length() <= 15) {
            return true;
        } else {
            return false;
        }

    }
    public static void napTien(Scanner scanner, Member member) {
        System.out.print("Nhập số tiền muốn nap: ");
        int money = scanner.nextInt();
        System.out.print("Điền mã giao dịch: ");
        int maGiaoDich = scanner.nextInt();
        System.out.println("Bạn đã nạp thành công: " + money + "$");
        member.setMoney(money);
    }

}
