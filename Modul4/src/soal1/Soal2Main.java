package soal1;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String name = scan.nextLine();
        System.out.print("Ras: ");
        String breed = scan.nextLine();

        Pet pet1 = new Pet(name, breed);
        pet1.setName(name);
        pet1.setBreed(breed);
        pet1.display();
        scan.close();
    }
}