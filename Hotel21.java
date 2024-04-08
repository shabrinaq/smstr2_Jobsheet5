/**
 * Hotel21
 */
public class Hotel21 {

    String nama;
    String kota;
    int harga;
    Byte bintang;

    Hotel21(String n, String k, int h, byte b) {
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }

    public int getHarga() {
        return harga;
    }
    
    public byte getBintang() {
        return bintang;
    }

    public String toString() {
        return "Hotel   = " + nama + "\n" +
               "Kota    = " + kota + "\n" +
               "Harga   = " + harga + "\n" +
               "Bintang = " + bintang;
    }
}