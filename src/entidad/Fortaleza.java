package entidad;

public class Fortaleza {

	private String nombre;
	private Personaje jefe;

	public Fortaleza(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Fortaleza(String nombre, Personaje jefe) {
		this.jefe = jefe;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized void entrar(String nombreHeroe) {
		System.out.println("El Personaje " + nombreHeroe + " está listo para luchar en la fortaleza");
	}
	
	public synchronized void salir(String nombreHeroe) {
		System.out.println("El Personaje " + nombreHeroe + " ha salido de la fortaleza derrotado");
	}
//		System.out.println("El Héroe " + heroe + " junto a su arma " + arma
//				+ " entra a luchar en la Fortaleza " + this.nombre + " contra el Jefe " + jefe);
//
//		try {
//			System.out.println("El Jefe " + jefe + " está intimidando a su oponente...");
//			System.out.println("El Héroe " + heroe + " está plantando cara al Jefe con su " + arma);
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("El Héroe " + heroe + " está exhausto por la batalla");
//		System.out.println("La pelea ha terminado entre " + heroe + " y " + jefe);

}
