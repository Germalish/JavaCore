package handle;

import entity.Pet;
import run.Main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetHandle {
    public static void match() {
        while (true) {
            try {
                int id = 0;
                Pet pet = null;
                Pet petLove = null;
                Random random = new Random();
                do {
                    System.out.println("Nhập ID pet của bạn: ");
                    id = new Scanner(System.in).nextInt();
                    for (Pet pet1 : Main.pets) {
                        if (pet1.getId() == id) {
                            pet = pet1;
                            break;
                        }
                    }
                    if (pet != null) {
                        break;
                    }
                    System.out.println("ID của thú cưng không hợp lệ, hãy nhập lại");
                } while (true);
                int index = random.nextInt(Main.pets.size());
                do {
                    for (Pet pet2 : Main.pets) {
                        if (pet2.getTYPE() == Main.pets.get(index).getTYPE() && pet2.getSex() != Main.pets.get(index).getSex()) {
                            petLove = Main.pets.get(index);
                            break;
                        }
                    }
                    if (petLove != null) {
                        break;
                    }
                    System.out.println("Không có thú cưng mà bạn tìm, hãy tìm con khác.");
                } while (true);
                System.out.println(petLove);
                System.out.println("Bạn muốn tìm chú pet khác không:");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int choice3;
                do {
                    choice3 = new Scanner(System.in).nextInt();
                    if (choice3 > 0 && choice3 < 3) {
                        break;
                    }
                    System.out.println("Không hợp lệ, hãy nhập lại");
                }
                while (true);
                switch (choice3) {
                    case 1:
                        continue;
                    case 2:
                        System.out.println("Bạn đã thoát ứng dụng.");
                        return;
                }
            } catch (Exception e) {
                System.out.println("Không hợp lệ, hãy nhập lại.");
            }
        }
    }
}
