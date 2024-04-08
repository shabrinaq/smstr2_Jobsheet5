import java.util.Scanner;
/**
 * classMain21
 */
public class classMain21 {

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi21 list = new DaftarMahasiswaBerprestasi21();
        Mahasiswa21 m1 = new Mahasiswa21("Nusa", 2017, 25, 3);
        Mahasiswa21 m2 = new Mahasiswa21("Rara", 2012, 19, 4);
        Mahasiswa21 m3 = new Mahasiswa21("Dompu", 2018, 19, 3.5);
        Mahasiswa21 m4 = new Mahasiswa21("Abdul", 2017, 23, 2);
        Mahasiswa21 m5 = new Mahasiswa21("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();   
    }
}