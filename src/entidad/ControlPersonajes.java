package entidad;

import java.util.LinkedList;
import java.util.Queue;

public class ControlPersonajes {
	
	private int entrando; // barcos que estan entrando

	private int saliendo; // barcos que estan saliendo

	private int esperandoSalir; // barcos que estan esperando para salir.

	private int finEntrando; // fin de barcos que entran

	private int finSaliendo; // fin de barcos que salen

	private Queue<Personaje> ordenEntrada; // cola de barcos ordenados que quieren entrar.

	private Queue<Personaje> ordenSalida; // cola de barcos ordenados que quieren salir.

	public ControlPersonajes() {
		entrando = 0;
		saliendo = 0;
		esperandoSalir = 0;
		finEntrando = 0;
		finSaliendo = 0;
		ordenEntrada = new LinkedList<Personaje>();
		ordenSalida = new LinkedList<Personaje>();
	}
	
	public synchronized void permisoEntrada(Personaje p) {
		System.out.println("El personaje " + p.getId() + " quiere entrar a la fortaleza");
		ordenEntrada.add(p);
		while (entrando > 0 || saliendo > 0 || esperandoSalir > 0 || ordenEntrada.element().getId() != p.getId()) {
			// element() devuelve la cabeza de la cola
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ordenEntrada.poll(); // esta funcion devuelve el elemento al frente de la cola. Devuelve nulo si esta
								// vacia
		System.out.println("El personaje " + p.getId() + " puede entrar a la fortaleza");
		entrando++;
	}

	public synchronized void permisoSalida(Personaje p) {
		ordenSalida.add(p);
		System.out.println("El Personaje " + p.getId() + " tiene que salir de la fortaleza por ser derrotado");
		while (entrando > 0 || ordenSalida.element().getId() != p.getId()) {
			// element() devuelve la cabeza de la cola
			try {
				esperandoSalir++; // preferencia
				wait();
				esperandoSalir--; // preferencia
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ordenSalida.poll(); // esta funcion devuelve el elemento al frente de la cola. Devuelve nulo si esta
							// vacia
		saliendo++;
		System.out.println("El Personaje " + p.getId() + " puede salir de la fortaleza tras ser derrotado");
	}

	public synchronized void finEntrada(Personaje p) {
		entrando--;
		finEntrando++;
		if (entrando == 0)
			notifyAll(); // Despierto a todos
	}

	public synchronized void finSalida(Personaje p) {
		saliendo--;
		finSaliendo++;
		if (saliendo == 0)
			notifyAll(); // Despierto a todos
	}
}
