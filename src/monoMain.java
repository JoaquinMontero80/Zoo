
public class monoMain {

	public static void main(String[] args) {
		
		mono pepito = new mono ("Pepe", "chimpanc�", 155, 80, "zoo de Jerez");
		System.out.println ("El mono favorito del zoo es: "+pepito.getNombre());
		System.out.println("El mono "+pepito.getNombre()+ " pesa "+pepito.getPeso()+ "Kg");
		pepito.comer();
		pepito.cazar();
		

	}

}
