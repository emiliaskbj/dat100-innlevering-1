import java.util.Scanner;

public class Trinnskatt {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        double inntekt = tastatur.nextDouble();

        double skatt;

        if (inntekt <= 226100) {
            skatt = 0;
        } else if (inntekt <= 318300) {
            skatt = (inntekt - 226100) * 0.017;
        } else if (inntekt <= 725050) {
            skatt = (318300 - 226100) * 0.017
                    + (inntekt - 318300) * 0.04;
        } else if (inntekt <= 980100) {
            skatt = (318300 - 226100) * 0.017
                    + (725050 - 318300) * 0.04
                    + (inntekt - 725050) * 0.137;
        } else if (inntekt <= 1467200) {
            skatt = (318300 - 226100) * 0.017
                    + (725050 - 318300) * 0.04
                    + (980100 - 725050) * 0.137
                    + (inntekt - 980100) * 0.168;
        } else {
            skatt = (318300 - 226100) * 0.017
                    + (725050 - 318300) * 0.04
                    + (980100 - 725050) * 0.137
                    + (1467200 - 980100) * 0.168
                    + (inntekt - 1467200) * 0.178;
        }

        System.out.println("Trinnskatt: " + skatt + " kr");
    }
}