import java.io.*;
import java.util.*;

public class CountCountries {

    public static Map<String, Integer> countCountries() throws IOException{
        Map<String, Integer> map = new HashMap<String, Integer>();

        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String line;
        String[] campos;
        String pais;
        Integer cuantos;
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            campos = line.split(",");
            pais = campos[6];

            cuantos = map.get(pais);
            //Una forma más corta de hacerlo
            map.put(pais, map.getOrDefault(pais, 0) + 1);
//            if (cuantos == null )
//                map.put(pais, 1);
//            else
//                map.put(pais, cuantos + 1);
        }

        reader.close();
        return map;
    }
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Map<String, Integer> paises = countCountries();
        System.out.println(paises);

    }
}