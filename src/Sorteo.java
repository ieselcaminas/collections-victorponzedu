import java.util.HashMap;
import java.util.Map;

public class Sorteo {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"03943", "93494", "88384", "95955"}));
    }
    public static Map<Character, Integer> terminaciones(String[] boletos){
        Map<Character, Integer> terminaciones = new HashMap<>();
        Character ultimo;
        Integer cont;

        for(String boleto: boletos){
            //Valor de la terminación
            ultimo = boleto.charAt(boleto.length() - 1);
            //Obtenemos el valor del valor
            cont = terminaciones.get(ultimo);
            //Si la clave no existía, ponemos un 1. Si no, aumentamos en 1 el valor
            if (cont == null){
                terminaciones.put(ultimo, 1);
            }else{
                terminaciones.put(ultimo, cont + 1);
            }
        }

        return terminaciones;
    }
}
