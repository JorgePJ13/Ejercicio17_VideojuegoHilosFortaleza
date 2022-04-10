package entidad;

public class Jefe extends Personaje {

	private int finisher;

	public Jefe() {

	}

	public Jefe(int finisher) {
		super();
		this.finisher = finisher;
	}

	public Jefe(String nombre, Arma arma, int puntosVida, Fortaleza fortaleza, boolean entra, ControlPersonajes cp,
			int finisher) {
		super();
		this.nombre = nombre;
		this.arma = arma;
		this.puntosVida = puntosVida;
		this.fortaleza = fortaleza;
		this.entra = entra;
		this.cp = cp;
		this.finisher = finisher;
	}

	public int getFinisher() {
		return finisher;
	}

	public void setFinisher(int finisher) {
		this.finisher = finisher;
	}


	public boolean muertoJefe() {
		boolean estaMuerto = false;
		if (getPuntosVida() <= 0) {
			System.out.println("El Jefe Final " + this.nombre + " ha sido derrotado por fín !! :D");
			System.out.println("El pueblo sonríe de nuevo. El malvado " + this.nombre + " ha sido derrotado.");
			System.out.println("Vuelve a salir el sol...");
			estaMuerto = true;
		}
		return estaMuerto;
	}
}
