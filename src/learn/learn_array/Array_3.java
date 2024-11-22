package learn.learn_array;

public class Array_3 {
    public static void main(String[] args) {
        int[] dataku = new int[5];
        for (int i = 0; i < dataku.length; i++) {
            dataku[i] = (int) (Math.random() * 100);
            System.out.println("Isi dataku[" + i + "] = "
                    + dataku[i]);
        }
    }
}
