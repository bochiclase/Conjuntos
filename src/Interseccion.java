import java.util.*;

public class Interseccion {
	
	private List <Integer> inter = new ArrayList <Integer>();
	
	public Interseccion (String entrada) {
		int numero;
		String formateado = entrada.replace((char) ('['&']'&'*'&','), ' ');
		 String[] s =  formateado.split("*");
		 String cad1 =s[0];
		 String cad2 = s[1];
		 for (int i =0; i<cad1.length(); i++) {
				for (int j=0; j<i; j++) {
					if(cad1.charAt(i) == cad2.charAt(j)) {
						numero =(int) (cad1.charAt(i));
						inter.add(numero);
					}
				}
			
		
		}

	}

	@Override
	public String toString() {
		return "Interseccion [inter=" + inter + "]";
	}

	public List<Integer> getInter() {
		return inter;
	}

	public void setInter(List<Integer> inter) {
		this.inter = inter;
	}

}
