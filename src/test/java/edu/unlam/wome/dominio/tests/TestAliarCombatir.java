package edu.unlam.wome.dominio.tests;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Alianza;
import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Personaje;

public class TestAliarCombatir {

	@Test
	public void testCrearAlianza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);

		Assert.assertNull(h.getClan());
		Assert.assertNull(h2.getClan());
		h.aliar(h2);
		Assert.assertNotNull(h.getClan());
		Assert.assertNotNull(h2.getClan());
	}

	@Test
	public void testDaniar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Asesino(), 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		h2.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(h2.getSalud() == 105);
		if (h.atacar(h2) != 0)
			Assert.assertTrue(h2.getSalud() < 105);
		else
			Assert.assertTrue(h2.getSalud() == 105);
	}

	@Test
	public void testAliar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);
		Alianza a1 = new Alianza("Los CacheFC");

		h.setRandom(new MyRandomStub(0.49, 3));
		h2.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertNull(h2.getClan());
		Assert.assertNull(h.getClan());
		h.setClan(a1);
		Assert.assertNotNull(h.getClan());
		h.aliar(h2);
		Assert.assertTrue(h.getClan() == h2.getClan());

		LinkedList <Personaje> listaAliadosRespuesta = new LinkedList<Personaje>();
		listaAliadosRespuesta.add(h);
		listaAliadosRespuesta.add(h2);
		
		Assert.assertEquals(listaAliadosRespuesta, a1.getAliados());
	}

}
