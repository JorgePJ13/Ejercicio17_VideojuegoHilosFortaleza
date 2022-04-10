package entidad;

public class Guerrero extends Personaje {

	private int fuerza;

	public Guerrero() {

	}

	public Guerrero(int fuerza) {
		super();
		this.fuerza = fuerza;
	}

	

	public Guerrero(int id, String nombre, Arma arma, int puntosVida, Fortaleza fortaleza, Jefe jefe, boolean entra,
			ControlPersonajes cp, int fuerza) {
		super(id, nombre, arma, puntosVida, fortaleza, jefe, entra, cp);
		this.fuerza = fuerza;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

}
