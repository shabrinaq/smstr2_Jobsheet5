/**
 * HotelService21
 */
public class HotelService21 {

    Hotel21[] rooms;
    int size;
    
    HotelService21(int kapasitas) {
        rooms = new Hotel21[kapasitas];
        size = 0;
    }

    void tambah(Hotel21 H) {
        if (size < rooms.length) {
            rooms[size] = H;
            size++;
        } else {
            System.out.println("Kapasitas penuh");
        }
    }

    void tampilAll() {
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(rooms[i]);
        }
        System.out.println("-------------------------------------------------------");
    }

    void bubbleSortPrice() {
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (rooms[j].getHarga() > rooms[j+1].getHarga()) {
                    Hotel21 temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }

    void selectionSortBintang() {
        for (int i = 0; i < size-1; i++) {
            int maxIndeks = i;
            for (int j = i+1; j < size; j++) {
                if (rooms[j].getBintang() > rooms[maxIndeks].getBintang()) {
                    maxIndeks = j;
                }
            }
            Hotel21 temp = rooms[i];
            rooms[i] = rooms[maxIndeks];
            rooms[maxIndeks] = temp;
        }
    }
}