import java.util.ArrayList;

/**
 * Clase de tipo frame, llamada Frame
 * @author lilianacisternasjara
 *
 */
public class Frame {
	/*
	 * Atributos de la clase Frame
	 */
	private String colorFondo;
	private int alto;
	private int ancho;
	private int posX;
	private int posY;
	private int largo;
	private ArrayList<Implementos> implementos;
	private ArrayList<Extra> extra;
	
	/*
	 * Constructor vacío de Frame
	 */
	
	public Frame() {
		implementos = new ArrayList<>();
		extra = new ArrayList<>();
	}
	
	/*
	 * Getters y Setters de la clase Frame
	 */

	public String getColorFondo() {
		return colorFondo;
	}

	public void setColorFondo(String colorFondo) {
		this.colorFondo = colorFondo;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
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

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public ArrayList<Implementos> getImplementos() {
		return implementos;
	}

	public void setImplementos(ArrayList<Implementos> implementos) {
		this.implementos = implementos;
	}

	public ArrayList<Extra> getExtra() {
		return extra;
	}

	public void setExtra(ArrayList<Extra> extra) {
		this.extra = extra;
	}
	
	

}
