package edu.unlam.wome.dominio.tests;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dominio.Casta;
import dominio.Guerrero;
import dominio.Humano;
import dominio.Item;
import dominio.Personaje;

/**
 * Se comprueba el funcionamiento correcto de los metodos de la clase Item
 * @author Marvix8
 */
public class TestItem {

	private  int idItem = 12321;
	private  int bonusSalud = 50;
	private  int bonusEnergia = 100;
	private  int bonusFuerza = 40;
	private  int bonusDestreza = 20;
	private  int bonusInteligencia = 30;


	/**
	 * Se verifica el retorno del id del item
	 */
	@Test
	public void testIdItem() {

		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, 0, 0, 0, 0, 0, null, null);

			Assert.assertEquals(12321, itemDes.getIdItem());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}

	/**
	 *	Prueba que un item con bonus de salud
	 */
	@Test
	public void testBonusSalud() {
		
		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, bonusSalud, 0, 0, 0, 0, null, null);
			
			Assert.assertEquals(50, itemDes.getBonusSalud());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 *	Prueba que un item con bonus de energia
	 */
	@Test
	public void testBonusEnergia() {
		
		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, 0,bonusEnergia, 0, 0, 0, null, null);
			
			Assert.assertEquals(100, itemDes.getBonusEnergia());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 *	Prueba que un item con bonus de fuerza
	 */
	@Test
	public void testBonusFuerza() {
		
		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, 0, 0, bonusFuerza, 0, 0, null, null);
			
			Assert.assertEquals(40, itemDes.getBonusFuerza());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 *	Prueba que un item con bonus de destreza
	 */
	@Test
	public void testBonusDestreza() {

		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, 0, 0, 0, bonusDestreza, 0, null, null);

			Assert.assertEquals(20, itemDes.getBonusDestreza());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 *	Prueba que un item con bonus de inteligencia
	 */
	@Test
	public void testBonusInteligencia() {
		
		try {
			Item itemDes = new Item(idItem, "elixir de Destreza", 0, 0, 0, 0, 0, bonusInteligencia, null, null);
			
			Assert.assertEquals(30, itemDes.getBonusInteligencia());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
