import java.util.Scanner;

public class PRAK102_2410817220015_AshmaSalimah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Number = scan.nextInt();
        int Row = 1;

        while (Row <= 11) {
            if(Number % 5 == 0) {
                System.out.print(Number / 5 - 1);}
            else {
                System.out.print(Number);}
            if(Row < 11) {
                System.out.print(", ");}
            Number ++;
            Row++;
        }

        scan.close();
    }
}