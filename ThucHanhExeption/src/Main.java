import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TechMaster techMaster = new TechMaster();
        while (true) {
            try {
                System.out.println("-----Menu------");
                System.out.println("1. Tạo và hiển thị thông tin.");
                System.out.println("2. Thêm học sinh.");
                System.out.println("3. Cập nhật học lực của học sinh");
                System.out.println("4. Xóa học sinh");
                System.out.println("5. Thoát chương trình");
                System.out.print("Chọn: ");
                int choice3;
                do {
                    choice3 = new Scanner(System.in).nextInt();
                    if (choice3 > 0 && choice3 < 6) {
                        break;
                    }
                    System.out.println("Không hợp lệ, hãy nhập lại");
                }
                while (true);
                switch (choice3) {
                    case 1:
                        techMaster.inputTable();
                        System.out.println(techMaster);
                        break;
                    case 2:
                        Clazz.addStudent();
                        break;
                    case 3:
                        Clazz.updateStudent();
                        break;
                    case 4:
                        Clazz.deleteStudent();
                        break;
                    case 5:
                        System.out.println("Đã thoát chương trình");
                        return;
                }
            }catch (Exception e){
                System.out.println("Không hợp lệ, hãy nhập lại");
            }
        }
    }
}