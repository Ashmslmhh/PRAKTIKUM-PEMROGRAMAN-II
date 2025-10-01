import java.util.Scanner;

public class PRAK103_2410817220015_AshmaSalimah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Row = scan.nextInt();
        int Number = scan.nextInt();
        int Start = 0;

        do {
            if(Number % 2 != 0) {
                System.out.print(Number);
                Start++;
                if(Start < Row) {
                    System.out.print(", "); } }
            Number++; }
        while (Start < Row);

        scan.close();
    }
}