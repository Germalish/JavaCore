package entity;

import java.util.Scanner;

public class Pet {
    private int id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private String TYPE;
    public static int Auto_ID = 100;

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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    @Override
    public String toString() {
        return "entity.Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", TYPE='" + TYPE + '\'' +
                '}';
    }

    public void inputTable() {
        try {
            Scanner sc = new Scanner(System.in);
            this.id = Auto_ID;
            Auto_ID++;
            System.out.println("Nhập tên: ");
            this.name = sc.nextLine();
            System.out.println("Nhập giống loài: ");
            this.species = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            this.age = Integer.parseInt(sc.nextLine());
            System.out.println("Chọn giới tính:");
            System.out.println("1.Male");
            System.out.println("2.Female");
            int choice;
            do {
                choice = new Scanner(System.in).nextInt();
                if (choice > 0 && choice < 3) {
                    break;
                }
                System.out.println("Không hợp lệ, hãy nhập lại");
            }
            while (true);
            switch (choice) {
                case 1:
                    this.sex = TYPE_OF_SEXS.Male.value;
                    break;
                case 2:
                    this.sex = TYPE_OF_SEXS.Female.value;
                    break;
            }
                System.out.println("Mô tả: ");
                this.description = sc.nextLine();
                System.out.println("Chọn chủng loại:");
                System.out.println("1.Chó");
                System.out.println("2.Mèo");
                int choice1;
                do {
                    choice1 = new Scanner(System.in).nextInt();
                    if (choice1 > 0 && choice1 < 3) {
                        break;
                    }
                    System.out.println("Không hợp lệ, hãy nhập lại");
                }
                while (true);
                switch (choice1) {
                    case 1:
                        this.TYPE = TYPE_OF_PETS.DOG.value;
                        break;
                    case 2:
                        this.TYPE = TYPE_OF_PETS.CAT.value;
                        break;
                }
            }catch(Exception e){
                System.out.println("Thông tin nhập không hợp lệ, hãy thử lại.");
            }
    }
}
