package Search;
import java.util.Scanner;


public class BinarySearch {

        // Fungsi binary search rekursif
        public static int binarySearch(int[] arr, int target, int low, int high) {/*Ini adalah deklarasi dari fungsi binarySearch*/
            if (low <= high) {
                int mid = low + (high - low) / 2; /*Ini adalah perhitungan indeks tengah (mid) dari larik. Ini dilakukan dengan cara mengambil nilai tengah antara low dan high*/

                if (arr[mid] == target) { /*untuk memeriksa apakah elemen yang berada di tengah larik (arr[mid]) sama dengan nilai yang ingin dicari (target)*/
                    return mid; // Angka ditemukan, mengembalikan indeks
                }

                if (arr[mid] < target) { /* Ini adalah kondisi yang akan dievaluasi jika elemen di tengah larik (arr[mid]) kurang dari nilai yang ingin dicari (target)*/
                    return binarySearch(arr, target, mid + 1, high);/* Jika target lebih besar dari arr[mid], maka kita memanggil kembali fungsi binarySearch*/
                } else {
                    return binarySearch(arr, target, low, mid - 1);
                }
            }

            return -1; // Angka tidak ditemukan
        }

        public static void main(String[] args) { /*Deklarasi method main*/
            int[] data = {12, 15, 21, 23, 25, 40, 45, 55, 81, 90};/*Ini adalah deklarasi dan inisialisasi larik (array) dengan nama data*/

            // Membaca angka target dari keyboard
            Scanner scanner = new Scanner(System.in); /*Baris ini membuat sebuah objek Scanner dengan nama scanner*/
            System.out.print("Masukkan angka yang ingin dicari: ");/*Baris ini digunakan untuk membaca sebuah bilangan bulat (integer) yang diinputkan oleh pengguna melalui konsol dan kemudian menyimpannya dalam variabel target*/
            int target = scanner.nextInt();

            int hasilPencarian = binarySearch(data, target, 0, data.length - 1);/* mendeklarasikan sebuah variabel hasilPencarian sebagai tipe data integer (int)*/

            if (hasilPencarian != -1) { /* Ini adalah sebuah kondisi yang menguji apakah hasilPencarian tidak sama dengan -1. Jika kondisi ini benar, maka artinya nilai yang ingin dicari (target) ditemukan dalam larik data*/
                System.out.println("Angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);/*Jika kondisi pada baris sebelumnya benar, maka ini adalah perintah yang akan dijalankan.*/
            } else {
                System.out.println("Angka " + target + " tidak ditemukan dalam array.");
            }

            // Menutup scanner setelah digunakan
            scanner.close();
        }
    }


