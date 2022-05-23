/**
 * Clase Pelota que hereda de Implementos, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class Pelota extends Implementos{
	private int radio;//Atributo particular de la clase Pelota
	
	/**
	 * Constructor vacío de Pelota
	 */

	public Pelota() {
		super();
	}
	
	/*
	 *Constructor que contiene el atributo radio de la clase Pelota
	 */

	public Pelota(int radio) {
		super();
		this.radio = radio;
	}
	
	/*
	 * Constructor que contiene velocidad y color de la clase Pelota
	 */

	public Pelota(int velocidad, String color) {
		super(velocidad, color);
	}
	
	/*
	 * Constructor de la clase Pelota que contiene velocidad, color y forma
	 */

	public Pelota(int velocidad, String color, String forma) {
		super(velocidad, color, forma);
	}
	
	/*
	 * Constructor de la clase Pelota que contiene los atributos posX y posY
	 */

	public Pelota(int posX, int posY) {
		super(posX, posY);
	}
	/*
	 * Constructor de la clase Pelota que contiene todos los atributos, heredados de Implementos
	 */

	public Pelota(int velocidad, String color, String forma, int posX, int posY) {
		super(velocidad, color, forma, posX, posY);
	}
	/*
	 * Constructor que contiene todos los atributos, heredados de Implementos, más el atributo particular de Pelota
	 */

	public Pelota(int velocidad, String color, String forma, int posX, int posY, int radio) {
		super(velocidad, color, forma, posX, posY);
		this.radio = radio;
	}
	
	/*
	 * Getters y Setter de la clase Pelota
	 */

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	/*
	 * Método rebotarIzquierda, se usa para que la pelota rebote en la pared izquierda
	 */
	
	public void rebotarIzquierda() {
		System.out.println("La pelota ha rebotado en la pared izquierda");
	}
	
	/*
	 * Método rebotarDerecha, se usa para que la pelota rebote en la pared derecha
	 */
	
	public void rebotarDerecha() {
		System.out.println("La pelota ha rebotado en la pared derecha");
	}
	/*
	 * Método rebotarTecho, se usa para que la pelota rebote en el techo
	 */
	
	public void rebotarTecho() {
		System.out.println("La pelota ha rebotado en el techo");
	}
	
	/*
	 * Método rebotarBloque, se usa para que la pelota rebote en un bloque
	 */
	
	public void rebotarBloque() {
		System.out.println("La pelota ha rebotado en un bloque, haz ganado bonificación");
	}
}
