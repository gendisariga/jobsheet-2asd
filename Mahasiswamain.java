public class mahasiswamain {
    class Mahasiswa {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println();
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
}

public class MahasiswaMain {

    public static void main(String[] args) {

        // Instansiasi object
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi atribut
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        // Menampilkan data awal
        mhs1.tampilkanInformasi();

        // Mengubah data
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        // Menampilkan data setelah diubah
        mhs1.tampilkanInformasi();
    }
}
    
}
