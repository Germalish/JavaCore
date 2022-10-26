package Exersise5;

public class ex5 {
    public static void main(String[] args) {
        String name = "COC COC";
        System.out.println("Câu a,");
        System.out.println("Vị trí ký tự đầu tiên của ký tự C: " + name.indexOf("C"));
        System.out.println("Vị trí ký tự cuối cùng của ký tự C: " + name.lastIndexOf("C"));
        System.out.println("--------------------------------------------------");
        System.out.println("Câu b,");
        String s ="ANH YEU EM";
        String s1 = "E";
        String s2 = "3";
        System.out.println(s.replace(s1, s2));
    }
}
