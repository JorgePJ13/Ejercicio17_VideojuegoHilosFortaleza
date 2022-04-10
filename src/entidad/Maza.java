package entidad;

public class Maza extends Arma {

	private int plusMaza;

	public Maza() {

	}

	public Maza(int plusMaza) {
		super();
		this.plusMaza = plusMaza;
	}

	public int getPlusMaza() {
		return plusMaza;
	}

	public void setPlusMaza(int plusMaza) {
		this.plusMaza = plusMaza;
	}

	@Override
	public String toString() {
		return "Maza [plusMaza=" + plusMaza + "]";
	}

	@Override
	public int usar() {
		int danioMaza = NumeroAleatorio.generadorNumeroAleatorio(getDanioMax(), getDanioMin());
		if(this.getP() instanceof Jefe) {
			Jefe j = (Jefe) this.getP();
			danioMaza = danioMaza + j.getFinisher();
			danioMaza = danioMaza + plusMaza;
		}
		return danioMaza;
	}
	
	

}
