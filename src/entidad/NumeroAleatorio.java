package entidad;

public class NumeroAleatorio {

	// Generador de numero aleatorio.
	public static int generadorNumeroAleatorio(int maximo, int minimo) {
		int numero_Aleatorio = (int) ((Math.random() * (maximo - minimo)) + minimo);
		return numero_Aleatorio;
	}
}
