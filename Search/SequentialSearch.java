package Search;

import java.util.Scanner;

class SequentialSearch {
    // Fungsi untuk melakukan pencarian sekuensial
    public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {/* Ini adalah sebuah loop for yang akan mengiterasi melalui seluruh elemen dalam larik arr mulai dari indeks 0 hingga indeks arr.length - 1.*/
            if (arr[i] == target) { /* Ini adalah pernyataan kondisional yang memeriksa apakah elemen dalam larik pada indeks i (arr[i]) sama dengan nilai yang ingin dicari (target).*/
                return i; // Mengembalikan indeks jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }

    public static void main(String[] args) {
        int[] data = {12, 15, 21, 23, 25, 40, 45, 55, 81, 90};

        // Membaca angka target dari keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        int hasilPencarian = sequentialSearch(data, target);

        if (hasilPencarian != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}

