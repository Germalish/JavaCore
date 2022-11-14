package logic_handle;

import entity.Product;
import entity.Saler;
import entity.SalerMananger;
import entity.SalerManangerDetail;
import run.MainRun;

import java.util.Scanner;

public class SalerManangerLogic {
    public static void addSalerMananger() {
        System.out.println("Nhập số lượng nhân viên cho Bảng danh sách bán hàng: ");
        int numberNV;
        if (!checkSalerAndProduct()){
            System.out.println("Chưa có dữ liệu, hãy nhập dữ liệu rồi quay lại.");
            return;
        }
        do {
            numberNV = new Scanner(System.in).nextInt();
            if(numberNV > 0 && numberNV <= SalerLogic.countSaler){
                break;
            }
            System.out.println("Số lượng không hợp lệ, hãy nhập lại: ");
        }while (true);
        for (int i = 0; i < numberNV; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.print("Nhập ID: ");
            int idSaler;
            Saler saler = null;
            do {
                idSaler = new Scanner(System.in).nextInt();
                for (int j = 0; j < MainRun.salers.length; j++) {
                    if(MainRun.salers[j] != null && MainRun.salers[j].getId() == idSaler){
                        saler = MainRun.salers[j];
                        break;
                    }
                    }
                if (saler == null){
                    System.out.println("ID của nhân viên không hợp lệ, nhập lại: ");
                    continue;
                }
                boolean daNhapNhanVienNayHayChua = false;
                for (int k = 0; k < MainRun.salerManangers.length; k++) {
                    if (MainRun.salerManangers[k] != null && MainRun.salerManangers[k].getSaler().getId() == idSaler){
                        daNhapNhanVienNayHayChua = true;
                        break;
                    }
                }
                if (!daNhapNhanVienNayHayChua){
                    break;
                }
                System.out.println("ID này đã bị trùng, nhập lại: ");
            }while (true);
            System.out.println("Nhập số loại hàng mà nhân viên " + (i + 1) + " bán được: ");
            int numberProduct;
            do {
                numberProduct = new Scanner(System.in).nextInt();
                if(numberProduct > 0 && numberProduct <= 5 && numberProduct <= ProductLogic.countProduct){
                    break;
                }
                System.out.println("Số lượng không hợp lệ, hãy nhập lại: ");
            }while (true);
            int count = 0;
                SalerManangerDetail[] salerManangerDetails = new SalerManangerDetail[numberProduct];
            for (int j = 0; j < numberProduct; j++) {
                System.out.println("Nhập ID loại hàng thứ" + (j+1));
                int PrdID;
                Product product = null;
                do {
                    PrdID = new Scanner(System.in).nextInt();
                    for (int k = 0; k < MainRun.products.length; k++) {
                        if(MainRun.products[k] != null && MainRun.products[k].getId() == PrdID){
                            product = MainRun.products[k];
                            break;
                        }
                    }
                    if (product == null){
                        System.out.println("ID của sản phẩm không hợp lệ, nhập lại: ");
                        continue;
                    }
                    boolean daNhapLoaiHangNayHayChua = false;
                    for (int k = 0; k < salerManangerDetails.length; k++) {
                        if (salerManangerDetails[k] != null && salerManangerDetails[k].getProduct().getId() == PrdID){
                            daNhapLoaiHangNayHayChua = true;
                            break;
                        }
                    }
                    if (!daNhapLoaiHangNayHayChua){
                        break;
                    }
                    System.out.println("ID này đã bị trùng, nhập lại: ");
                }while (true);
                System.out.println("Nhập số lượng cho loại hàng thứ "+ (j+1));
                int soLuong = new Scanner(System.in).nextInt();

                salerManangerDetails[count] = new SalerManangerDetail(product, soLuong);
                count++;
            }
            SalerMananger salerMananger = new SalerMananger(saler, salerManangerDetails);
            saveSalerMananger(salerMananger);
        }

}

    private static void saveSalerMananger(SalerMananger salerMananger) {
        for (int i = 0; i < MainRun.salerManangers.length; i++) {
            if (MainRun.salerManangers[i] == null) {
                MainRun.salerManangers[i] = salerMananger;
                break;
            }
        }
    }

    private static boolean checkSalerAndProduct() {
        boolean isValidProduct = false;
        for (int i = 0; i < MainRun.products.length; i++) {
            if (MainRun.products[i] != null) {
                isValidProduct = true;
                break;
            }
        }

        boolean isValidSaler = false;
        for (int i = 0; i < MainRun.salers.length; i++) {
            if (MainRun.salers[i] != null) {
                isValidSaler = true;
                break;
            }
        }
        return isValidProduct && isValidSaler;

    }

    public static void showSalerMananger() {
        for (int i = 0; i < MainRun.salerManangers.length; i++) {
            if (MainRun.salerManangers[i] != null) {
                System.out.println(MainRun.salerManangers[i]);
            }
        }
    }

    public static void sortBySalerName() {
        for (int i = 0; i < MainRun.salerManangers.length - 1; i++) {
            if(MainRun.salerManangers[i] == null){
                continue;
            }
            for (int j = i + 1; j < MainRun.salerManangers.length; j++) {
                if(MainRun.salerManangers[j] == null){
                    continue;
                }
                if (MainRun.salerManangers[i].getSaler().getName().compareTo(MainRun.salerManangers[j].getSaler().getName()) > 0){
                    SalerMananger temp = MainRun.salerManangers[i];
                    MainRun.salerManangers[i] = MainRun.salerManangers[j];
                    MainRun.salerManangers[j] = temp;
                }
            }
        }
        showSalerMananger();
    }

    public static void sortByProductNumber() {
        for (int i = 0; i < MainRun.salerManangers.length - 1; i++) {
            SalerMananger product1 = MainRun.salerManangers[i];
            if (product1 == null) {
                continue;
            }
            for (int j = i + 1; j < MainRun.salerManangers.length; j++) {
                SalerMananger product2 = MainRun.salerManangers[j];
                if (product2 == null) {
                    continue;
                }
                if ( product1.getTotalProduct() < product2.getTotalProduct()) {
                    SalerMananger temp = product1;
                    product1 = product2;
                    product2 = temp;
                }
            }
        }
        showSalerMananger();
    }

    public static void calculateSalary() {
        for (int i = 0; i < MainRun.salerManangers.length; i++) {
            if (MainRun.salerManangers[i] == null) {
                continue;
            }
            double salary = 0;
            Saler saler = MainRun.salerManangers[i].getSaler();
            SalerManangerDetail[] salerManangerDetails = MainRun.salerManangers[i].getSalerManangerDetails();
            for (int j = 0; j < salerManangerDetails.length; j++) {
                salary += salerManangerDetails[j].getProduct().getPrice() * salerManangerDetails[j].getSoLuong();
            }
            System.out.println("Lương của nhân viên " + saler.getName() + " là " + salary);
        }
    }
}
