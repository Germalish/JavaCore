package run;

import entity.Product;
import entity.Saler;
import entity.SalerMananger;
import logic_handle.ProductLogic;
import logic_handle.SalerLogic;
import logic_handle.SalerManangerLogic;
import logic_handle.SapXepLogic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainRun {
    public static Saler[] salers = new Saler[1000];
    public static Product[] products = new Product[1000];
    public static SalerMananger[] salerManangers = new SalerMananger[1000];
    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        menu();
        while (true) {
            System.out.println("Chọn chức năng: ");
            int functionChoice;
            do {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice > 0 && functionChoice < 9) {
                    break;
                }
                System.out.println("Chức năng không hợp lê, hãy nhập lại");
            }
            while (true);
            switch (functionChoice) {
                case 1:
                    SalerLogic.addSaler();
                    break;
                case 2:
                    SalerLogic.showSaler();
                    break;
                case 3:
                    ProductLogic.addProduct();
                    break;
                case 4:
                    ProductLogic.showProduct();
                    break;
                case 5:
                    SalerManangerLogic.addSalerMananger();
                    SalerManangerLogic.showSalerMananger();
                    break;
                case 6:
                    SapXepLogic.shortMenu();
                    break;
                case 7:
                    SalerManangerLogic.calculateSalary();
                    break;
                case 8:
                    System.out.println("Bạn đã thoát chương trình");
                    return;
            }
        }
    }


    private static void menu() {
        System.out.println("------------------Phần Mềm Quản Lý Bán Hàng-----------------------");
        System.out.println("1.Nhập danh sách nhân viên");
        System.out.println("2.In DS nhân viên");
        System.out.println("3.Nhập danh sách mặt hàng");
        System.out.println("4.In DS mặt hàng");
        System.out.println("5.Lập bảng danh sách bán hàng ");
        System.out.println("6.Sắp xếp danh sách bán hàng.");
        System.out.println("7.Lập bảng doanh thu cho nhân viên.");
        System.out.println("8.Thoát chương trình");
    }
}
