package praktikum2.soal1;

public class Fruit {
    String Name;
    double Weight;
    double Price;
    double totalPurchased;
    final double Discount = 0.02;
    final double discWeight = 4.0;

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getWeight() {
        return Weight;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public void setTotalPurchased(double totalPurchased) {
        this.totalPurchased = totalPurchased;
    }

    public double getTotalPurchased() {
        return totalPurchased;
    }

    public double getTotalPriceBeforeDiscount() {
        return (Price / Weight) * totalPurchased;
    }

    public double getTotalDiscount() {
        double totalDiscount = (int) (totalPurchased / discWeight) * (discWeight * Price) * Discount;
        return totalDiscount;
    }

    public double getTotalPriceAfterDiscount() {
        return getTotalPriceBeforeDiscount() - getTotalDiscount();
    }

    public void display() {
        System.out.println("Nama Buah: " + Name);
        System.out.println("Berat: " + Weight);
        System.out.println("Harga: " + Price);
        System.out.println("Jumlah Beli: " + totalPurchased + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getTotalPriceBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f%n", getTotalDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n%n", getTotalPriceAfterDiscount());
    }
}