import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el canal en número en el que estás");
        int canal1 = sc.nextInt();

        System.out.println("Introduce el canal en número al que quieres llegar");
        int canal2 = sc.nextInt();

        int avanzar = 0;
        int retroceder = 0;

        int canales = 99;

        if (canal1 >= canal2) {
            avanzar = (canales - canal1) + canal2;
            retroceder = canal1 - canal2;
        } else {
            avanzar = canal2 - canal1;
            retroceder = (canal1 - 1) + (canales - canal2) + 1;
        }

        if (avanzar < retroceder) {
            System.out.println(avanzar);
        } else {
            System.out.println(retroceder);
        }
    }
}
