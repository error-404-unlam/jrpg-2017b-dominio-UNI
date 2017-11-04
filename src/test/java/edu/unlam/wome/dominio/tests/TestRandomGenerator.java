package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.RandomGenerator;

public class TestRandomGenerator {

	/**
	 * Se verifica que el random generator
	 * funciona correctamente.
	 */
	@Test
	public void test() {
		RandomGenerator ran = new RandomGenerator();
		Assert.assertEquals(0, ran.nextInt(3));
		Assert.assertEquals(0, ran.nextDouble(), 0);
	}

}
