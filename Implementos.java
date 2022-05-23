/**
 * Clase Padre de la que heredan auto jugador y auto contrincante
 * @author lilianacisternasjara
 */
public abstract class Implementos {
	/**
	 * Atributos de la Super clase Implementos
	 */
	
	private int velocidad;
	private String color;
	private String forma;
	private int posX;
	private int posY;
	
	/**
	 * Constructor vacío de Implementos
	 */
	
	public Implementos() {
	}
	
	/*
	 *Constructor que contiene la velocidad de la clase Auto
	 */

	public Implementos(int velocidad) {
		this.velocidad = velocidad;
	}

	/*
	 * Constructor que contiene velocidad y color de la clase Implementos
	 */
	
	public Implementos(int velocidad, String color) {
		this.velocidad = velocidad;
		this.color = color;
	}
	/*
	 * Constructor de la clase Implementos que contiene velocidad, color y forma
	 */

	public Implementos(int velocidad, String color, String forma) {
		this.velocidad = velocidad;
		this.color = color;
		this.forma = forma;
	}
	/*
	 * Constructor de la clase Implementos que contiene los atributos posX y posY
	 */

	public Implementos(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	/*
	 * Constructor de la clase Implementos que contiene todos los atributos
	 */
	

	public Implementos(int velocidad, String color, String forma, int posX, int posY) {
		this.velocidad = velocidad;
		this.color = color;
		this.forma = forma;
		this.posX = posX;
		this.posY = posY;
	}
	
	/*
	 * Getters y Setters de la clase Implementos
	 */

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
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
	
	public void moverseDerecha() {//Método para mover el implemento a la derecha
	}
	
	public void moverseIzquierda() {//Método para mover el implemento a la izquierda
		
	}	
}

