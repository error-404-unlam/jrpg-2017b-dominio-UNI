package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.NonPlayableCharacter;
import edu.unlam.wome.dominio.main.Personaje;

public class TestGuerreroNuevo {

	/**
	 * Verifica que un guerrero sin
	 * energia no pueda atacar con la
	 * habilidad 1
	 */
	@Test
	public void testHabilidad1() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-105);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Verifica que un guerrero sin
	 * ataque no realice daño con la
	 * habilidad 1
	 */
	@Test
	public void testHabilidad1S() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.setAtaque(0);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Verifica que un guerrero sin
	 * energia no pueda atacar con la
	 * habilidad 2
	 */
	@Test
	public void testHabilidad2() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-105);
		Assert.assertFalse(p1.habilidadCasta2(p2));
	}

	/**
	 * Verifica que un guerrero sin
	 * energia no pueda atacar con la
	 * habilidad 3
	 */
	@Test
	public void testHabilidad3() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-105);
		Assert.assertFalse(p1.habilidadCasta3(p2));
	}

	/**
	 * Verifica que un guerrero sin
	 * ataque no pueda atacar con la
	 * habilidad 3
	 */
	@Test
	public void testHabilidad3T() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.setAtaque(0);
		Assert.assertFalse(p1.habilidadCasta3(p2));
	}

	/**
	 * Verifica que el guerrero no pueda
	 * utilizar la habilidad 3
	 */
	@Test
	public void testInstanceOfHorrible3() {
		Personaje p1 = new Humano("Ben Affleck", new Guerrero(), 2);
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		p1.setRandom(new MyRandomStub(0.49, 3));
		npc.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertFalse(p1.habilidadCasta3(npc));
	}
}
