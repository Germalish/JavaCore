package entity;

import run.MainRun;

import java.util.Scanner;

public class Saler extends Person {
    private int id;
    private String dayContract;
    public static int Auto_ID = 1000;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDayContract() {
        return dayContract;
    }

    public void setDayContract(String dayContract) {
        this.dayContract = dayContract;
    }

    public static int getAuto_ID() {
        return Auto_ID;
    }

    public static void setAuto_ID(int auto_ID) {
        Auto_ID = auto_ID;
    }

    @Override
    public String toString() {
        return "Saler{" +
                "id=" + id +
                ", dayContract='" + dayContract + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        this.id = Auto_ID;
        Auto_ID++;
        System.out.println("Nhập ngày ký hợp đồng");
        this.dayContract = new Scanner(System.in).nextLine();
    }
}
