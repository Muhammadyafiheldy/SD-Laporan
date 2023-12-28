package HashTable;

import java.util.LinkedList;

public class StringHash {
    
    
    //  Array dari LinkedList untuk menyimpan data.
     
    private LinkedList<String>[] table;

    public StringHash(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }
    public int hashFunction(String key) {
        return key.charAt(0) % table.length;
    }

    public void insert(String value) {
        int index = hashFunction(value); // Hitung indeks
        table[index].add(value); // Tambahkan ke LinkedList di indeks tersebut
        System.out.println("Data "+value+" ditambahkan di index: "+index);
    }

    public int search(String value) {
        int index = hashFunction(value); // Hitung indeks
        return index; // Cek apakah nilai ada di LinkedList di indeks tersebut
    }

    public static void main(String[] args) {
        // String Hash with Separate Chaining
        StringHash stringHash = new StringHash(26); // Membuat objek dengan ukuran 26 (A-Z)
        stringHash.insert("Kucing"); // Menyisipkan string "Kucing"
        stringHash.insert("Ayam"); // Menyisipkan string "Ayam"
        stringHash.insert("Kelinci");// Menyisipkan string "Kelinci"
        System.out.println("String Kelinci ditemukan di index: " + stringHash.search("Kelinci")); // Mencari string "Kelinci"
    }
}
