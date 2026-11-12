import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce a que dia y mes (en numero) estamos: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();

    }
    public static int diasHastaNochevieja (int dia, int mes){
        int total = 0;

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = diasMes[mes - 1] - dia;
        for (int i = mes; i < 12; i++){
            res += diasMes[i];
        }
        return res;
    }
}
