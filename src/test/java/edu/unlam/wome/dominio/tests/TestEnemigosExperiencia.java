package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.NonPlayableCharacter;
import edu.unlam.wome.dominio.main.Personaje;

public class TestEnemigosExperiencia {

	/**
	 * Verifica que al derrotar a un
	 * NPC, el personaje reciba la experiencia.
	 */
	@Test
	public void testPjvsNPC() {

		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, 0);
		Personaje.cargarTablaNivel();
		Assert.assertTrue(h.getExperiencia() == 0);
		h.setRandom(new MyRandomStub(0.49, 3));
		npc.setRandom(new MyRandomStub(0.49, 3));
		while (npc.estaVivo())
			h.atacar(npc);
		h.ganarExperiencia(npc.otorgarExp());
		Assert.assertTrue(h.getExperiencia() == 30);
	}

	/**
	 * Verifica que el NPC, al tener mas nivel
	 * otorga mas experiencia
	 */
	@Test
	public void testMasFuerteMasExperiencia() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, 0);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("Gigante", 2, 0);

		Assert.assertTrue(npc.otorgarExp() < npc2.otorgarExp());
	}

	/**
	 * Verifica que cuando se realiza un
	 * combate PVP, y el que tiene menos nivel
	 * derrota al que tiene mas nivel, gana la
	 * experiencia correspondiente por la diferencia
	 * de levels
	 */
	@Test
	public void testPjvsPj() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 2);
		Personaje.cargarTablaNivel();
		h.setRandom(new MyRandomStub(0.49, 3));
		h2.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(h.getExperiencia() == 0);
		Assert.assertTrue(h2.getExperiencia() == 0);

		while (h2.estaVivo())
			h.atacar(h2);

		h.ganarExperiencia(h2.otorgarExp());
		Assert.assertTrue(h.getExperiencia() == 40);
		Assert.assertTrue(h2.getExperiencia() == 0);

	}
}
