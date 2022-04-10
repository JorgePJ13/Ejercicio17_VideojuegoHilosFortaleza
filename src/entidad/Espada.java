package entidad;

public class Espada extends Arma {

	private int plusEspada;

	public Espada() {

	}

	public Espada(int plusEspada) {
		super();
		this.plusEspada = plusEspada;
	}

	public int getPlusEspada() {
		return plusEspada;
	}

	public void setPlusEspada(int plusEspada) {
		this.plusEspada = plusEspada;
	}

	@Override
	public int usar() {
		int danioEspada = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Guerrero) {
			Guerrero g = (Guerrero) this.getP();
			danioEspada = danioEspada + g.getFuerza();
			danioEspada = danioEspada + plusEspada;
		}
		return danioEspada;
	}

}
