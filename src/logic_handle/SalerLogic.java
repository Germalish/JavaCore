package logic_handle;

import entity.Saler;
import run.MainRun;

import java.util.Scanner;

public class SalerLogic {
    public static int countSaler = 0;
    public static void addSaler() {
        System.out.println("Nhập số lượng nhân viên: ");
        int numSL = new Scanner(System.in).nextInt();
        for (int i = 0; i < numSL; i++) {
            Saler saler = new Saler();
            saler.nhapThongTin();
            saveSaler(saler);
        }
        countSaler += numSL;
    }

    private static void saveSaler(Saler saler) {
        for (int i = 0; i < MainRun.salers.length; i++) {
            if(MainRun.salers[i] == null){
                MainRun.salers[i] = saler  ;
                break;
            }
        }
    }

    public static void showSaler() {
            for (int i = 0; i < MainRun.salers.length; i++) {
                if(MainRun.salers[i] != null){
                    System.out.println(MainRun.salers[i]);
                }
            }
        }
    }

