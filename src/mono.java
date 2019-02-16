
public class mono {
	private String nombre;
	private String raza;
	private int altura;
	private int peso;
	private String zoo;
	
	public mono (String n, String r, int a, int p, String z) {
		
		this.nombre=n;
		this.raza=r;
		this.altura=a;
		this.peso=p;
		this.zoo=z;
		}

	public String getNombre() {
		return nombre;
	}
	public void comer() {
		System.out.println("El puto mono "+nombre+" se está comiendo un plátano en la solera con el cochambrozo del barbas");
	}
	public void cazar() {
		System.out.println("El mono "+nombre+" del "+zoo+" está cazando gatos en Los Billares con Ibán");
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getZoo() {
		return zoo;
	}

	public void setZoo(String zoo) {
		this.zoo = zoo;
	}

	}
	