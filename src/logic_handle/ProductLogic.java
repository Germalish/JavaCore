package logic_handle;

import entity.Product;
import run.MainRun;

import java.util.Scanner;

public class ProductLogic {
    public static int countProduct = 0;
    public static void addProduct() {
        System.out.println("Nhập số lượng sản phẩm mới: ");
        int numPRD = new Scanner(System.in).nextInt();
        for (int i = 0; i < numPRD; i++) {
            Product product = new Product();
            product.nhapThongTin();
            saveProduct(product);
        }
        countProduct += numPRD;
    }
    private static void saveProduct(Product product) {
        for (int i = 0; i < MainRun.products.length; i++) {
            if(MainRun.products[i] == null){
                MainRun.products[i] = product  ;
                break;
            }
        }
    }

    public static void showProduct() {
        for (int i = 0; i < MainRun.products.length; i++) {
            if(MainRun.products[i] != null){
                System.out.println(MainRun.products[i]);
            }
        }
    }
}
