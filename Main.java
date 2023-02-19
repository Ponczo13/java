import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> planets = new ArrayList<>();
    public static void main(String[] args) {
        planets.add(0, "1");
        planets.add(1, "2");
        planets.add(2, "3");
        planets.add(3, "4");
        planets.add(4, "5");
        planets.add(5, "6");
        boolean isactive = true;
        while (isactive =true) {
            System.out.println("Wybierz [1,2,3,4]");
            System.out.println("1. Podgląd ");
            System.out.println("2. Edytuj ");
            System.out.println("3. Dodaj ");
            System.out.println("4. Wyjście  ");

            ArrayList<String> cars = new ArrayList<String>();
            Scanner scn = new Scanner(System.in);

            int MenuOption = scn.nextInt(); //Scan result
            if (MenuOption == 1) {
                System.out.println(planets);
            }

            if (MenuOption == 2) {
                System.out.println("Wybierz");
                System.out.println("0");
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("4");
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                System.out.println("Naciśnij 9 aby wyjść");

                Scanner editMenu = new Scanner(System.in);
                int editMenuOption = editMenu.nextInt();
                if (editMenuOption == 0) {
                    System.out.println("Co chciałbyś zmienić w pozycji 0 ?");
                    Scanner posZeroScan = new Scanner(System.in);
                    String posZeroScanEdit = posZeroScan.next();
                    planets.add(0, posZeroScanEdit);
                    System.out.println(planets);

                }

                if (editMenuOption == 1) {
                    System.out.println("Co chciałbyś zmienić w pozycji 1 ?");
                    Scanner posOneScan = new Scanner(System.in);
                    String posOneScanEdit = posOneScan.next();
                    planets.add(1, posOneScanEdit);
                    System.out.println(planets);
                }

                if (editMenuOption == 2) {
                    System.out.println("Co chciałbyś zmienić w pozycji 2 ?");
                    Scanner posTwoScan = new Scanner(System.in);
                    String posTwoScanEdit = posTwoScan.next();
                    planets.add(2, posTwoScanEdit);
                    System.out.println(planets);
                }

                if (editMenuOption == 3) {
                    System.out.println("Co chciałbyś zmienić w pozycji 3 ?");
                    Scanner posThreeScan = new Scanner(System.in);
                    String posThreeScanEdit = posThreeScan.next();
                    planets.add(3, posThreeScanEdit);
                    System.out.println(planets);

                }

                if (editMenuOption == 4) {
                    System.out.println("Co chciałbyś zmienić w pozycji 4 ?");
                    Scanner posFourScan = new Scanner(System.in);
                    String posFourScanEdit = posFourScan.next();
                    planets.add(4, posFourScanEdit);
                    System.out.println(planets);

                }

                if (editMenuOption == 5) {
                    System.out.println("Co chciałbyś zmienić w pozycji 5 ?");
                    Scanner posFiveScan = new Scanner(System.in);
                    String posFiveScanEdit = posFiveScan.next();
                    planets.add(5, posFiveScanEdit);
                    System.out.println(planets);

                }

                if (editMenuOption == 6) {
                    System.out.println("Co chciałbyś zmienić w pozycji 6 ?");
                    Scanner posSixScan = new Scanner(System.in);
                    String posSixScanEdit = posSixScan.next();
                    planets.add(6, posSixScanEdit);
                    System.out.println(planets);

                }

                if (editMenuOption == 7) {
                    System.out.println("Co chciałbyś zmienić w pozycji 7 ?");
                    Scanner posSevenScan = new Scanner(System.in);
                    String posSevenScanEdit = posSevenScan.next();
                    planets.add(7, posSevenScanEdit);
                    System.out.println(planets);

                } else {
                    System.exit(1);
                }

            }

            if (MenuOption == 3) {
                System.out.println("Co chciałbyś dodać? ");
                Scanner add = new Scanner(System.in);
                String addRes = add.next();

                planets.add(addRes);
                System.out.println(planets);


            }

            if (MenuOption == 4) {
                System.out.println("Nara!");
                System.exit(0);
            }

        }
    }
}