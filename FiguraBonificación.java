/**
 * Clase FiguraBonificación que hereda de Implementos, contiene un atributo adicional
 * @author lilianacisternasjara
 */
public class FiguraBonificación extends Implementos{
	
	private String figura;//Atributo particular de la clase Mando
	
	/**
	 * Constructor vacío de FiguraBonificación
	 */

	public FiguraBonificación() {
		super();
	}
	/*
	 *Constructor que contiene el atributo figura de la clase
	 */

	public FiguraBonificación(String figura) {
		super();
		this.figura = figura;
	}
	/*
	 * Constructor que contiene velocidad de la clase 
	 */

	public FiguraBonificación(int velocidad) {
		super(velocidad);
	}

	/*
	 * Constructor que contiene velocidad y color de la clase
	 */
	public FiguraBonificación(int velocidad, String color) {
		super(velocidad, color);
	}
	/*
	 * Constructor de la clase que contiene velocidad, color y forma
	 */

	public FiguraBonificación(int velocidad, String color, String forma) {
		super(velocidad, color, forma);
	}
	/*
	 * Constructor de la clase que contiene los atributos posX y posY
	 */

	public FiguraBonificación(int posX, int posY) {
		super(posX, posY);
	}
	/*
	 * Constructor de la clase que contiene todos los atributos, heredados de Implementos
	 */


	public FiguraBonificación(int velocidad, String color, String forma, int posX, int posY) {
		super(velocidad, color, forma, posX, posY);
	}
	/*
	 * Constructor que contiene todos los atributos, heredados de Implementos, más el atributo particular de FiguraBonificación
	 */

	public FiguraBonificación(int velocidad, String color, String forma, int posX, int posY, String figura) {
		super(velocidad, color, forma, posX, posY);
		this.figura = figura;
	}

	/*
	 * Getters y Setter de la clase 
	 */
	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}
	
	

	
	
	
	

}
