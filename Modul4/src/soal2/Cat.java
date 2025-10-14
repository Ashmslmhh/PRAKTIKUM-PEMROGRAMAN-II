package soal2;

public class Cat extends Pet {
    private final String color;

    public Cat(String n, String r, String c) {
        super(n, r);
        this.color = c;
    }

    public void displayCat() {
        super.display();
        System.out.println("Memiliki warna bulu : " + color);
    }
}