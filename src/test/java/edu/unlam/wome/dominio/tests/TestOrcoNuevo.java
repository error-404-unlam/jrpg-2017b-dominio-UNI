package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Orco;
import edu.unlam.wome.dominio.main.Personaje;

public class TestOrcoNuevo {

	/**
	 * Verifica que un Orco sin Energia
	 * no pueda utilizar la habilidadRaza1
	 */
	@Test
	public void testHabilidadRaza1() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Verifica que un Orco, sin defensa, no pueda
	 * utilizar la habilidadRaza1
	 */
	@Test
	public void testHabilidadRaza1S() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.reducirDefensa(p1.getDefensa());
		Assert.assertFalse(p1.habilidadRaza1(p2));
	}

	/**
	 * Verifica que un Orco sin energia, no pueda
	 * utilizar la habilidadRaza2
	 */
	@Test
	public void testHabilidadRaza2() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

	/**
	 * Verifica que un Orco sin fuerza, no pueda
	 * utilizar la habilidadRaza2
	 */
	@Test
	public void testHabilidadRaza2S() {
		Personaje p1 = new Orco("Ben Affleck", new Asesino(), 2);
		Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarFuerza(-10);
		Assert.assertFalse(p1.habilidadRaza2(p2));
	}

}
