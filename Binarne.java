import java.util.Scanner;

public class Binarne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę dziesiętną: ");
        int a = scan.nextInt();
        String binarna= "";
        while(a>0){
            binarna = (a%2) + binarna;
            a = a/2;
        }
        System.out.println("Liczba binarna z liczby, której podałeś to: "+ binarna);

    }
}
