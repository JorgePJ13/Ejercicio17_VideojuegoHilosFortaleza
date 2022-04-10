package entidad;

public class Hacha extends Arma {

	private int plusHacha;

	public Hacha() {

	}

	public Hacha(int plusHacha) {
		super();
		this.plusHacha = plusHacha;
	}

	public int getPlusHacha() {
		return plusHacha;
	}

	public void setPlusHacha(int plusHacha) {
		this.plusHacha = plusHacha;
	}

	@Override
	public String toString() {
		return "Hacha [plusHacha=" + plusHacha + "]";
	}

	@Override
	public int usar() {
		int danioHacha = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Guerrero) {
			Guerrero g = (Guerrero) this.getP();
			danioHacha = danioHacha + g.getFuerza();
			danioHacha = danioHacha + plusHacha;
		}
		return danioHacha;
	}

}
