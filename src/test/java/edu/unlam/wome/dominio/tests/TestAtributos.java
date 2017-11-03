package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;

public class TestAtributos {

	/**
	 * Verifica que al incrementar la
	 * fuerza, incremente el ataque
	 */
	@Test
	public void testIncrementarFuerza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);

		Assert.assertTrue(h.getAtaque() == 22);
		h.asignarPuntosSkills(10, 0, 0);
		Assert.assertTrue(h.getAtaque() > 22);
	}

	/**
	 * Verifica que al incrementar la
	 * destreza, incremente la defensa
	 */
	@Test
	public void testIncrementarDestreza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);

		Assert.assertTrue(h.getDefensa() == 10);
		h.asignarPuntosSkills(0, 10, 0);
		Assert.assertTrue(h.getDefensa() > 10);
	}

	/**
	 * Verifica que al incrementar la
	 * inteligencia, incremente la magia
	 */
	@Test
	public void testIncrementarInteligencia() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertTrue(h.getMagia() == 15);
		h.asignarPuntosSkills(0, 0, 10);
		Assert.assertTrue(h.getMagia() > 15);
	}
}
