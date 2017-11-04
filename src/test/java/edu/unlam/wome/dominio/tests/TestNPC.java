package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.NonPlayableCharacter;

public class TestNPC {

	/**
	 * Se verifica que el NPC, otorga
	 * la experiencia correspondiente.
	 */
	@Test
	public void testOtorgarExp() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, -1);
		Assert.assertTrue(30 == npc.otorgarExp());
	}
}
