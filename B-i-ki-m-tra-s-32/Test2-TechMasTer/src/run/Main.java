package run;

import LogicHandle.MemberAction;
import LogicHandle.DangNhapGameOke;
import entity.Member;
import view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Integer> trungThuong = new ArrayList<>(Arrays.asList(1,1,1,2,3,3,3,3,3,3,3));
//    Tạo mảng chứa các trường hợp xảy ra
    public static ArrayList<Integer> xucXac = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18));
    public static void main(String[] args) {
        manHinhChinh();
    }

    public static void manHinhChinh() {
        while (true){
                try {
                    Menu.startMenu();
                    int functionChoice = new Scanner(System.in).nextInt();
                    switch (functionChoice) {
                        case 1:
                            DangNhapGameOke.signIn();
                            break;
                        case 2:
                            MemberAction action1 = new MemberAction();
                            Scanner sc1 = new Scanner(System.in);
                            Member member = action1.dangKy(sc1);
                            members.add(member);
                            System.out.println(members);
                            break;
                        default:
                            System.out.println("Chức năng không hợp lệ");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("Chức năng phải là số");
                }
            }
        }
    }

