import java.util.Scanner;

public class Kalkulator {


    public static void main(String[] args)
    {
        int a;
        int b;
        char znak;
        Scanner wej = new Scanner(System.in);
            System.out.println("Podaj pierwszą liczbę:");
            a = wej.nextInt();
            System.out.println("Podaj drugą liczbę:");
            b = wej.nextInt();
            System.out.println("Dodawanie dwóch liczb - wciśnij 1");
            System.out.println("Odejmowanie dwóch liczb - wciśnij 2");
            System.out.println("Mnożenie dwóch liczb - wciśnij 3");
            System.out.println("Dzielenie dwóch liczb - wciśnij 4");
            System.out.println("Operacaja modulo - wciśnij 5");
            System.out.println("Wyjście - wciścij 6");

            znak = wej.next().charAt(0);
            switch(znak)
             {
                case '1':
                {
                    int suma = a+b;
                    System.out.println("Wynik dodawania " + a + " i " + b + " wynosi " + suma);
                    break;
                }
                case '2':
                {
                    int roznica = a-b;
                    System.out.println("Wynik odejmowania " + a + " i " + b + " wynosi " + roznica);
                    break;
                }
                case '3':
                {
                    int iloczyn = a*b;
                    System.out.println("Wynik mnożenia " + a + " i " + b + " wynosi " + iloczyn);
                    break;
                }
                case '4':
                {
                    if(b !=0 && a !=0)
                    {
                        int iloraz = a/b;
                        int reszta = a%b;
                        System.out.println("Wynik dzielenia " + a + " i " + b + " wynosi " + iloraz + " oraz reszty " + reszta);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez zero!!!");
                    }
                    break;
                }
                case '5':
                {
                    if(b !=0 && a!=0)
                    {
                        int modulo = a % b;
                        System.out.println("Wynik modulo " + a + " i " + b + " wynosi " + modulo);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez zero!!");
                    }
                }
                case '6':
                {
                    System.out.println("Dziękuję za użycie kalkulatora :)");
                }

            }

        }
    }
