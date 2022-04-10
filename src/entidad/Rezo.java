package entidad;

public class Rezo extends Arma {

	private int plusRezo;

	public Rezo() {

	}

	public Rezo(int plusRezo) {
		super();
		this.plusRezo = plusRezo;
	}

	public int getPlusRezo() {
		return plusRezo;
	}

	public void setPlusRezo(int plusRezo) {
		this.plusRezo = plusRezo;
	}


	@Override
	public int usar() {
		int danioRezo = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Curandero) {
			Curandero c = (Curandero) this.getP();
			danioRezo = danioRezo + c.getSabiduria();
			int puntosSanados = plusRezo + c.getSabiduria();
			int vida = c.getPuntosVida() + puntosSanados;
			c.setPuntosVida(vida);
		}
		return danioRezo;
	}
}
