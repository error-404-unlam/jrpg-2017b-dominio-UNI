package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Elfo;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Personaje;

public class TestElfoNuevo {

	/**
	 * Verifica que el personaje
	 * no pueda atacar con la habilidad 1
	 *  sin energia
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-110);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * verifica que el personaje
	 * no pueda atacar con la habilidad 1
	 * si no tiene fuerza
	 */
	@Test
	public void testHabilidadRaza1S() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarFuerza(-10);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Verifica que el personaje
	 * no puede atacar con la habilidad 2
	 * sin energia
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

	/**
	 * Verifica que el personaje
	 * no puede atacar con la habilidad 2
	 * sin magia
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Elfo("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.setMagia(0);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
