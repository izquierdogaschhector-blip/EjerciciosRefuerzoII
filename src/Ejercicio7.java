import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el canal en número en el que estas");
        int canal1 = sc.nextInt();
        System.out.println("Introduce el canal en número al que queires llegar");
        int canal2 = sc.nextInt();
        int avanzar = 0;
        int retroceder = 0;

        int canales = 99;

        for (int i = 0; i <= canales; i++) {
            if (canal1 >= canal2) {
                avanzar = canal1-canal2;
            } else {
                avanzar = ( canales - canal1) + canal2;
            }
            if (canal1 >= canal2) {
                retroceder = canal1 - canal2;
            } else {
                retroceder = (canal1 - 1) + (canales - canal2) + 1;
            }
        }
        if (avanzar < retroceder) {
            System.out.println(avanzar);
        } else {
            System.out.println(retroceder);
        }
    }
}
