import java.util.Scanner;

public class Karakter {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn poengsum: ");
        int poeng = tastatur.nextInt();

        if (poeng < 0 || poeng > 100) {
            System.out.println("Ugyldig poengsum");
        } else if (poeng >= 90) {
            System.out.println("A");
        } else if (poeng >= 80) {
            System.out.println("B");
        } else if (poeng >= 60) {
            System.out.println("C");
        } else if (poeng >= 50) {
            System.out.println("D");
        } else if (poeng >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}