import java.util.ArrayList;
import java.util.List;

public class Resta {

	private List <Integer> inter = new ArrayList <Integer>();
	
	public Resta (String entrada) {
		int numero;
		String formateado = entrada.replace((char) ('['&']'&'-'), ' ');
		String[] s =  formateado.split("-");
		int cad1 = Integer.parseInt(s[0]);
	    int cad2 = Integer.parseInt(s[1]);
	    for (int i=0; i<s[0].length(); i++) {
	    	if(cad1 )
	    	
	    }
				
			}
		
	
	

	@Override
	public String toString() {
		return "[" + inter + "]";
	}
}
//Introduce la cadena de numeros
	// [1,2,3]-[5,3,8]