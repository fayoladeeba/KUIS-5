public class NamaHewan {
    public static void main(String[] args) {
        // a. Membuat array String berisi 5 nama hewan
        String[] hewan = {"Jerapah", "Orangutan", "Harimau", "Merak", "Bekantan"};

        // b. Menggunakan perulangan for untuk mencetak semua nama hewan
        System.out.println("Daftar nama hewan:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println((i + 1) + ". " + hewan[i]);
        }
    }
}
