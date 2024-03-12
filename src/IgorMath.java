import java.util.Random;
import java.util.Scanner;

public class IgorMath {
    private final static int MAX_RUNDEN_PRO_RAUM = 10;
    private static int MAX_ZAHL = 10;

    public static void addierenWirNeRunde() {
        int zahl1 = 0;
        int zahl2 = 0;
        int counter = 0;

        while (true) {
            counter++;
            if (counter % MAX_RUNDEN_PRO_RAUM == 0) {
                MAX_ZAHL += 10;
            }

            System.out.println("Hier die Aufgabe:");

            zahl1 = randomizer(MAX_ZAHL);
            zahl2 = randomizer(MAX_ZAHL);

            System.out.println(zahl1 + "+" + zahl2);

            System.out.println("Kennen Sie die Antwort?");
            long startTime = System.currentTimeMillis();

            String antwort = new Scanner(System.in).nextLine();
            while (antwort.isEmpty() || antwort.isBlank()) {

                System.out.println("Kennen Sie die Antwort?");
                System.out.println("Ihre Antowrt bitte:  ");
                antwort = new Scanner(System.in).nextLine();
            }

            if (antwort.equals("ja")) {
                long endTime = System.currentTimeMillis();
                Integer result = new Scanner(System.in).nextInt();

                if (result == addNumbers(zahl1, zahl2)) {

                    System.out.println("Bravo!" +
                            "\nÜbrigens war Ihre Denkzeit für die Aufgabe " + (endTime - startTime) / 1000 + " Sekunde(n).");

                } else {
                    System.out.println("Leider nicht! Richige Antwort war " + (zahl1 + zahl2));
                    System.out.println("Probiere es noch einmal!");


                    //addierenWirNeRunde();
                }


            } else {
                System.out.println("Ihre eingabe verstehe ich nicht!");
                System.out.println("Probieren Sie noch einmal");
                antwort = new Scanner(System.in).nextLine();

            }


//            System.out.println(" \nNoch eine Runde addieren?");
//
//            String antwort2 = new Scanner(System.in).nextLine();
//            while (antwort2.isEmpty() && antwort2.isBlank()) {
//
//                System.out.println(" \nNoch eine Runde addieren?");
//                System.out.println("Ihre Antowrt bitte:  ");
//                antwort2 = new Scanner(System.in).nextLine();
//            }
//
//            if (antwort2.equals("ja")) {
//                addierenWirNeRunde();
//            } else {
//                Main.gameMenue();
//            }
        }

    }

    public static int randomizer(int range) {

        Random randomNumber = new Random();
        return randomNumber.nextInt(range);

        //throw new IllegalStateException("Ungültige Eingabe");
    }

    public static int addNumbers(int a, int b) {

        return a + b;
    }

    public static int substractNumbers(int a, int b) {

        return a - b;
    }

    public static int multipleNumbers(int a, int b) {

        return a * b;
    }

    public static int devideNumbers(int a, int b) {

        return a / b;
    }
}






