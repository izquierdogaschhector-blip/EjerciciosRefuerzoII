import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número que desees");
        String n = sc.next();


    }
    public static String sumaDigitos (String digitos) {
        int caracteres = digitos.length();
        int total = 0;
        String resultado = "";

        for (int i = 0; i < caracteres; i++) {
            int digito = Integer.parseInt("" + digitos.charAt(i));

            total += digito;
            resultado += digito;

            if (i < caracteres - 1) {
                resultado += " + ";
            }
        }
        resultado += " = " + total;
        return resultado;
    }
}