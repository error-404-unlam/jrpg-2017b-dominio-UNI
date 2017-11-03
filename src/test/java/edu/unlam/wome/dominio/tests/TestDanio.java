package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Guerrero;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.Orco;

public class TestDanio {

	@Test
	public void testAtaqueComunYLaSaludNoBajeDe0() {
		Humano h = new Humano("Nico", 100, 100, 100, 20, 30, new Guerrero(0.2, 0.3, 1.5), 0, 1, 1);
		Orco o = new Orco("Nico", 100, 100, 15, 0, 30, new Guerrero(0.2, 0, 1.5), 0, 1, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		o.setRandom(new MyRandomStub(0.49, 3));
		Assert.assertTrue(o.getSalud() == 100);
		if (h.atacar(o) != 0) {
			Assert.assertTrue(o.getSalud() == 0);
			h.atacar(o);
			Assert.assertTrue(o.getSalud() == 0);
			h.atacar(o);
			Assert.assertTrue(o.getSalud() == 0);
		} else
			Assert.assertTrue(o.getSalud() == 0);
	}

	@Test
	public void testLosMuertosNoAtacan() {
		Humano h = new Humano("Nico", 100, 100, 25, 0, 30, new Guerrero(0.2, 0, 1.5), 0, 1, 1);
		Orco o = new Orco("Nico", 100, 100, 15, 0, 30, new Guerrero(0.2, 0, 1.5), 0, 1, 1);
		h.setRandom(new MyRandomStub(0.49, 3));
		o.setRandom(new MyRandomStub(0.49, 3));
		h.atacar(o);
		h.atacar(o);
		h.atacar(o);
		h.atacar(o);

		o.atacar(h);
		Assert.assertEquals(100, h.getSalud());
	}
}