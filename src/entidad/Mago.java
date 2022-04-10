package entidad;

public class Mago extends Personaje {

	private int inteligencia;

	public Mago() {

	}

	public Mago(int inteligencia) {
		super();
		this.inteligencia = inteligencia;
	}

	

	public Mago(int id, String nombre, Arma arma, int puntosVida, Fortaleza fortaleza, Jefe jefe, boolean entra,
			ControlPersonajes cp, int inteligencia) {
		super(id, nombre, arma, puntosVida, fortaleza, jefe, entra, cp);
		this.inteligencia = inteligencia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

}
