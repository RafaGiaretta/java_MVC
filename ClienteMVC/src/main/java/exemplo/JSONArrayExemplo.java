package exemplo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class JSONArrayExemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("Informática");

		lista.add("Computação");

		lista.add("Tecnologia");

		JSONArray json = new JSONArray();

		for(String l: lista) {

		json.put(l);

		}

		System.out.println(json.toString());
	}

}
