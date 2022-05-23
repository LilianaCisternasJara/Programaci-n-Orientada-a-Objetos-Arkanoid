/**
 * Clase Padre de la que heredan Bloque y Contorno
 * @author lilianacisternasjara
 */
public abstract class Extra {
	
	/*
	 * Atributos de la super clase Extra
	 */
	private String color;
	private int ancho;
	private int alto;
	private int posX;
	private int posY;
	
	/*
	 * Constructor vacío
	 */
	
	public Extra() {
		super();
	}
	/*
	 * Constructor que contiene el atributo color de la clase Extra
	 */

	public Extra(String color) {
		super();
		this.color = color;
	}
	/*
	 * Constructor que contiene ancho y alto de la clase Extra
	 */

	public Extra(int ancho, int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	/*
	 * Constructor de la clase Extras que contiene ancho, alto, posX y posY
	 */

	public Extra(int ancho, int alto, int posX, int posY) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.posX = posX;
		this.posY = posY;
	}
	/*
	 * Constructor de la clase Extra que contiene todos los atributos
	 */

	public Extra(String color, int ancho, int alto, int posX, int posY) {
		super();
		this.color = color;
		this.ancho = ancho;
		this.alto = alto;
		this.posX = posX;
		this.posY = posY;
	}

	/*
	 * Getters y Setters de los atributos de la clase Extra
	 */
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	/*
	 * Método que se usa cuando la pelota choca con un bloque o la pared
	 * estos cambian su color
	 */
	public void cambiarColor() {
		
	}
}
