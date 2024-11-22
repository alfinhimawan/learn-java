package learn.learn_array;

public class Array_2 {
    public static void main(String[] args) {
        int[] dataku = new int[5];
        dataku[0] = 10;
        dataku[1] = 30;
        dataku[2] = 50;
        dataku[3] = 70;
        dataku[4] = 90;
        for (int i = 0; i < dataku.length; i++) {
            System.out.println("Isi dataku[" + i + "]= "
                    + dataku[i]);
        }
    }
}
