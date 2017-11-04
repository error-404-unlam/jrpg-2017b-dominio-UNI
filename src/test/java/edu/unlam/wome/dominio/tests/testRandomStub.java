package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.MyRandomStub;
import edu.unlam.wome.dominio.main.RandomGenerator;

public class testRandomStub {

	/**
	 * Se verifica que MyRandomStub, funciona correctamente
	 */
	@Test
	public void test() {
		RandomGenerator ran = new MyRandomStub(3, 2);
		Assert.assertEquals(2, ran.nextInt(3));
		Assert.assertEquals(3, ran.nextDouble(), 0);
	}

}
