/**
 * DaftarMahasiswaBerprestasi21
 */
public class DaftarMahasiswaBerprestasi21 {

        Mahasiswa21 listMHS[] = new Mahasiswa21[5];
        int idx;

        void tambah(Mahasiswa21 m) {
            if (idx < listMHS.length) {
                listMHS[idx] = m;
                idx++;
            } else {
                System.out.println("Data Sudah Penuh!!");       
            }
        }

        void tampil() {
            for(Mahasiswa21 m : listMHS) {
                m.tampil();
                System.out.println("-------------------------------");
            }
        }

        void bubbleSort() {
            for (int i = 0; i < listMHS.length-1; i++) {
                for (int j = 1; j < listMHS.length-i; j++) {
                    if (listMHS[j].ipk > listMHS[j-1].ipk) {
                        //proses swap atau penukaran
                        Mahasiswa21 tmp = listMHS[j];
                        listMHS[j] = listMHS[j-1];
                        listMHS[j-1] = tmp;
                    }
                }
            }
        }
    }
