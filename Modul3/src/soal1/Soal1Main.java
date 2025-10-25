package soal1;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dice randomDice = new Dice();

        int numberOfDice = scan.nextInt();

        randomDice.randomValue(numberOfDice);
        randomDice.Display();
        scan.close();
    }
}