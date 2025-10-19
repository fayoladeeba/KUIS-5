public class Mahasiswa {
    private String nama;
    private int nilai;

    // Konstruktor
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilData() {
        System.out.println("Nama: " + nama + " - Nilai: " + nilai);
    }

    public static void main(String[] args) {
        // a. Menyimpan beberapa objek Mahasiswa ke dalam array
        Mahasiswa[] mhs = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };

        // b. Menampilkan semua data
        for (Mahasiswa m : mhs) {
            m.tampilData();
        }

        // c. Menampilkan mahasiswa dengan nilai tertinggi
        Mahasiswa tertinggi = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].getNilai() > tertinggi.getNilai()) {
                tertinggi = mhs[i];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}
