import java.util.Scanner;

public class PRAK101_2410817220015_AshmaSalimah {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String Name = scan.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String PlaceOfBirth = scan.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        String DateOfBirth = scan.nextLine();
        System.out.print("Masukkan Bulan Lahir: ");
        String MoonOfBirth = scan.nextLine();
        System.out.print("Masukkan Tahun Lahir: ");
        String YearOfBirth = scan.nextLine();
        System.out.print("Masukkan Tinggi Badan: ");
        String Height = scan.nextLine();
        System.out.print("Masukkan Berat Badan: ");
        String Weight = scan.nextLine();

        switch (MoonOfBirth) {
            case "1" -> MoonOfBirth = "Januari";
            case "2" -> MoonOfBirth = "Februari";
            case "3" -> MoonOfBirth = "Maret";
            case "4" -> MoonOfBirth = "April";
            case "5" -> MoonOfBirth = "Mei";
            case "6" -> MoonOfBirth = "Juni";
            case "7" -> MoonOfBirth = "Juli";
            case "8" -> MoonOfBirth = "Agustus";
            case "9" -> MoonOfBirth = "September";
            case "10" -> MoonOfBirth = "Oktober";
            case "11" -> MoonOfBirth = "November";
            case "12" -> MoonOfBirth = "Desember"; }

        System.out.println("Nama lengkap " + Name + ", Lahir di " + PlaceOfBirth + " pada Tanggal " + DateOfBirth + " " + MoonOfBirth + " " + YearOfBirth);
        System.out.print( "Tinggi Badan " + Height + " cm dan Berat Badan " + Weight + " kilogram");

        scan.close();
    }
}