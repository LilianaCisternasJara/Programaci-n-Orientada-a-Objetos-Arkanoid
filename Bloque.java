/**
 * Clase Bloque que hereda de Extra, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class Bloque extends Extra{
	private String posicion;//Atributo particular de la clase Bloque
	
	/**
	 * Constructor vacío de Bloque
	 */

	public Bloque() {
		super();
	}
	/*
	 *Constructor que contiene el atributo posicion de la clase Bloque
	 */

	public Bloque(String posicion) {
		super();
		this.posicion = posicion;
	}

	/*
	 * Constructor de la clase Bloque que contiene los atributos ancho y alto
	 */
	public Bloque(int ancho, int alto) {
		super(ancho, alto);
	}
	/*
	 * Constructor de la clase Bloque que contiene los atributos ancho, alto, posX y posY
	 */

	public Bloque(int ancho, int alto, int posX, int posY) {
		super(ancho, alto, posX, posY);
	}

	/*
	 * Constructor de la clase Bloque que contiene todos los atributos, heredados de Extra
	 */
	public Bloque(String color, int ancho, int alto, int posX, int posY) {
		super(color, ancho, alto, posX, posY);
	}
	/*
	 * Constructor que contiene todos los atributos, heredados de Extra, más el atributo particular de Bloque
	 */

	public Bloque(String color, int ancho, int alto, int posX, int posY, String posicion) {
		super(color, ancho, alto, posX, posY);
		this.posicion = posicion;
	}
	/*
	 * Getters y Setter de la clase Bloque
	 */

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	/**
	 * Override del método de la Super Class Extra
	 */

	@Override
	public void cambiarColor() {
		System.out.println("El bloque ha cambiado de color");
	}
	/*
	 * método para dar bonificación cuando la pelota rebota en un bloque
	 */
	public void darBonificacion() {
		System.out.println("Ha obtenido bonificación");
	}
}
