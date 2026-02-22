public class mahasiswa {
   
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5)
            return "Kinerja sangat baik";
        else if (ipk >= 3.0)
            return "Kinerja baik";
        else if (ipk >= 2.0)
            return "Kinerja cukup";
        else
            return "Kinerja kurang";
    }

    public static void main(String[] args) {

        mahasiswa mhs = new mahasiswa();

        mhs.nama = "Gendis";
        mhs.nim = "25410760045";
        mhs.kelas = "SIB-1D";
        mhs.ipk = 3.4;

        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja : " + mhs.nilaiKinerja());
    }
}
    

