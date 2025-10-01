import java.util.Scanner;

public class PRAK104_2410817220015_AshmaSalimah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String[] Abu = scan.nextLine().split(" ");
        System.out.print("Tangan Bagas: ");
        String[] Bagas = scan.nextLine().split(" ");

        int ScoreAbu = 0;
        int ScoreBagas = 0;
        for (int i = 0; i < 3; i++) {
            if(Abu[i].charAt(0) == 'B' && Bagas[i].charAt(0) == 'G' ||
                Abu[i].charAt(0) == 'G' && Bagas[i].charAt(0) == 'K' ||
                Abu[i].charAt(0) == 'K' && Bagas[i].charAt(0) == 'B') {
                ScoreAbu++; }
            else if(Bagas[i].charAt(0) == 'B' && Abu[i].charAt(0) == 'G' ||
                Bagas[i].charAt(0) == 'G' && Abu[i].charAt(0) == 'K' ||
                Bagas[i].charAt(0) == 'K' && Abu[i].charAt(0) == 'B') {
                ScoreBagas++; } }

        if(ScoreAbu > ScoreBagas) {
            System.out.print("Abu"); }
        else if(ScoreBagas > ScoreAbu) {
            System.out.print("Bagas"); }
        else {
            System.out.print("Seri"); }

        scan.close();
    }
}
