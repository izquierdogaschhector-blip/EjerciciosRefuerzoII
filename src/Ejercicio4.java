import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,5,7,6,2,2,0,9,8};

        System.out.println("La moda es "+moda(numeros));

    }
    public static int moda(int[] numeros) {

        int contador = 0;
        int maximorepetidos = 0;
        int moda = 0;

        for (int i = 0; i < numeros.length; i++) {
            contador = 0;
            for (int j = i; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }
            if  (contador > maximorepetidos){
                maximorepetidos = contador;
                moda = numeros[i];
            }
        }
        return moda;
    }

}
