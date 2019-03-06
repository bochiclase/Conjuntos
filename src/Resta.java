import java.util.ArrayList;
import java.util.List;

public class Resta {

	private List <Integer> inter = new ArrayList <Integer>();
	
	public Resta (String entrada) {
		int numero;
		String formateado = entrada.replace((char) ('['&']'&'-'&','), ' ');
		String[] s =  formateado.split("-");
		String cad1 = s[0];
	    String cad2 = s[1];
	    for (int i =0; i<cad1.length(); i++) {
			for (int j=0; j<cad2.length(); j++) {
				if(cad1.charAt(i) != cad2.charAt(j)) {
					numero = (int)(cad2.charAt(j));
					inter.add(numero);
				}
			}
		}
	
	}

	@Override
	public String toString() {
		return "[" + inter + "]";
	}
}
//Introduce la cadena de numeros
	// [1,2,3]+[5,3,8]