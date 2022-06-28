public class coche {
    public static void main(String[] args) {
        int numeroPuertas;

        //Llama a la función
        int funcion = contador(6);
        System.out.println("Puertas actualmente: " + funcion);

    }

    static int contador(int numeroPuertas) {
        numeroPuertas++;
        return numeroPuertas;
    }
}