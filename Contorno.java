/**
 * Clase Contorno que hereda de Extra, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class Contorno extends Extra{
	private int cantLadrillos;//Atributo particular de la clase Contorno
	
	/**
	 * Constructor vacío de Contorno
	 */
	
	public Contorno() {
		super();
	}
	/*
	 *Constructor que contiene el atributo cantLadrillos de la clase Contorno
	 */

	public Contorno(int cantLadrillos) {
		super();
		this.cantLadrillos = cantLadrillos;
	}
	/*
	 *Constructor que contiene el atributo color
	 */

	public Contorno(String color) {
		super(color);
	}

	/*
	 * Constructor de la clase Contorno que contiene los atributos ancho y alto
	 */
	public Contorno(int ancho, int alto) {
		super(ancho, alto);
	}
	/*
	 * Constructor de la clase Contorno que contiene los atributos ancho, alto, posX y posY
	 */

	public Contorno(int ancho, int alto, int posX, int posY) {
		super(ancho, alto, posX, posY);
	}
	/*
	 * Constructor de la clase Contorno que contiene todos los atributos, heredados de Extra
	 */

	public Contorno(String color, int ancho, int alto, int posX, int posY) {
		super(color, ancho, alto, posX, posY);
	}
	/*
	 * Constructor que contiene todos los atributos, heredados de Extra, más el atributo particular de Contorno
	 */

	public Contorno(String color, int ancho, int alto, int posX, int posY, int cantLadrillos) {
		super(color, ancho, alto, posX, posY);
		this.cantLadrillos = cantLadrillos;
	}
	/*
	 * Getters y Setter de la clase Contorno
	 */

	public int getCantLadrillos() {
		return cantLadrillos;
	}

	public void setCantLadrillos(int cantLadrillos) {
		this.cantLadrillos = cantLadrillos;
	}
	/**
	 * Override del método de la Super Class Extra
	 */

	@Override
	public void cambiarColor() {
		System.out.println("El contorno ha cambiado de color");
	}
}
