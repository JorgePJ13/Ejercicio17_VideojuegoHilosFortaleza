package entidad;

public class Arco extends Arma {

	private int plusArco;

	public Arco() {
		
	}
	
	public Arco(int plusArco) {
		super();
		this.plusArco = plusArco;
	}

	public int getPlusArco() {
		return plusArco;
	}

	public void setPlusArco(int plusArco) {
		this.plusArco = plusArco;
	}

	@Override
	public int usar() {
		int danioArco = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Guerrero) {
			Guerrero g = (Guerrero) this.getP();
			danioArco = danioArco + g.getFuerza();
			danioArco = danioArco + plusArco;
		}
		return danioArco;
	}

}
