public class Matriks {
    public static void main(String[] args) {
        // a. isi matriks
        int[][] angka = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 9, 11}
        };

        int jumlah = 0; // untuk menyimpan total penjumlahan

        System.out.println("Isi Matriks:");
        // b. Menampilkan isi matriks dan menghitung jumlah elemen
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
                jumlah += angka[i][j]; // menjumlahkan semua elemen
            }
            System.out.println(); // pindah baris setelah satu baris selesai
        }

        System.out.println("\nJumlah semua elemen = " + jumlah);
    }
}
