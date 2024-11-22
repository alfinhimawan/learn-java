package learn.learn_java;

public class DoWhile {
    public static void main(String[] args) {
        System.out.print("x = ");
        int i = 0, x = 0;
        do {
            if (((++i % 2) == 0) && (i < 20)) {
                System.out.print(i + " + ");
                x += i;
            } else if (i == 20) {
                System.out.print(i);
                x += i;
            }
        } while (i < 20);
        System.out.println("\nx = " + x);
    }
}
