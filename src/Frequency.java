import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        System.out.println(frequency(new String[]{"uno", "dos dos", "tres", "tres", "tres"}));
    }
    public static Map<String, Integer> frequency(String[] palabras){
        Map<String, Integer> frequency = new HashMap<>();
        Integer cont;
        for (String palabra : palabras){
            cont = frequency.get(palabra);
            if (cont == null)
                frequency.put(palabra, 1);
            else
                frequency.put(palabra, cont + 1);
        }

        return frequency;
    }
}
