package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;

public class TestAtaqueCritico {

	@Test
	public void testgolpeCrit() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Assert.assertEquals(h.getAtaque() * 1.5, h.golpeCritico(), 1);
	}
}
