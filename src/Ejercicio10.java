import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de compartimentos");
        int compartimento = sc.nextInt();
        System.out.println("Introduce la capacidad del compartimento más grande");
        int maxLitros = sc.nextInt();
        System.out.println("Por último, la diferencia de litros entre compartimentos");
        int diferencia = sc.nextInt();

        System.out.println(litros(compartimento, maxLitros, diferencia));

    }
    public static int litros(int compartimento, int maxLitros, int diferencia) {
        int litrosActual = maxLitros;
        int litros = 0;

        for (int i = 0; i < compartimento; i++) {
            litros += litrosActual;
            litrosActual -= diferencia;
        }
        return litros;
    }
}
