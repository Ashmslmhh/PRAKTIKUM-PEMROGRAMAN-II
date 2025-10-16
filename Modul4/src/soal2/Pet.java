package soal2;

public class Pet {
    private final String name;
    private final String race;

    public Pet(String n, String r) {
        this.name = n;
        this.race = r;
    }

    public void display() {
        System.out.print("\nDetail Hewan Peliharaan:\n");
        System.out.println("Nama hewan peliharaanku adalah : " + name);
        System.out.println("Dengan ras : " + race);
    }
}