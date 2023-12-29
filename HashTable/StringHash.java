package Hashtable;

import java.util.LinkedList;

public class StringHash {

    /* Array generik digunakan untuk menyimpan data. */

    private LinkedList<String>[] table;

    // deklarasi variable untuk kedalam kelas StringHash (sebagai tabel)
    public StringHash(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Menghitung nilai hash untuk suatu kunci (key) yang diberikan.
    public int hashFunction(String key) {
        return key.charAt(0) % table.length;
    }

    // Menambah string ke dalam hashtable
    public void insert(String value) {
        int index = hashFunction(value); // Hitung indeks
        table[index].add(value); // Tambahkan ke LinkedList di indeks tersebut
        System.out.println("Data " + value + " ditambahkan di index: " + index);
    }

    // Mencari string yang ada di hashtable
    public int search(String value) {
        int index = hashFunction(value); // Hitung indeks
        return index; // Cek apakah nilai ada di LinkedList di indeks tersebut
    }

    // method main untuk running program
    public static void main(String[] args) {
        // String Hash with Separate Chaining
        StringHash stringHash = new StringHash(26); // Membuat objek dengan ukuran 26 (A-Z)
        stringHash.insert("Kucing"); // Menyisipkan string "Kucing"
        stringHash.insert("Ayam"); // Menyisipkan string "Ayam"
        stringHash.insert("Kelinci");// Menyisipkan string "Kelinci"
        System.out.println("String Kelinci ditemukan di index: " + stringHash.search("Kelinci")); // Mencari string
                                                                                                  // "Kelinci"
    }
}
