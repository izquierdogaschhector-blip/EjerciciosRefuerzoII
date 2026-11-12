public class Ejercicio6 {
    public static void main(String[] args) {
        int numeros = 4618;
        String numero = String.valueOf(numeros);
        int suma = 0;
        boolean es = true;
        for  (int i = 0; i < numero.length(); i++) {
            if (!(numero.charAt(i) % 2 == 0)) {
                es = false;
                break;
            } else {
                suma += numero.charAt(i);
                System.out.println(suma);
            }
        }

    }
}
