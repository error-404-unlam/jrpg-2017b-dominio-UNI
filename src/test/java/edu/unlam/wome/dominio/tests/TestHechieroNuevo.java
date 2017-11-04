package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Hechicero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.NonPlayableCharacter;
import edu.unlam.wome.dominio.main.Personaje;

public class TestHechieroNuevo {

	/**
	 * Verifica que un Hechicero sin
	 * energia no pueda usar la habilidad3
	 */
	@Test
	public void testHabilidad3() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadCasta3(p2));
	}

	/**
	 * Verifica que un Hechicero sin energia
	 * no pueda usar la habilidad 2
	 */
	@Test
	public void testHabilidad2() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadCasta2(p2));
	}

	/**
	 * Verifica que un Hechicero sin energia
	 * no pueda usar la habilidad 1
	 */
	@Test
	public void testHabilidad1() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		Personaje p2 = new Humano("Batman", new Asesino(), 2);
		p1.setRandom(new MyRandomStub(0.49, 3));
		p2.setRandom(new MyRandomStub(0.49, 3));
		p1.aumentarEnergia(-100);
		Assert.assertFalse(p1.habilidadCasta1(p2));
	}

	/**
	 * Verifica que un Hechicero sin inteligencia
	 * no puede usar la habilidad 1
	 */
	@Test
	public void testInstanceOfHorrible1() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		p1.aumentarInteligencia(-20);
		p1.setRandom(new MyRandomStub(0.49, 3));
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		npc.setRandom(new MyRandomStub(0.49, 3));

		Assert.assertFalse(p1.habilidadCasta1(npc));
	}

	/**
	 * Verifica que un Hechicero no puede
	 * curar a un NPC
	 */
	@Test
	public void testInstanceOfHorrible2() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		p1.setRandom(new MyRandomStub(0.49, 3));
		npc.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertFalse(p1.habilidadCasta2(npc));
	}

	/**
	 * Verifica que un Hechicero no puede
	 * usar la habilidad 3 en un NPC
	 */
	@Test
	public void testInstanceOfHorrible3() {
		Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		p1.setRandom(new MyRandomStub(0.49, 3));
		npc.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertFalse(p1.habilidadCasta3(npc));
	}

}
