package edu.unlam.wome.dominio.main;

/**
 * Clase con proposito de testing ya que se fijan sus valores.
 */
public class MyRandomStub extends RandomGenerator {
	/**
	 * Valor que devolverá nextDouble().
	 */
	private final double valDouble;
	/**
	 * Valor que devolverá nextInt();
	 */
	private final int valInt;

	/**
	 * Constructor del MyRandomStub.
	 * @param valDouble
	 *            Double que se fijará en el objeto.
	 * @param valInt
	 *            Entero que se fijará en el objeto.
	 */
	public MyRandomStub(final double valDouble, final int valInt) {
		this.valDouble = valDouble;
		this.valInt = valInt;
	}

	/**
	 * Método que retorna el valor entero que se pasa en el constructor.
	 * @param val
	 *            valor que se pasa por parametro.
	 * @return Entero que se pasa por parametro en el constructor.
	 */
	@Override
	public final int nextInt(final int val) {
		return valInt;
	}

	/**
	 * Método que retorna el valor entero que se pasa en el constructor.
	 * @return Double que se pasa por parametro en el constructor.
	 */
	@Override
	public final double nextDouble() {
		return valDouble;
	}

}
