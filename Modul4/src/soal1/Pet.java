package soal1;
import java.util.Scanner;

public class Pet {
    private String name;
    private String race;

    public Pet() {
        input();
    }

    public Pet(String n, String r) {
        this.name = n;
        this.race = r;
    }

    public void input() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        this.name = scan.nextLine();
        System.out.print("Ras: ");
        this.race = scan.nextLine();

        scan.close();
    }

    public void display() {
        System.out.print("\nDetail Hewan Peliharaan:\n");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + name);
    }
}