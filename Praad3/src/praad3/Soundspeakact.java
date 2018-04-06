package praad3;

public class Soundspeakact {
    public static void main(String[] args) {
        SoundSpeakad r = new SoundSpeakad();
        r.setMerk("Logitech");
        r.setColor("Blue");
        r.setHarga (70000.0);
        // Can't r.setTypeSoundspeak();
        
        r.listenSound();
        
        System.out.println("-----------------");
        System.out.print("Merk \t:");
        System.out.println(r.getMerk());
        System.out.print("Color \t:");
        System.out.println(r.getColor());
        System.out.print("Harga \t:");
        System.out.println(r.getHarga());
    
        SoundSpeakWirreless ra = new SoundSpeakWirreless();
        ra.setMerk("Blaster X");
        ra.setColor("Black");
        ra.setHarga(70000.0);
        ra.setTypeSoundspeak(" Wireless");
        ra.listenSound();
        System.out.println("Type \t="+ra.getTypeSoundspeak());
        ra.throttle();
    }
}
