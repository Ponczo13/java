import java.util.Scanner;
public class PoryRoku {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Podaj liczbe miesiaca ");
        int m = scan.nextInt();
        if (m>=1 && m<=3) {
            System.out.println("Jest zima");
        } else if (m>=4 && m<=6) {
            System.out.println("Jest wiosna");
        } else if (m>=7 && m<=9) {
            System.out.println("Jest lato");
        } else if (m>=10 && m<=12) {
            System.out.println("Jest jesien");
        } else {
            System.out.println("Nie ma takiego miesiąca");
        }
    }
}