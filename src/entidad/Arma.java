package entidad;

public abstract class Arma {

	protected String nombre;
	protected int danioMax;
	protected int danioMin;
	protected Personaje p;

	public Arma() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDanioMax() {
		return danioMax;
	}

	public void setDanioMax(int danioMax) {
		this.danioMax = danioMax;
	}

	public int getDanioMin() {
		return danioMin;
	}

	public void setDanioMin(int danioMin) {
		this.danioMin = danioMin;
	}

	public Personaje getP() {
		return p;
	}

	public void setP(Personaje p) {
		this.p = p;
	}

	public abstract int usar();
}
