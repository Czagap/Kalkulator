import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        System.out.println("Witaj");
        System.out.println("Jakie działanie chcesz wykonwac?");
        System.out.println("[1] -- Dodawanie" + "\n" + "[2] -- Odejmowanie" + "\n" + "[3] -- Mnozenie");
        System.out.println("[4] -- Dzielenie" + "\n" + "[5] -- Potengowanie" + "\n" + "[6] -- Pierwiastkowanie");

        Scanner scan = new Scanner(System.in);
        int A = 0;
        int B = 0;
        System.out.println("Wybieram: ....");
        int opc = scan.nextInt();
        System.out.println("Wybrano: " + opc);

        if (opc == 1 || opc == 2 || opc == 3 || opc == 4) {
            System.out.println("Podaj pierwszą liczbe");
            A = scan.nextInt();
            System.out.println("Podaj druga liczbe");
            B = scan.nextInt();
        }
        else if (opc == 5) {
            System.out.println("Podaj pierwszą liczbe");
            A = scan.nextInt();
            System.out.println("Podaj druga liczbe");
            B = scan.nextInt();}
        else if (opc == 6) {
            System.out.println("Podaj pierwszą liczbe");
            A = scan.nextInt();
        }

        switch (opc) {
            case 1:

                System.out.println("Wynik to:" + (A + B));
                break;
            case 2:

                System.out.println("Wynik to:" + (A - B));
                break;
            case 3:

                System.out.println("Wynik to:" + (A * B));
                break;
            case 4:

                System.out.println("Wynik to:" + (A / B));
                break;
            case 5:

                System.out.println("Wynik to:" + Math.pow(A, B));
                break;
            case 6:

                System.out.println("Wynik to:" + Math.sqrt(A));
                break;
            default:
                System.out.println("Wpisz cyfre z tych ktore sa do wyboru");
        }

    }

}


