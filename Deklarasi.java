public class Deklarasi {
    public static void main(String[] args) {
        int[] bilangan = new int[5];

        // Mengisi array dengan angka 1 sampai 5
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }

        // Menampilkan isi array dengan for-each loop
        System.out.println("Isi array bilangan:");
        for (int angka : bilangan) {
            System.out.println(angka);
        }
    }
}
