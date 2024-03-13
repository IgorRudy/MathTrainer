import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            menue();
        }catch (Exception e){

            System.out.println("Etwas ist schief gelaufen: " + e);

        }


    }

    public static void menue(){
        while(true){

            System.out.println("Hallo!" +
                    "Wollen wir ein wenig Kopfrechnen üben?");
            String antwort = new Scanner(System.in).nextLine();
            if (antwort.equals("ja")){
                gameMenue();
            }
            else {
                System.out.println(
                        "\nIn Ordnung!" +
                        "Das Programm wird nun beendet!");
                break;
            }
        }

    }
    public static void gameMenue(){

            System.out.println("Wollen wir " +
                    "\n1. Addieren?" +
                    "\n2. Exrahieren?" +
                    "\n3. Multplizieren?" +
                    "\n4. Devidieren?");

            int eingabe = new Scanner(System.in).nextInt();
            switch (eingabe){
                case 1 : IgorMath.addierenWirNeRunde();
                    break;
                default:
                    System.out.println("Ungültig!");
            }
    }


}
