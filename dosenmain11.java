class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    
    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public int hitungMasaKerja() {
        return 2026 - tahunBergabung;
    }

    public void tampilkanInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Masa Kerja      : " + hitungMasaKerja() + " tahun");
        System.out.println("----------------------------------------");
    }

    public void nonaktifkan() {
        statusAktif = false;
        System.out.println("Dosen dinonaktifkan.");
    }

    public void ubahBidangKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
        System.out.println("Bidang keahlian diubah menjadi " + bidangBaru);
    }
}

public class dosenmain11 {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("D001", "Dr. yusuf", true, 2015, "Pemrograman");
        Dosen d2 = new Dosen("D002", "Prof. dodi", true, 2010, "Struktur Data");

        d1.tampilkanInformasi();
        d2.tampilkanInformasi();

        d2.nonaktifkan();
        d2.ubahBidangKeahlian("Kecerdasan Buatan");

        d2.tampilkanInformasi();
    }
}

