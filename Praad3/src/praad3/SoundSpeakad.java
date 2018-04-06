package praad3;

public class SoundSpeakad {
    private String merk;
    private String color;
    private Double harga;
    
    void listenSound(){
        System.out.println("Merk \t= "+merk+"\n"+
                "Color \t= "+color+"\n"+
                "Harga \t= "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
    
}
