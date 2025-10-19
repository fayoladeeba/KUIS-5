public class ZigZagArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // Baris atas dan bawah untuk pola zig-zag
        String atas = "";
        String bawah = " ";

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Elemen di indeks genap (baris atas)
                atas += arr[i] + "   "; // spasi 3 kali agar jarak proporsional
                bawah += "   "; // tambahkan spasi di baris bawah agar tetap sejajar
            } else {
                // Elemen di indeks ganjil (baris bawah)
                atas += "   "; // kosong di baris atas
                bawah += arr[i] + "   "; // cetak di baris bawah
            }
        }

        // Cetak hasil zigzag
        System.out.println(atas);
        System.out.println(bawah);
    }
}
