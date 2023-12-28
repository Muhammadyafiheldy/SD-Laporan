package Bubble;
    // Metode untuk mengurutkan array integer menggunakan algoritma Insertion Sort.
public class InsertionSort {

    public static int[] insertion(int[] array) {
        int ukuran = array.length;
        int max, j;
        int i = 1;

        while (i < ukuran) {
            max = array[i];
            j = i;
            // Pindahkan elemen yang lebih besar dari max satu posisi ke kanan
            while (j > 0 && array[j - 1] > max) {
                array[j] = array[j - 1];
                j--;
            }
            // Letakkan max di posisi yang tepat
            array[j] = max;
            i++;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = { 9, 5, 1, 4, 3 };
        int[] sortedArray = insertion(array);

        // Mencetak array yang sudah diurutkan
        System.out.println("Sorted array:");
        for (int value : sortedArray) {
            System.out.print(value + " ");
        }
    }
}
