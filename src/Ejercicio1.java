public class Ejercicio1 {
    public static void main(String[] args) {
        int[] n = {5, 5, 6 ,7 , 8, 9};
        System.out.println(orden(n));

        // ascendente   descendente
        //     true         false -> ascendente
        //     false        true -> descendente
        //     true         true -> desordenado
        //                       -> iguales
    }
    public static String orden(int[] num) {
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                ascendente = true;
            }else if (num[i] > num[i + 1]) {
                descendente = true;
            }
        }
        if (ascendente && descendente) {
            return "Desordenado";
        }else if (ascendente) {
            return "Ascendente";
        }else if (descendente) {
            return  "Descendente";
        }else{
            return "Iguales";
        }
    }
}
