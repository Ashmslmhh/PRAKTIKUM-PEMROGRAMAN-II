package praktikum2.soal2;

public class Coffee {
    public String NameOfCoffee;
    public String size;
    public double price;
    private String buyer;

    public void info() {
        System.out.println("Nama Kopi: " + this.NameOfCoffee);
        System.out.println("Ukuran: " + this.size);
        System.out.println("Harga: Rp. " + this.price);
    }

    public void setBuyer(String buyerName) {
        this.buyer = buyerName;
    }

    public String getBuyer() {
        return this.buyer;
    }

    public double getTax() {
        double taxRate = 0.11;
        return this.price * taxRate;
    }
}