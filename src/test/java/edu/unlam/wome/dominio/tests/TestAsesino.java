package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Hechicero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;

public class TestAsesino {

	/**
	 * Verifica si realiza un golpe critico
	 * el personaje
	 */
	@Test
	public void testCritico() {
		Humano h = new Humano("Nicolas", new Asesino(), 1);
		Humano h2 = new Humano("Lautaro", new Hechicero(), 2);
		h.setRandom(new MyRandomStub(0.49, 3));
		h2.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertEquals(105, h2.getSalud());
		if (h.habilidadCasta1(h2))
			Assert.assertTrue(93 == h2.getSalud());
		else
			Assert.assertEquals(105, h2.getSalud());
	}

	/**
	 * Verifica que el personaje 
	 * aumenta la probabilidad de
	 * evasion hasta el maximo
	 */
	@Test
	public void testProbEvasion() {
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 1, 1);
		h.setRandom(new MyRandomStub(0.49, 3));

		Assert.assertTrue(0.3 == h.getCasta().getProbabilidadEvitarDanio());
		h.habilidadCasta2(null);
		Assert.assertEquals(0.45, h.getCasta().getProbabilidadEvitarDanio(), 0.01);
		h.habilidadCasta2(null);
		Assert.assertTrue(0.5 == h.getCasta().getProbabilidadEvitarDanio());
	}
}
