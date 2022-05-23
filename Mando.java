/**
 * Clase Mando que hereda de Implementos, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class Mando extends Implementos{
	
	private boolean flecha;//Atributo particular de la clase Mando
	
	/**
	 * Constructor vacío de Mando
	 */

	public Mando() {
		super();
	}
	/*
	 *Constructor que contiene el atributo flecha de la clase Mando
	 */

	public Mando(boolean flecha) {
		super();
		this.flecha = flecha;
	}
	/*
	 * Constructor que contiene velocidad de la clase Mando
	 */

	public Mando(int velocidad) {
		super(velocidad);
	}
	/*
	 * Constructor que contiene velocidad y color de la clase Mando
	 */

	public Mando(int velocidad, String color) {
		super(velocidad, color);
	}
	/*
	 * Constructor de la clase Mando que contiene velocidad, color y forma
	 */

	public Mando(int velocidad, String color, String forma) {
		super(velocidad, color, forma);
	}

	/*
	 * Constructor de la clase Mando que contiene los atributos posX y posY
	 */
	public Mando(int posX, int posY) {
		super(posX, posY);
	}
	/*
	 * Constructor de la clase Mando que contiene todos los atributos, heredados de Implementos
	 */

	public Mando(int velocidad, String color, String forma, int posX, int posY) {
		super(velocidad, color, forma, posX, posY);
	}
	/*
	 * Constructor que contiene todos los atributos, heredados de Implementos, más el atributo particular de Mando
	 */

	public Mando(int velocidad, String color, String forma, int posX, int posY, boolean flecha) {
		super(velocidad, color, forma, posX, posY);
		this.flecha = flecha;
	}

	/*
	 * Getters y Setter de la clase Mando
	 */
	public boolean isFlecha() {
		return flecha;
	}

	public void setFlecha(boolean flecha) {
		this.flecha = flecha;
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
	
	/*
	 * Método que se para perder  
	 */
	public void perder() {
		System.out.println("Ha perdido el juego");
	}
	/*
	 * Método para comenzar el juego
	 */
	public void comenzar() {
		System.out.println("Haz comenzado a jugar");
	}
	/*
	 * Método para volver a jugar luego de perder la pelota
	 */
	public void recomenzar() {
		System.out.println("Jugarás nuevamente");
	}
	
	
	
	

}
