package praktikum2.soal3;

// Error: Nama class pada soal adalah Employee, tapi pada Soal3Main.java objeknya dibuat dari class Pegawai.
// Perbaikan: Nama class diubah menjadi 'Pegawai'.
public class Pegawai {
    public String nama;

    // Error: Tipe data pada soal untuk 'asal' adalah char, tapi di Soal3Main diisi dengan String ("Kingdom of Orvel").
    // Perbaikan: Tipe data diubah menjadi 'String'.
    public String asal;

    public String jabatan;

    // Error: umur belum diatur pada Soal3Main dengan nilai 17
    // Umur diisi dengan nilai 17 agar sesuai dengan output yang diminta.
    public int umur = 17;

    public String getNama() {
        return nama;
    }

    // Error: method mencoba mengembalikan tipe data char ('asal') dari sebuah method yang mendeklarasikan String.
    // Perbaikan: tipe data 'asal' diubah menjadi String.
    public String getAsal() {
        return asal;
    }

    // Error: Method 'setJabatan' tidak memiliki parameter untuk menerima input, variabel 'j' tidak terdefinisi.
    // Perbaikan: Tambahkan parameter (String jabatan) dan menggunakan 'this' untuk merujuk ke variabel kelas. Ini adalah praktik terbaik.
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}