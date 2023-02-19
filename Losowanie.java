import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę pierwszą : ");
        int a = scan.nextInt();
        System.out.println("Podaj liczbę drugą : ");
        int b = scan.nextInt();
        Random generator = new Random();
        int liczba = generator.nextInt(100)+1;
        if (liczba ==a || liczba==b){
        System.out.println("Wygrana wow :)");}
        else {
            System.out.println("Przegrana :(");
        }
        }
    }

