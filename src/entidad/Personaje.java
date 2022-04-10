package entidad;

public abstract class Personaje extends Thread {

	protected int idPersonaje;
	protected Personaje p;
	protected String nombre;
	protected Arma arma;
	protected int puntosVida;
	protected Fortaleza fortaleza;
	protected Jefe jefe;
	protected boolean entra;
	protected ControlPersonajes cp;

	public Personaje() {
	}

	public Personaje(int id, String nombre, Arma arma, int puntosVida, Fortaleza fortaleza, Jefe jefe, boolean entra,
			ControlPersonajes cp) {
		this.idPersonaje = id;
		this.nombre = nombre;
		this.arma = arma;
		this.puntosVida = puntosVida;
		this.fortaleza = fortaleza;
		this.jefe = jefe;
		this.entra = entra;
		this.cp = cp;
	}

	public int getIdPersonaje() {
		return idPersonaje;
	}

	public void setIdPersonaje(int idPersonaje) {
		this.idPersonaje = idPersonaje;
	}

	public boolean isEntra() {
		return entra;
	}

	public void setEntra(boolean entra) {
		this.entra = entra;
	}

	public ControlPersonajes getCp() {
		return cp;
	}

	public void setCp(ControlPersonajes cp) {
		this.cp = cp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public Fortaleza getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Personaje [idPersonaje=" + idPersonaje + ", p=" + p + ", nombre=" + nombre + ", arma=" + arma
				+ ", puntosVida=" + puntosVida + ", fortaleza=" + fortaleza + "]";
	}

	public int atacar(Personaje p) {
		int danio = getArma().usar();
		int vida = getPuntosVida() - danio;
		setPuntosVida(vida);
		return danio;
	}

	public boolean muerto() {
		boolean estaMuerto = false;
		if (getPuntosVida() <= 0) {
			System.out.println("El Heroe " + this.nombre + " ha muerto en combate :(");
			estaMuerto = true;
		}
		return estaMuerto;
	}

	public Personaje combate() {

		Personaje ganadorP = null;

		System.out.println("Empieza atacando el héroe debido a su rapidez...");
		System.out.println("El Héroe " + getId() + " emplea el arma " + getArma().getNombre());
		System.out.println("El Jefe Final " + jefe.getNombre() + " emplea su arma especial " + getArma().getNombre());

		boolean terminado = false;
		do {
			int danio = atacar(jefe);
			System.out.println(
					"\nEl Héroe " + getNombre() + " ha hecho " + danio + " puntos de daño al Jefe " + jefe.getNombre());
			if (jefe.muertoJefe()) {
				ganadorP = p;
				terminado = true;
			} else {
				danio = atacar(p);
				System.out.println("El Jefe " + jefe.getNombre() + " ha hecho " + danio + " de daño al Héroe " + getNombre());
				if (muerto()) {
					ganadorP = jefe;
					terminado = true;
				}
			}
			System.out.println();
			System.out.println(toString());
			System.out.println(jefe.toString());
		} while (!terminado);

		return ganadorP;
	}

	@Override
	public void run() {
		if (entra == true) {
			cp.permisoEntrada(this);
			fortaleza.entrar(nombre);
			combate();
			System.out.println("Los dos Personajes ya han batallado.\n");
			cp.finEntrada(this);
		} else {
			cp.permisoSalida(this);
			fortaleza.salir(nombre);
			cp.finSalida(this);
		}
	}

}
