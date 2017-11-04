package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.Personaje;

public class TestCastaNuevo {

	/**
	 * Verifica que se setea
	 * la probabilidad de golpe critico.
	 */
	@Test
	public void testSetProbabilidadGolpeCritico() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.getCasta().setProbabilidadGolpeCritico(8);
		Assert.assertEquals(8, p1.getCasta().getProbabilidadGolpeCritico(), 0);
	}

	/**
	 * Verifica que se setea el daño critico.
	 */
	@Test
	public void testSetDanioCritico() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.getCasta().setDanioCritico(8);
		Assert.assertEquals(8, p1.getCasta().getDanioCritico(), 0);
	}

}
