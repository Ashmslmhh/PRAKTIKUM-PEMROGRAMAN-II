package soal2;

public class Dog extends Pet {
    private final String color;
    private final String[] abilities;

    public Dog(String n, String r, String c, String[] a) {
        super(n, r);
        this.color = c;
        this.abilities = a;
    }

    public void displayDog() {
        super.display();
        System.out.println("Memiliki warna bulu : " + color);
        System.out.print("Memiliki kemampuan : ");
        for (String ability : abilities) {
            System.out.print(ability + " ");
        }
        System.out.println();
    }
}