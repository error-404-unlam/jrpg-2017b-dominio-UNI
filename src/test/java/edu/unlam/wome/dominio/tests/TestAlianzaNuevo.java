package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Alianza;

public class TestAlianzaNuevo {
	/**
	 * 
	 */
	@Test
	public void testGetNombre() {
		Alianza ali = new Alianza("Los Isotopos");
		Assert.assertEquals("Los Isotopos", ali.obtenerNombre());
	}

}
