package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.NonPlayableCharacter;
import edu.unlam.wome.dominio.main.Personaje;

public class TestNPCNuevo {

	/**
	 * Se verifica que las estadisticas de un
	 * NPC, sean las correctas
	 */
	@Test
	public void testNivelNPC1() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		Assert.assertEquals(4, npc.getDefensa());
		Assert.assertEquals(20, npc.getFuerza());
		Assert.assertEquals(60, npc.getSalud());
	}

	/**
	 * Se verifica que si el daño
	 * recibido es menor que la defensa,
	 * no le haga daño al NPC
	 */
	@Test
	public void testDanioMenorADef() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		Assert.assertEquals(0, npc.serAtacado(1));
	}

	/**
	 * Se prueba que la fuerza del NPC
	 * sea la correcta
	 */
	@Test
	public void testGetFuerza() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		Assert.assertEquals(20, npc.getFuerza());
	}

	/**
	 * Se verifica que se modifica la fuerza,
	 * si es que el ataque aumenta
	 */
	@Test
	public void testSetAtaque() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		npc.setAtaque(60);
		Assert.assertEquals(80, npc.getFuerza());
	}

	/**
	 * Verifica que un NPC, no tiene Magia
	 */
	@Test
	public void testGetMagia() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		Assert.assertEquals(0, npc.getMagia());
	}

	/**
	 * Verifica que un NPC pueda atacar
	 * a otro NPC y a un Jugador.
	 */
	@Test
	public void testAtacar() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("Pepe", 1, 1);
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		npc.setRandom(new MyRandomStub(0.49, 3));
		npc2.setRandom(new MyRandomStub(0.49, 3));
		p1.setRandom(new MyRandomStub(0.49, 3));
		// Recordar que trunca porque es entero
		// NPC 20 - (5/2) = 18
		// P1 20 - 15 = 5
		Assert.assertEquals(18, npc.atacar(npc2));
		Assert.assertEquals(5, npc.atacar(p1));
	}

	/**
	 * Se verifica que la salud se asigne
	 * correctamente
	 */
	@Test
	public void testSetSalud() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		npc.setSalud(80);
		Assert.assertEquals(80, npc.getSalud());
	}

	/**
	 * Se verifica que las estadisticas del
	 * NPC sean las correctas de acuerdo a su
	 * Dificultad = 9
	 */
	@Test
	public void testNivelNPCDefault() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 9);
		Assert.assertEquals(20, npc.getDefensa());
		Assert.assertEquals(100, npc.getFuerza());
		Assert.assertEquals(300, npc.getSalud());
	}

	/**
	 * Se verifica que las estadisticas del
	 * NPC sean las correctas de acuerdo a su
	 * Dificultad = 3
	 */
	@Test
	public void testNivel3NPC() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 2);
		Assert.assertEquals(6, npc.getDefensa());
		Assert.assertEquals(90, npc.getSalud());
		Assert.assertEquals(30, npc.getFuerza());
	}

	/**
	 * Verifica que un NPC, mata a otro NPC,
	 * y ademas puede atacar a un Personaje.
	 */
	@Test
	public void testAtacar2() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Pepe", 1, 1);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("Pepe", 1, 1);
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		npc.setRandom(new MyRandomStub(0.1, 3));
		npc2.setRandom(new MyRandomStub(0.1, 3));
		p1.setRandom(new MyRandomStub(0.49, 3));
		// Recordar que trunca porque es entero
		// NPC 20 - (5/2) = 18
		// P1 20 - 15 = 5
		Assert.assertEquals(0, npc.atacar(npc2));
		Assert.assertEquals(15, npc.atacar(p1));
	}
}
