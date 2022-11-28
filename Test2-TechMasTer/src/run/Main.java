package run;

import LogicHandle.MemberAction;
import LogicHandle.SignInAction;
import entity.Member;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static void main(String[] args) {
        signUpOrRegister();
    }

    public static void signUpOrRegister() {
        while (true){
                try {
                    Menu.startMenu();
                    int functionChoice;
                    do {
                        functionChoice = new Scanner(System.in).nextInt();
                        if (functionChoice > 0 && functionChoice < 3) {
                            break;
                        }
                        System.out.println("Chức năng không hợp lê, hãy nhập lại");
                    }
                    while (true);
                    switch (functionChoice) {
                        case 1:
                            SignInAction.signUp();
                            break;
                        case 2:
                            MemberAction action1 = new MemberAction();
                            Scanner sc1 = new Scanner(System.in);
                            Member member = action1.inputMember(sc1);
                            members.add(member);
                            System.out.println(members);
                            break;
                    }
                }catch (Exception e){
                    System.out.println("Chức năng phải là số");
                }
            }
        }
    }

