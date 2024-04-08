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

        void selectionSort() {
            for (int i = 0; i < listMHS.length-1; i++) {
                int idxMin = i;
                for (int j = i+1; j < listMHS.length; j++) {
                    if (listMHS[j].ipk < listMHS[idxMin].ipk) {
                        idxMin = j;
                    }
                }
                //swap
                Mahasiswa21 tmp = listMHS[idxMin];
                listMHS[idxMin] = listMHS[i];
                listMHS[i] = tmp;
            }
        }

        void insertionSort() {
            for (int i = 1; i < listMHS.length; i++) {
                Mahasiswa21 temp = listMHS[i];
                int j = i;
                while (j > 0 && listMHS[j - 1].ipk < temp.ipk) {
                    listMHS[j] = listMHS[j - 1];
                    j--;
                }
                listMHS[j] = temp;
            }
        }
    }
