package LogicHandle;

import entity.Member;
import run.Main;
import view.Menu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DangNhapGameOke {
    public static int tongCuoc = 0;
    public static int soLanQuay = 1;
    public static void signIn() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tài khoản: ");
        String userName = sc.nextLine();

        String password;
        String input;
        while (true) {
            System.out.print("Nhập mật khẩu: ");
            input = sc.nextLine();
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
                    System.out.println("******************* TÀI XỈU CHƠI LÀ THẮNG *******************");
                    System.out.println("Chào mừng " + member.getUserName() + ", bạn có thể thực hiện các tính năng sau:");
                    while (true) {
                        Menu.manHinhTrongGame();
                        System.out.print("Chọn chức năng: ");
                        int functionChoice = sc.nextInt();
                        switch (functionChoice) {
                            case 1:
                                while (true) {
                                    Menu.taiHayXiu();
                                    int choice = sc.nextInt();
                                    if (choice == 3) {
                                        System.out.println("Bạn đã thoát Game!");
                                        break;
                                    }
                                    System.out.print("Nhập tiền cược: ");
                                    int tienCuoc = sc.nextInt();
                                    if (tienCuoc < 0){
                                        System.out.println("Tiền cược không được âm.");
                                        continue;
                                    }
                                    else if (tienCuoc > member.getMoney()) {
                                        System.out.println("Vượt số tiền bạn có, hãy nạp thêm");
                                        continue;
                                    }else if (member.getMoney() < 0) {
                                        System.out.println("Bạn cần phải nạp thêm tiền để chơi tiếp.");
                                        continue;
                                    }
                                    else if (tienCuoc > 0 && member.getMoney() > 0 && tienCuoc <= member.getMoney() && choice > 0 && choice < 3) {
                                        taiXiu( tienCuoc, choice, member);
                                        tongCuoc += tienCuoc;
                                    }
                                    System.out.println("Số tiền của bạn: " + member.getMoney());
                                }
                                break;
                            case 2:
                                rutTien(sc, member);
                                break;
                            case 3:
                                MemberAction.napTien(sc, member);
                                break;
                            case 4:
                                vongQuayMayMan(member);
                                break;
                            case 5:
                                System.out.println(member);
                                Menu.manHinhCaiDat();
                                int choice2 = sc.nextInt();
                                switch (choice2) {
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
                                        break;
                                }
                                break;
                            case 6:
                                System.out.println("Bạn đã thoát game, hẹn gặp lại !");
                                return;
                            default:
                                System.out.println("Chức năng không hợp lệ");
                                break;
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
                int functionChoice = sc.nextInt();
                switch (functionChoice) {
                    case 1:
                        Main.manHinhChinh();
                        break;
                    case 2:
                        forgotPassword();
                        break;
                    default:
                        System.out.println("Chức năng không hợp lệ");
                        break;
                }
                break;
            }
        }
        if ((!isCorrectUserName && !isCorrectPassWord || !isCorrectUserName && isCorrectPassWord)) {
            System.out.println("Kiểm tra lại username");
            System.out.println("Tài khoản không tồn tại, hãy đăng ký tài khoản.");
            Main.manHinhChinh();
        }
    }

    private static void vongQuayMayMan(Member member) {
        System.out.println("Bạn sẽ tham gia vòng quay may mắn nếu tổng cược đạt 1000$");
        System.out.println("Chỉ áp dụng 1 lần trong ngày");
        Random random = new Random();
        int check = Main.trungThuong.get(random.nextInt(Main.trungThuong.size()));
        if (soLanQuay>1) {
            System.out.println("Bạn đã hết lượt tham gia!");
        }else if (tongCuoc >= 1000){
            if (check == 1){
                System.out.println("Chúc mừng bạn đã được thưởng 10$");
                member.setMoney(member.getMoney() + 10);
                soLanQuay += 1;
            } else if (check == 2) {
                System.out.println("Chúc mừng bạn đã được thưởng 20$");
                member.setMoney(member.getMoney() + 20);
                soLanQuay += 1;
            }
            else {
                System.out.println("Chúc bạn may mắn lần sau");
                soLanQuay += 1;
            }
        } else {
            System.out.println("Tổng tiền cược không đủ, hãy chơi tiếp");
        }
    }

    private static void rutTien(Scanner scanner, Member member) {
        System.out.print("Nhập số tiền muốn rút: ");
        int rut = scanner.nextInt();
        if (rut <= member.getMoney()){
            member.setMoney(member.getMoney() - rut);
        } else if (rut > member.getMoney()) {
            System.out.println("Tài khoản của bạn không đủ");
        }
    }

    private static void taiXiu(int tienCuoc, int choice, Member member) {
        Random random = new Random();
        int ketQua = Main.xucXac.get(random.nextInt(Main.xucXac.size()));
        if (choice == 1 && ketQua >= 11) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Chúc mừng bạn đã thắng: " + tienCuoc+ "$");
            member.setMoney(member.getMoney() + tienCuoc);
        } else if (choice == 2 && ketQua >= 11) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Bạn đã thua: " + tienCuoc + "$");
            System.out.println("Hãy tiếp tục, còn thở còn gỡ");
            member.setMoney(member.getMoney() - tienCuoc);
        } else if (choice == 1 && ketQua <= 10) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Bạn đã thua: " + tienCuoc+ "$");
            System.out.println("Hãy tiếp tục, còn thở còn gỡ");
            member.setMoney(member.getMoney() - tienCuoc);
        } else if (choice == 2 && ketQua <= 10) {
            System.out.println("Kết quả xúc xắc: " + ketQua);
            System.out.println("Chúc mừng bạn đã thắng: " + tienCuoc+ "$");
            member.setMoney(member.getMoney() + tienCuoc);
        }
    }

    private static void forgotPassword() {
        String input1;
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
        }
        if (!isCorrectEmail) {
            System.out.println("Tài khoản không tồn tại.");
            Main.manHinhChinh();
        }
    }
}
