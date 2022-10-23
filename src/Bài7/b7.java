package Bài7;

public class b7 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 1;
        int tks = 4*4 - 4*a*c;
        double n1 = (-4 + Math.sqrt(tks)) / (2*a);
        double n2 = (-4 - Math.sqrt(tks)) / (2*a);
        System.out.println("Nghiệm của pt là :" + n1 + "và " + n2);
    }
}
