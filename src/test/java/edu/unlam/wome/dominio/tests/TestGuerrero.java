package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Elfo;
import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;

public class TestGuerrero {

	/**
	 * Verifica el "golpe doble" del guerrero
	 *  realice daño sobre el oponente
	 */
	@Test
	public void testDobleGolpe() {
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Guerrero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(e.getSalud() == 100);
		if (h.habilidadCasta1(e))
			Assert.assertTrue(e.getSalud() < 100);

		else
			Assert.assertTrue(e.getSalud() == 100);
	}

	/**
	 * Verifica que la habilidad de
	 * "Aumentar defensa" aumente la defensa
	 * del guerrero
	 */
	@Test
	public void testAutoDefensa() {
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Guerrero(0.2, 0.3, 1.5), 0, 1, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(h.getDefensa() == 20);
		h.habilidadCasta2(null);
		Assert.assertTrue(h.getDefensa() == 65);
	}

	/**
	 * Verifica que la habilidad "Ignora Defensa"
	 * del guerrero funcione correctamente.
	 */
	@Test
	public void testIgnoraDefensa() {
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Guerrero(0.2, 0.3, 1.5), 0, 1, 1);
		Elfo e = new Elfo("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 3, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		e.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(e.getSalud() == 100);
		if (h.habilidadCasta3(e))
			Assert.assertTrue(e.getSalud() < 100);
		else
			Assert.assertTrue(e.getSalud() == 100);
	}

}
