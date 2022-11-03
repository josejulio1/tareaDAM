package ejercicios.tematres;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer divisoresNum1 = new StringBuffer();
        StringBuffer divisoresNum2 = new StringBuffer();

        int numeroIntroducido = 0, numMayor2 = 0;
        int numToken1 = 0, numToken2 = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Introduce el " + i + "º número");
            numeroIntroducido = in.nextInt();

            for (int j = numeroIntroducido; j > 1;) {
                for (int k = 2; k < numeroIntroducido; k++) {
                    if ((j % k) == 0 && j != 1 && i == 1) {
                        j /= k;
                        divisoresNum1.append(k + ",");
                        k = 2;
                    } else if ((j % k) == 0 && j != 1 && i == 2) {
                        j /= k;
                        divisoresNum2.append(k + ",");
                        k = 2;
                    }
                }
            }
        }

        StringTokenizer divisoresToken1 = new StringTokenizer(divisoresNum1.toString(), ",");
        StringTokenizer divisoresToken2 = new StringTokenizer(divisoresNum2.toString(), ",");
        int longitud = divisoresToken1.countTokens() + divisoresToken2.countTokens();

        for (int i = 0; i < longitud; i++) {
            if (divisoresToken1.countTokens() >= divisoresToken2.countTokens()) {
                for (int j = 0; j < divisoresToken1.countTokens(); j++) {
                    numToken1 = Integer.parseInt(divisoresToken1.nextToken());
                    for (int k = 0; k < divisoresToken2.countTokens(); k++) {
                        numToken2 = Integer.parseInt(divisoresToken2.nextToken());
                         if (numToken1 == numToken2) {
                             numMayor2 = numToken2;
                         } else if (!divisoresToken2.hasMoreTokens()) {
                             break;
                         }
                    }
                }
            }
        }

        System.out.println(numToken1);
        System.out.println(divisoresNum1.toString());
    }
}
