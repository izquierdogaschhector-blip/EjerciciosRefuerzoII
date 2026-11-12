import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 2, 5, 6, 7};

        System.out.println(mediana(numeros));
    }
    public static double mediana(int numeros[]) {
        Arrays.sort(numeros); // 1 2 4 5 6
        int n = numeros.length;
        double mediana = 0;
        //1 3 4 5 6 7
        if (numeros.length % 2 == 0) {
            int n1 = numeros[n / 2 - 1];
            int  n2 = numeros[n / 2];
            mediana = (n1  + n2)/ 2.0;
        } else {
            mediana = numeros[n / 2];
        }
        return mediana;
    }
}
