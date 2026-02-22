public class MAHASISWA11 {

    // Class Mahasiswa dibuat di dalam 1 file (inner class)
    static class Mahasiswa {
        String nama;
        String nim;
        String kelas;
        double ipk;

        // Konstruktor default
        public Mahasiswa() {
        }

        // Konstruktor berparameter
        public Mahasiswa(String nama, String nim, double ipk, String kelas) {
            this.nama = nama;
            this.nim = nim;
            this.ipk = ipk;
            this.kelas = kelas;
        }

        void tampilkanInformasi() {
            System.out.println("Nama  : " + nama);
            System.out.println("NIM   : " + nim);
            System.out.println("Kelas : " + kelas);
            System.out.println("IPK   : " + ipk);
            System.out.println("----------------------------");
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }

        void updateIpk(double ipkBaru) {
            ipk = ipkBaru;
        }
    }

    public static void main(String[] args) {

        // Objek pertama (konstruktor default)
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        // Objek kedua (konstruktor berparameter)
        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila",
                                       "2141720160",
                                       3.25,
                                       "TI 2L");

        mhs2.tampilkanInformasi();

        mhs2.ubahKelas("TI 2M");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}