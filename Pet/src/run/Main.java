package run;

import entity.Pet;
import handle.PetHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Pet> pets = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Nhập số lượng thú cưng muốn thêm: ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            Pet pet = new Pet();
            pet.inputTable();
            pets.add(pet);
        }
        System.out.println(pets);
        PetHandle.match();
    }
}