package soal2;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scan.nextLine();
            System.out.print("Ras: ");
            String race = scan.nextLine();
            System.out.print("Warna bulu: ");
            String color = scan.nextLine();

            Cat cat = new Cat(name, race, color);
            cat.displayCat();
        }
        else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scan.nextLine();
            System.out.print("Ras: ");
            String race = scan.nextLine();
            System.out.print("Warna bulu: ");
            String color = scan.nextLine();
            System.out.print("Kemampuan (pisahkan dengan koma): ");
            String inputAbilities = scan.nextLine();
            String[] abilities = inputAbilities.split(",\\s*"); // pisahkan koma

            Dog dog = new Dog(name, race, color, abilities);
            dog.displayDog();
        }
        else {
            System.out.println("Pilihan tidak valid!");
        }

        scan.close();
    }
}