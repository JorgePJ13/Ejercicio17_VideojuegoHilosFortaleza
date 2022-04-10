package entidad;

public class Batalla {

	private Personaje personaje;
	private Personaje pJefe;
	private Fortaleza fortaleza;

	public Batalla() {
		
	}
	
	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public Personaje getpJefe() {
		return pJefe;
	}

	public void setpJefe(Personaje pJefe) {
		this.pJefe = pJefe;
	}

	public Batalla(Personaje personaje, Personaje pJefe) {
		super();
		this.personaje = personaje;
		this.pJefe = pJefe;
	}

	public Personaje combate() {
		System.out.println("Da por comenzada la batalla por la Tierra Media en la Fortaleza de Barad-Dûr en Mordor\n");
		System.out.println(
				"Los heroes (Guerreros, Magos y Curanderos), unidos todos a una para luchar contra el Jefe Final "
						+ pJefe.getNombre());
		Personaje ganadorP = null;

		System.out.println("Empieza atacando el héroe debido a su rapidez...");
		System.out.println("El Héroe " + personaje.getNombre() + " emplea el arma "
				+ personaje.getArma().getNombre());
		System.out.println("El Jefe Final " + pJefe.getNombre() + " emplea su arma especial "
				+ pJefe.getArma().getNombre());

		boolean terminado = false;
		do {
			int danio = personaje.atacar(pJefe);
			System.out.println("\nEl Héroe " + personaje.getNombre() + " ha hecho " + danio
					+ " puntos de daño al Jefe " + pJefe.getNombre());
			if (pJefe.muerto()) {
				ganadorP = personaje;
				terminado = true;
			} else {
				danio = pJefe.atacar(personaje);
				System.out.println("El Jefe " + pJefe.getNombre() + " ha hecho " + danio + " de daño al Héroe "
						+ personaje.getNombre());
				if (personaje.muerto()) {
					ganadorP = pJefe;
					terminado = true;
				}
			}
			System.out.println();
			System.out.println(personaje.toString());
			System.out.println(pJefe.toString());
		} while (!terminado);

		return ganadorP;
	}

}
