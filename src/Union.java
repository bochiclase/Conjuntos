import java.util.*;


public class Union {
	private Set<Integer> caracter = new TreeSet<Integer>();

	
	public Union(String entrada){
		 String formateado = entrada.replace((char) ('['&']'&','), ' ');
		 String[] s =  formateado.split("+");
		 int cad1 = Integer.parseInt(s[0]);
		 int cad2 = Integer.parseInt(s[1]);
		 caracter.add(cad1);
		 caracter.add(cad2);
		 }


	public Set<Integer> getCaracter() {
		return caracter;
	}


	public void setCaracter(Set<Integer> caracter) {
		this.caracter = caracter;
	}
		
	
	// Introduce la cadena de numeros
	// [1,2,3]+[5,3,8]
}
