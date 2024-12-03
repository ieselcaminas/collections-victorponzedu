import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {


		Map<String, ArrayList<String>> mapa = generarMapa();

    }
	public static Map<String, ArrayList<String>> generarMapa()throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
		String palabraDesordenada;
		String palabraOrdenada;
		ArrayList<String> listaDesordenadas;
		Map<String, ArrayList<String>> mapaAnagramas = new HashMap<>();

		while ((palabraDesordenada = reader.readLine())!=null) {
			//Trabajar con line
			palabraOrdenada = alphabetize(palabraDesordenada);
			listaDesordenadas = mapaAnagramas.get(palabraOrdenada);

			if (listaDesordenadas == null){
				listaDesordenadas = new ArrayList<>();
				listaDesordenadas.add(palabraDesordenada);
				mapaAnagramas.put(palabraOrdenada, listaDesordenadas);
			}else{
				listaDesordenadas.add(palabraDesordenada);
				mapaAnagramas.put(palabraOrdenada, listaDesordenadas);
			}

		}
		reader.close();
		return mapaAnagramas;
	}
	private static String alphabetize(String s) {
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}

}
