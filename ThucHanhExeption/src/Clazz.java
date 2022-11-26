import java.util.ArrayList;
import java.util.Scanner;

public class Clazz {
    private String name;
    public static ArrayList<Student> students;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Clazz(String name) {
        this.name = name;
    }
    public void inputTable(){
        ArrayList<Student> students1 = new ArrayList<>();
        while (true){
            try {
                System.out.println("Nhập số lượng học viên: ");
                int num = new Scanner(System.in).nextInt();
                for (int i = 0; i < num; i++) {
                    Student student = new Student();
                    student.inputTable();
                    students1.add(student);
                }
                this.students = students1;
                break;
            }
            catch (Exception e){
                System.out.println("Không hợp lệ, hãy nhập lại");
            }
        }
    }
    public static void addStudent() {
        System.out.println("Nhập số học sinh muốn thêm: ");
        ArrayList<Student> students1 = new ArrayList<>();
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < num; i++) {
            Student student = new Student();
            student.inputTable();
            students.add(student);
        }
    }
    public static void updateStudent() {
        int id = 0;
        Student student = null;
        do {
            System.out.println("Nhập ID học sinh cần điều chỉnh: ");
            id = new Scanner(System.in).nextInt();
            for (Student student1 : students) {
                if (student1.getId() == id) {
                    student = student1;
                    break;
                }
            }
            if (student != null) {
                break;
            }
            System.out.println("ID của học sinh không hợp lệ, hãy nhập lại.");
        } while (true);
        System.out.println("Điều chỉnh Level của học sinh này: ");
        String newLevel = new Scanner(System.in).nextLine();
        student.setLevel(newLevel);
        System.out.println(student);
    }
    public static void deleteStudent() {
        int id = 0;
        Student student = null;
        do {
            System.out.println("Nhập ID học sinh cần xóa: ");
            id = new Scanner(System.in).nextInt();
            for (Student student1 : students) {
                if (student1.getId() == id) {
                    student = student1;
                    break;
                }
            }
            if (student != null) {
                break;
            }
            System.out.println("ID của học sinh không hợp lệ, hãy nhập lại.");
        } while (true);
        students.remove(student);
        System.out.println(students);
    }
}
