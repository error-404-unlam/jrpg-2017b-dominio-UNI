package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.Personaje;

public class TestMadreDeTodo {

	@Test
	public void testSetNombre() {
		Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
		p1.setNombre("I'm Batman");
		Assert.assertEquals("I'm Batman", p1.getNombre());
	}

}
