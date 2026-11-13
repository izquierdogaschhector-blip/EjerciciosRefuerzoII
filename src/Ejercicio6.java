public class Ejercicio6 {
    public static void main(String[] args) {
        int n = 4628;

        if (esHyperpar(n))
            System.out.println("Es hyperpar");
        else
            System.out.println("No es hyperpar");
    }

    public static boolean esHyperpar(int n) {
        String numero = String.valueOf(n);
        int digito;
        boolean es = true;
        for (int i = 0; i < numero.length(); i++) {
            digito = numero.charAt(i);
            if (digito % 2 != 0) {
                return false;
            }
        }
        return es;
    }
}
