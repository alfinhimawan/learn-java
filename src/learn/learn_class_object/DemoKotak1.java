package learn.learn_class_object;

class Kotak {
    double panjang;
    double lebar;
    double tinggi;
}

public class DemoKotak1 {
    public static void main(String[] args) {
        double volume;
        Kotak k = new Kotak();

        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;

        volume = k.panjang * k.tinggi * k.lebar;
        
        System.out.println("Volume kotak = " + volume);
    }
}
