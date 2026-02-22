class Matkul {
    String kodeMK;
    String namaMK;
    int sks;
    int jumlahJam;

    // Konstruktor default
    public Matkul() {
        kodeMK = "MK001";
        namaMK = "Pemrograman Dasar";
        sks = 3;
        jumlahJam = 2;
    }

    // Konstruktor berparameter
    public Matkul(String kodeMK, String namaMK, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + namaMK);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sksBaru);
    }

    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam berhasil ditambahkan. Total jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        jumlahJam -= jam;
        System.out.println("Jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
    }
}

public class Matkul11{
    public static void main(String[] args) {

        // Objek pertama (default)
        Matkul mk1 = new Matkul();
        mk1.tampilInformasi();

        // Objek kedua (parameter)
        Matkul mk2 = new Matkul("MK002", "Struktur Data", 4, 3);
        mk2.tampilInformasi();

        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);

        mk2.tampilInformasi();
    }
}
    
