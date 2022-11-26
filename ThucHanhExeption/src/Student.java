import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String level;
    private int id;
    public static int Auto_id = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                ", id=" + id +
                '}';
    }

    public void inputTable(){
        this.id = Auto_id;
        Auto_id++;
        System.out.println("Nhập tên học viên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi: ");
        this.age  = new Scanner(System.in).nextInt();
        System.out.println("Nhập trình độ: ");
        this.level = new Scanner(System.in).nextLine();
    }
}
