package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Personaje;

public class TestAsesinoNuevo {

	/**
	 * Verifica que no pueda atacar
	 * con la habilidad 1 sin energia
	 */
	@Test
	public void testHabilidad1() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.reducirEnergia(105);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Verifica que no pueda atacar
	 * con la habilidad 1 si no tiene
	 * ataque
	 */
	@Test
	public void testHabilidad1S() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.setAtaque(0);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Verifica que no pueda atacar
	 * con la habilidad 2 sin energia
	 */
	@Test
	public void testHabilidad2() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.reducirEnergia(105);
		Assert.assertFalse(p1.habilidadCasta2(p2));
	}

	/**
	 * Verifica que no puede atacar
	 * con la habilidad casta 3, ya que
	 * la misma no esta implementada,
	 * puesto que es sobreescrita por Asesino.
	 */
	@Test
	public void testHabilidad3() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));

		Assert.assertFalse(p1.habilidadCasta3(null));
	}

}
