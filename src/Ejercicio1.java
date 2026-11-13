public class Ejercicio1 {
    public static void main(String[] args) {
        int[] n = new int[] {8,7,6,9,5,1,7};
        String numero = String.valueOf(n);
        int digito;
        boolean creciente = false;
        boolean decreciente = false;

        for (int i = 0; i < n.length - 1; i++) {
            digito = numero.charAt(i);
            if (n[i] < n[i + 1]) {
                creciente = true;
            }else if (n[i] > n[i + 1]) {
                decreciente = true;
            }

        }
        // ascendente   descendente
        //     true         false -> ascendente
        //     false        true -> descendente
        //     true         true -> desordenado
        //                       -> iguales
    }
}
