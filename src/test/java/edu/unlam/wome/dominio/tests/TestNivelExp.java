package edu.unlam.wome.dominio.tests;

import org.junit.Assert;
import org.junit.Test;

import edu.unlam.wome.dominio.main.Asesino;
import edu.unlam.wome.dominio.main.Humano;
import edu.unlam.wome.dominio.main.Personaje;

public class TestNivelExp {

	/**
	 * Se verifica que se asigne correctamente
	 * la experiencia
	 */
	@Test
	public void testGanarExp() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 1, 1);
		h.ganarExperiencia(45);
		Assert.assertTrue(h.getExperiencia() == 45);
	}

	/**
	 * Se verifica que al subir de level,
	 * se resten los puntos de experiencia
	 * sobrantes.
	 */
	@Test
	public void testSubirNivel() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 1, 1);
		h.ganarExperiencia(300);
		Assert.assertTrue(h.getNivel() == 4);
		Assert.assertTrue(h.getExperiencia() == 0);
	}

	/**
	 * Se verifica que el level maximo
	 * sea el 100.
	 */
	@Test
	public void testLevel100() {
		Personaje.cargarTablaNivel();
		Humano h = new Humano("Nico", 100, 100, 25, 20, 30, new Asesino(0.2, 0.3, 1.5), 0, 99, 1);
		h.ganarExperiencia(10000);
		Assert.assertTrue(h.getNivel() == 100);
	}
}
