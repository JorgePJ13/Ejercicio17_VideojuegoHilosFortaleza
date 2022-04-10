package Principal;

import entidad.Arco;
import entidad.Arma;
import entidad.Batalla;
import entidad.ControlPersonajes;
import entidad.Curandero;
import entidad.Espada;
import entidad.Fortaleza;
import entidad.Guerrero;
import entidad.Hacha;
import entidad.Hechizo;
import entidad.Jefe;
import entidad.Mago;
import entidad.Maza;
import entidad.Personaje;
import entidad.Rezo;

public class MainBatalla {

	public static void main(String[] args) throws InterruptedException {
		
		Fortaleza fortaleza = new Fortaleza("Barad-Dùr");
		ControlPersonajes cp = new ControlPersonajes();

		Espada espada = new Espada();
		espada.setNombre("Andúril");
		espada.setDanioMax(15);
		espada.setDanioMin(5);
		espada.setPlusEspada(15);

		Maza maza = new Maza();
		maza.setNombre("Maza Uruk-Hai");
		maza.setDanioMax(30);
		maza.setDanioMin(15);
		maza.setPlusMaza(10);

		Arco arco = new Arco();
		arco.setNombre("Belthronding");
		arco.setDanioMax(20);
		arco.setDanioMin(10);
		arco.setPlusArco(15);

		Hechizo bolaDeFuego = new Hechizo();
		bolaDeFuego.setNombre("Bola de Fuego");
		bolaDeFuego.setDanioMax(30);
		bolaDeFuego.setDanioMin(25);
		bolaDeFuego.setPlusHechizo(10);

		Hechizo ventisca = new Hechizo();
		ventisca.setNombre("Tornado");
		ventisca.setDanioMax(25);
		ventisca.setDanioMin(20);
		ventisca.setPlusHechizo(15);

		Hacha hacha = new Hacha();
		hacha.setNombre("Dardo");
		hacha.setDanioMax(20);
		hacha.setDanioMin(15);
		hacha.setPlusHacha(10);

		Rezo rezo = new Rezo();
		rezo.setNombre("Rezo");
		rezo.setDanioMax(20);
		rezo.setDanioMin(10);
		rezo.setPlusRezo(10);

		Jefe jefe = new Jefe("Sauron", maza, 1500, fortaleza, true, cp, 40);

		Personaje guerrero1 = new Guerrero(0, "Aragorn", espada, 200, fortaleza, jefe, true, cp, 20);

		Personaje guerrero2 = new Guerrero(4, "Legolas", arco, 150, fortaleza, jefe, true, cp, 15);

		Personaje guerrero3 = new Guerrero(2, "Gimli", hacha, 175, fortaleza, jefe, true, cp, 25);

		Personaje mago1 = new Mago(1, "Gandalf el Gris", bolaDeFuego, 300, fortaleza, jefe, true, cp, 20);

		Personaje mago2 = new Mago(6, "Radagast", ventisca, 250, fortaleza, jefe, true, cp, 15);

		Curandero curandero = new Curandero(5, "ElRond", rezo, 220, fortaleza, jefe, true, cp, 15);
		
		System.out.println("----------------COMIENZO DE LA SIMULACION----------------\n");
		System.out.println("Numero inicial de Personajes: 7\n"); // Por defecto hay 7
		System.out.println("Da por comenzada la batalla por la Tierra Media en la Fortaleza de Barad-Dûr en Mordor\n");
		System.out.println(
				"Los heroes (Guerreros, Magos y Curanderos), unidos todos a una para luchar contra el Jefe Final "
						+ jefe.getNombre());

		

//		guerrero1.setArma(espada);
		espada.setP(guerrero1);
//
//		guerrero2.setArma(arco);
		arco.setP(guerrero2);
//
//		guerrero3.setArma(hacha);
		hacha.setP(guerrero3);
//
//		mago1.setArma(bolaDeFuego);
		bolaDeFuego.setP(mago1);
//
//		mago2.setArma(ventisca);
		ventisca.setP(mago2);
//
//		jefe.setArma(maza);
		maza.setP(jefe);
//
//		curandero.setArma(rezo);
		rezo.setP(curandero);

		guerrero1.start();
		guerrero2.start();
		guerrero3.start();
		mago1.start();
		mago2.start();
		curandero.start();
		jefe.start();

	}
}
