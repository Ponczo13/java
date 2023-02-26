import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Kfd {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("|****************************************|");
        System.out.println("|Ja być Akinator pomysl o dowolnej osobie|");
        System.out.println("|   Gotowe? To czekaj wymyśle pytanie    |");
        for (int i = 0; i <= 6 ; i++) {
            sleep(2000);
            System.out.println("|        Myślenie nad pytaniem...        |");
        }

        System.out.println("Dobra. Czy tewoja postać to ma sześciopak? t/n");
        String odp = scan.nextLine();
        System.out.println("|    Czy twoja postać to Michał Qdlik?   |");
        System.out.println("|    1. tak           |        2. tak    |");
        int w = scan.nextInt();
        if (w == 1 || w==2)
        {
            System.out.println("|         Wiedziałem no dobra nara       |");
            System.out.println("|    ********************************    |");
        }
        else
        {
            System.out.println("Kłamiesz nie da się nie myśleć o michale Qudlik gdy zadałem takie pytanie dobra nara >:(3");
        }

}
}
