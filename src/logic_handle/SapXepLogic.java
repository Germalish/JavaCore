package logic_handle;

import java.util.Scanner;

public class SapXepLogic {
    public static void shortMenu() {
        System.out.println("1.Sắp xếp theo tên");
        System.out.println("2.Sắp xếp theo nhóm mặt hàng");
        System.out.println("3.Thoát tính năng sắp xếp");
        int sapXepChoice = new Scanner(System.in).nextInt();
        do {
            if (sapXepChoice > 0 && sapXepChoice <4){
                break;
            }
            System.out.println("Tính năng không hợp lê, nhập lại:");
        }while (true);
        switch (sapXepChoice){
            case 1:
                SalerManangerLogic.sortBySalerName();
                break;
            case 2:
                SalerManangerLogic.sortByProductNumber();
                break;
            case 3:
                System.out.println("Bạn đã thoát tính năng này.");
                return;
        }
    }
}
