/**
 * Clase Base que hereda de Implementos, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class Base extends Implementos{
	
	private String disenio;//Atributo particular de la clase Base
	
	/**
	 * Constructor vacío de Base
	 */

	public Base() {
		super();
	}
	/*
	 *Constructor que contiene el atributo disenio de la clase Base
	 */

	public Base(String disenio) {
		super();
		this.disenio = disenio;
	}
	/*
	 * Constructor que contiene velocidad de la clase Base
	 */

	public Base(int velocidad) {
		super(velocidad);
	}
	/*
	 * Constructor que contiene velocidad y color de la clase Base
	 */

	public Base(int velocidad, String color) {
		super(velocidad, color);
	}
	/*
	 * Constructor de la clase Base que contiene velocidad, color y forma
	 */

	public Base(int velocidad, String color, String forma) {
		super(velocidad, color, forma);
	}
	/*
	 * Constructor de la clase Base que contiene los atributos posX y posY
	 */

	public Base(int posX, int posY) {
		super(posX, posY);
	}
	/*
	 * Constructor de la clase Base que contiene todos los atributos, heredados de Implementos
	 */

	public Base(int velocidad, String color, String forma, int posX, int posY) {
		super(velocidad, color, forma, posX, posY);
	}

	/*
	 * Constructor que contiene todos los atributos, heredados de Implementos, más el atributo particular de Base
	 */
	public Base(int velocidad, String color, String forma, int posX, int posY, String disenio) {
		super(velocidad, color, forma, posX, posY);
		this.disenio = disenio;
	}
	/*
	 * Getters y Setter de la clase Base
	 */

	public String getDisenio() {
		return disenio;
	}

	public void setDisenio(String disenio) {
		this.disenio = disenio;
	}
	
	/*
	 * Método particular para obtener un poder
	 */
	
	public void obtenerPoderes() {
		System.out.println("Ha obtenido un poder");
	}
	/*
	 * Método particular para lanzar un poder
	 */
	public void lanzarPoderes() {
		System.out.println("Ha lanzado un poder");
	}
	/*
	 * Método particular para obtener una bonificación
	 */
	public void obtenerBonificacion() {
		System.out.println("Ha obtenido bonificación");
	}
	/*
	 * Método particular para que el mando sea más largo
	 */
	
	public void crecer() {
		System.out.println("La base se ha alargado");
	}
	/**
	 * Override de los métodos de la Super Class Implementos
	 */

	@Override
	public void moverseDerecha() {
		System.out.println("Se ha movido a la derecha");
	}

	@Override
	public void moverseIzquierda() {
		System.out.println("Se ha movido a la izquierda");
	}
	
}
