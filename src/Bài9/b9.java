package Bài9;

public class b9 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        double x = (double) a/b;
        double lamtron = ((double) Math.round(x * 1000) / 1000);
        System.out.println(lamtron);
    }
}

