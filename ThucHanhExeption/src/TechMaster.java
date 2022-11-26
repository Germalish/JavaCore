import java.util.ArrayList;
import java.util.Scanner;

public class TechMaster {
    private ArrayList<Mananger> manangers;
    private ArrayList<Teacher> teachers;
    private ArrayList<Clazz> clazzes;

    public ArrayList<Mananger> getManangers() {
        return manangers;
    }

    public void setManangers(ArrayList<Mananger> manangers) {
        this.manangers = manangers;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(ArrayList<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "manangers=" + manangers +
                ", teachers=" + teachers +
                ", clazzes=" + clazzes +
                '}';
    }
    public void inputTable(){
        ArrayList<Teacher> teachers1 = new ArrayList<>();
        System.out.println("Nhập thông tin giáo viên: ");
        String name = new Scanner(System.in).nextLine();
        Teacher teacher = new Teacher(name);
        teachers1.add(teacher);
        this.teachers = teachers1;


        ArrayList<Mananger> manangers1 = new ArrayList<>();
        System.out.println("Nhập thông tin quản lý: ");
        String name1 = new Scanner(System.in).nextLine();
        Mananger mananger = new Mananger(name1);
        manangers1.add(mananger);
        this.manangers = manangers1;


        ArrayList<Clazz> clazzes1 = new ArrayList<>();
        System.out.println("Nhập thông tin lớp học: ");
        String name2 = new Scanner(System.in).nextLine();
        Clazz clazz = new Clazz(name2);
        clazz.inputTable();
        clazzes1.add(clazz);
        this.clazzes = clazzes1;
    }
}