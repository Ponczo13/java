import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Program
    {
        public static String informacja() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj nazwę użytkownika : ");
            String w = scan.nextLine();
            return w;
        }
                public static int menu() {
                    Scanner scan = new Scanner(System.in);
                    String nick = informacja() ;
                    System.out.println("___________________________________________________");
                    System.out.println("|    Witaj " + nick + ", co chcesz dzisiaj zrobić? |");
                    System.out.println("|           Wybierz liczbę od 1 do 3              |");
                    System.out.println("| 1. Zgadnij moją liczbę :)                       |");
                    System.out.println("| 2. Cytat dnia                                   |");
                    System.out.println("| 3. Moje top 10 najlepszych piłkarzy na świecie  |");
                    System.out.println("| 0. Wyjscie ");

                    int wybor =  scan.nextInt();
                return wybor;
                }

        public static void main(String[] args)throws IOException {
            Scanner scan = new Scanner(System.in);

        int wybor = menu();
        while(wybor!=0){

            switch (wybor)
            {
                case 1:
                    int a,b;
                    System.out.println("Podaj liczbę pierwszą : ");
                     a = scan.nextInt();
                    System.out.println("Podaj liczbę drugą : ");
                     b = scan.nextInt();
                    Random generator = new Random();
                    int liczba = generator.nextInt(100) + 1;
                    if (liczba == a || liczba == b) {
                        System.out.println("Wygrana wow :) Zgadłeś " + liczba);
                    } else {
                        System.out.println("Przegrana :( Wygrywającą liczbą było: " + liczba);
                        break;

                    }
                case 2:
                    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";

                    String alphaNumeric = lowerAlphabet;


                    StringBuilder sb = new StringBuilder();


                    Random random = new Random();


                    int length = 5;

                    for (int i = 0; i < length; i++) {


                        int index = random.nextInt(alphaNumeric.length());


                        char randomChar = alphaNumeric.charAt(index);


                        sb.append(randomChar);
                    }

                    String randomString = sb.toString();
                    System.out.println("Cytat dnia to: " + randomString);
                    break;
                case 3:
                    System.out.println("Moje top 10 piłkarzy na świecie:");
                    System.out.println("10. Javier Zanetti");
                    System.out.println("9.  Kylina Mbappe(Mambeppe)");
                    System.out.println("8.  Marco Reus(let's go what's class)");
                    System.out.println("7.  Feferico Chiesa (Bardzo podoba mi sie jego karta w fifie ( trafiłem go niewymiennego i czuje satysfakcję))");
                    System.out.println("6.  Ronaldinho (Ten jego brazylijski luzzzz)");
                    System.out.println("5.  Kevin De bruyne (KDB klasa sama w sobie)");
                    System.out.println("4.  Robert lewandowski ( Robuś polak rodak) ");
                    System.out.println("3.  Pele (RIP legend ");
                    System.out.println("2.  Lionel Messi(Pessi)");
                    System.out.println("1. ERLING HALLAND (Cudowny wykańczator akcji city i najlepszy zawodnik na świecie aktualnie i pozostanie na topie przez najlbliższe 10 lat ");
                    System.out.println("Ocenka listy od 1 do 10 ( ale bez hejtu) ");
                    int ocena = scan.nextInt();
                    if (ocena > 7) {
                        System.out.println("Dziękuje za ocenę kolego podrawiam :)");
                    } else {
                        System.out.println("Aha? Mówiłem że bez hejtu kłamczuszku :(");
                    }
                    break;
                    default:
                        System.out.println("Nie ma takiej opcji :(");
                        break;

            }
            System.out.println("\nWciśij enter aby kontynuować...");
            System.in.read();

            wybor=menu();
        }

        }
    }

