package soal1;

public class Pet {
    private String name;
    private String breed;

    public Pet(String n, String b) {
        this.name = n;
        this.breed = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void display() {
        System.out.print("\nDetail Hewan Peliharaan:\n");
        System.out.println("Nama hewan peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getBreed());
    }
}