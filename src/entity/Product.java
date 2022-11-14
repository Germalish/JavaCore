package entity;

import TypeofProduct.Type_Of_Product;

import java.util.Scanner;

public class Product implements Inputable{
    private int id;
    private String name;
    private String typeOfProduct;
    private int price;
    private int numOfSale;
    public static int Auto_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumOfSale() {
        return numOfSale;
    }

    public void setNumOfSale(int numOfSale) {
        this.numOfSale = numOfSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfProduct='" + typeOfProduct + '\'' +
                ", price=" + price +
                ", numOfSale=" + numOfSale +
                '}';
    }

    @Override
    public void nhapThongTin() {
        this.id = Auto_ID;
        Auto_ID++;
        System.out.println("Nhập tên hàng: ");
        this.name= new Scanner(System.in).nextLine();
        System.out.println("Nhập gía hàng: ");
        this.price= new Scanner(System.in).nextInt();
        System.out.println("Nhập số lượng hàng: ");
        this.numOfSale= new Scanner(System.in).nextInt();
        System.out.println("Nhập loại hàng: ");
        System.out.println("1.Điện tử");
        System.out.println("2.Điện lạnh");
        System.out.println("3.Máy tính");
        System.out.println("4.Thiết bị văn phòng");
        int choice;
        do {
            choice = new Scanner(System.in).nextInt();
            if(choice > 0 && choice <5){
                break;
            }
            System.out.println("Không hợp lệ, hãy nhập lại");
        }
        while (true);
        switch (choice){
            case 1:
                this.typeOfProduct = Type_Of_Product.DIEN_TU.value;
                break;
            case 2:
                this.typeOfProduct = Type_Of_Product.DIEN_LANH.value;
                break;
            case 3:
                this.typeOfProduct = Type_Of_Product.MAY_TINH.value;
                break;
            case 4:
                this.typeOfProduct = Type_Of_Product.THIET_BI_VP.value;
                break;
        }
    }
}
