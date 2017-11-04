package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Personaje;

public class TestHumanoNuevo {

	/**
	 * Verifica que un Humano sin energia
	 * no pueda utilizar la habilidadRaza1
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Verifica que un Humano, al no
	 * realizar la habilidadRaza2, igualmente
	 * pierda energia
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p2.reducirSalud(p2.getSalud());
		Assert.assertEquals(105, p1.getEnergia());
		Assert.assertFalse(p1.habilidadRaza2(p2));
		Assert.assertEquals(95, p1.getEnergia());
	}

	/**
	 * Verifica que un humano sin energia
	 * no pueda utilizar la HabilidadRaza2
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
