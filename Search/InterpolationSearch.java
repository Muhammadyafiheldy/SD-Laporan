package Search;
import java.util.Scanner;

public class InterpolationSearch {

        // Fungsi Interpolation Search
        public static int interpolationSearch(int[] arr, int target) {
            int low = 0;/*Ini adalah inisialisasi variabel low dengan nilai 0. low akan digunakan sebagai indeks terendah dalam pencarian.*/
            int high = arr.length - 1;/*Ini adalah inisialisasi variabel high dengan nilai arr.length - 1. high akan digunakan sebagai indeks tertinggi dalam pencarian, yang merupakan indeks terakhir dalam larik.*/

            while (low <= high && target >= arr[low] && target <= arr[high]) {/* Ini adalah loop while yang akan terus berjalan selama tiga kondisi terpenuhi*/
                if (low == high) {/*Ini adalah pernyataan kondisional yang memeriksa apakah low sama dengan high*/
                    if (arr[low] == target) {/*Ini adalah pernyataan kondisional dalam blok if di atas. Jika elemen pada indeks low sama dengan target*/
                        return low;
                    }
                    return -1;
                }

                // Menghitung posisi perkiraan elemen target dalam array
                int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);//Baris ini digunakan untuk menghitung posisi perkiraan elemen yang dicari (target) dalam larik. Ini adalah langkah kunci dalam pencarian interpolasi.//
                //low adalah indeks terendah dari rentang pencarian.
                //high adalah indeks tertinggi dari rentang pencarian.
                //(target - arr[low]) adalah perbedaan antara nilai yang ingin dicari (target) dan nilai elemen terendah dalam larik.
                //(high - low) adalah panjang rentang pencarian.
                //(arr[high] - arr[low]) adalah perbedaan antara nilai elemen tertinggi dan nilai elemen terendah dalam larik.//

                if (arr[pos] == target) {
                    return pos; // Angka ditemukan, mengembalikan indeks
                }

                if (arr[pos] < target) { //Ini adalah pernyataan kondisional yang memeriksa apakah elemen dalam larik pada posisi pos lebih kecil dari target.//
                    low = pos + 1;
                } else {
                    high = pos - 1;
                }
            }

            return -1; // Angka tidak ditemukan
        }

        public static void main(String[] args) {
            int[] data = {12, 15, 21, 23, 25, 40, 45, 55, 81, 90};

            // Membaca angka target dari keyboard
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan angka yang ingin dicari: ");
            int target = scanner.nextInt();

            int hasilPencarian = interpolationSearch(data, target);

            if (hasilPencarian != -1) {
                System.out.println("Angka " + target + " ditemukan pada indeks ke-" + hasilPencarian);
            } else {
                System.out.println("Angka " + target + " tidak ditemukan dalam array.");
            }

            // Menutup scanner setelah digunakan
            scanner.close();
        }
    }



