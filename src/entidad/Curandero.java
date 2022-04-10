package entidad;

public class Curandero extends Personaje {

	private int sabiduria;

	public Curandero() {

	}

	public Curandero(int sabiduria) {
		super();
		this.sabiduria = sabiduria;
	}

	public Curandero(int id, String nombre, Arma arma, int puntosVida, Fortaleza fortaleza, Jefe jefe, boolean entra,
			ControlPersonajes cp, int sabiduria) {
		super(id, nombre, arma, puntosVida, fortaleza, jefe, entra, cp);
		this.sabiduria = sabiduria;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

}
