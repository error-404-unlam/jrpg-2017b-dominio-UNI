package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Elfo;
import edu.unlam.wome.dominio.main.Hechicero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;

public class TestHumano {

	/**
	 * Verifica que el poder 
	 * "Incentivar" del personaje aumente
	 * el ataque
	 */
	@Test
	public void testIncentivar() {
		Humano h = new Humano("Nico", 100, 100, 55, 20, 30, new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(e.getAtaque() == 37);
		h.habilidadRaza1(e);
		Assert.assertTrue(e.getAtaque() > 37);
	}

	/**
	 * Verifica que al usar la habilidad
	 * Golpe Fatal, si se realiza, haga el
	 * daño correspondiente y disminuya la energia
	 * pero si no se realiza, que no haga daño,
	 * y penalice con una disminucion en la energia.
	 */
	@Test
	public void testGolpeFatal() {
		Humano h = new Humano("Nico", 100, 100, 55, 20, 30, new Hechicero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		e.setRandom(new MyRandomStub(0.49, 3));
		h.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(h.getEnergia() == 100);
		Assert.assertTrue(e.getSalud() == 100);
		if (h.habilidadRaza2(e)) {
			Assert.assertTrue(e.getSalud() == 70);
			Assert.assertTrue(h.getEnergia() == 50);
		} else {
			Assert.assertTrue(h.getEnergia() == 90);
			Assert.assertTrue(e.getSalud() == 100);
		}
	}
}
