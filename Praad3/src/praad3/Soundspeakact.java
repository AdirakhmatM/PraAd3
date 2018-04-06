package praad3;

public class Soundspeakact {
    public static void main(String[] args) {
        SoundSpeakad r = new SoundSpeakad();
        r.setMerk("Logitech");
        r.setColor("Blue");
        r.setHarga (70000.0);
        
        r.listenSound();
        
        System.out.println("-----------------");
        System.out.print("Merk \t:");
        System.out.println(r.getMerk());
        System.out.print("Color \t:");
        System.out.println(r.getColor());
        System.out.print("Harga \t:");
        System.out.println(r.getHarga());
    }
}
