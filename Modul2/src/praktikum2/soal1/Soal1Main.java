package praktikum2.soal1;

public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setName("Apel");
        apple.setWeight(0.4);
        apple.setPrice(7000.0);
        apple.setTotalPurchased(40.0);
        apple.display();

        Fruit mango = new Fruit();
        mango.setName("Mangga");
        mango.setWeight(0.2);
        mango.setPrice(3500.0);
        mango.setTotalPurchased(15.0);
        mango.display();

        Fruit avocado = new Fruit();
        avocado.setName("Alpukat");
        avocado.setWeight(0.25 );
        avocado.setPrice(10000.0);
        avocado.setTotalPurchased(12.0);
        avocado.display();
    }
}