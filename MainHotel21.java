import java.util.Scanner;
/**
 * MainHotel21
 */
public class MainHotel21 {

    public static void main(String[] args) {
        HotelService21 list = new HotelService21(15);
        Hotel21 h1 = new Hotel21("Hotel A", "Malang", 500000, (byte) 3);
        Hotel21 h2 = new Hotel21("Hotel B", "Surabaya", 600000,(byte) 4);
        Hotel21 h3 = new Hotel21("Hotel C", "Bandung", 760000, (byte) 4);
        Hotel21 h4 = new Hotel21("Hotel D", "Jakarta", 1000000, (byte) 5);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);

        System.out.println("Daftar penginapan sebelum sebelum sorting = ");
        list.tampilAll();

        System.out.println("Daftar penginapan setelah sorting berdasarkan harga = ");
        list.bubbleSortPrice();
        list.tampilAll();

        System.out.println("Daftar penginapan setelah sorting berdasarkan bintang = ");
        list.selectionSortBintang();
        list.tampilAll();
    }
}