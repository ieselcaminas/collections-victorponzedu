package refuerzoII;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println(esHyperpar(100)); //false
        System.out.println(esHyperpar(202)); //true
        System.out.println(esHyperpar(1024)); //false
    }
    public static boolean esHyperpar(int numero){
        int numeroIesimo;
        while (numero > 0){
            //Nos quedamos con el último dígito
            numeroIesimo = numero % 10;
            //Nos quedamos con el resto de dígitos
            numero /= 10;
            if (numeroIesimo % 2 != 0)
                return false;

        }
        return true;
    }
}