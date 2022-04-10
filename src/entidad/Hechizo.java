package entidad;

public class Hechizo extends Arma {

	private int plusHechizo;

	public Hechizo() {

	}

	public Hechizo(int plusHechizo) {
		super();
		this.plusHechizo = plusHechizo;
	}

	public int getPlusHechizo() {
		return plusHechizo;
	}

	public void setPlusHechizo(int plusHechizo) {
		this.plusHechizo = plusHechizo;
	}

	@Override
	public int usar() {
		int danioHechizo = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Mago) {
			Mago m = (Mago) this.getP();
			danioHechizo = danioHechizo + m.getInteligencia();
			danioHechizo = danioHechizo + plusHechizo;
		}
		return danioHechizo;
	}
}
