import java.util.Scanner;

/**
 * Clase AppArkanoid que contienen el main, donde se crean los objetos
 *  y se agregan al frame
 *  Además contiene el menú de usuario
 * @author lilianacisternasjara
 *
 */
public class AppArkanoid {

	public static void main(String[] args) {
		/*
		 * Se crea el frame, se setea alto, ancho, posX y posY y largo
		 */
		Frame frame = new Frame();
		frame.setAlto(70);
		frame.setAncho(200);
		frame.setPosX(0);
		frame.setPosY(400);
		frame.setLargo(500);
		
		/*
		 * Se crea el objeto Pelota p1, se setea color, forma, posX y posY y velocidad, se agrega al frame
		 */
		
		Pelota p1 = new Pelota();
		
		p1.setColor("amarilla");
		p1.setForma("cúbica");
		p1.setPosX(5);
		p1.setPosY(200);
		p1.setVelocidad(60);
		frame.getImplementos().add(p1);
		
		/*
		 * Se crea el objeto Pelota p2, se setea color, forma, posX y posY y velocidad, se agrega al frame
		 */
		
		Pelota p2 = new Pelota();
		
		p2.setColor("amarilla");
		p2.setForma("cúbica");
		p2.setPosX(2);
		p2.setPosY(100);
		p2.setVelocidad(80);
		frame.getImplementos().add(p2);
		
		/*
		 * Se crea el objeto Pelota p3, se setea color, forma, posX y posY y velocidad, se agrega al frame
		 */
		
		Pelota p3 = new Pelota();
		
		p3.setColor("amarilla");
		p3.setForma("cúbica");
		p3.setPosX(5);
		p3.setPosY(200);
		p3.setVelocidad(60);
		frame.getImplementos().add(p3);
		
		
		/*
		 * Se crea el objeto Base, se setea color, forma, posX y posY y velocidad, se agrega al frame
		 */
		Base b1 = new Base();
		
		b1.setColor("gris con rojo");
		b1.setForma("Cilíndrica");
		b1.setPosX(5);
		b1.setPosY(0);
		b1.setVelocidad(7);
		frame.getImplementos().add(b1);
		
		/*
		 * Se crea el objeto Mando, se setea color, forma, posX y posY y velocidad, se agrega al frame
		 */
		
		Mando m1 = new Mando();
		
		m1.setColor("gris");
		m1.setForma("rectangular");
		m1.setPosX(5);
		m1.setPosY(0);
		m1.setVelocidad(7);
		frame.getImplementos().add(m1);
		
		/*
		 * Se crean los objetos Bloque bl1, bl2, bl3, bl4, bl5 y bl6 se setea color, alto, 
		 * ancho, posX y posY, se agrega al frame
		 */
		
		Bloque bl1 = new Bloque();
		
		bl1.setColor("rojo");
		bl1.setAlto(2);
		bl1.setAncho(4);
		bl1.setPosX(0);
		bl1.setPosY(90);
		frame.getExtra().add(bl1);
		
		Bloque bl2 = new Bloque();
		
		bl2.setColor("amarillo");
		bl2.setAlto(2);
		bl2.setAncho(4);
		bl2.setPosX(0);
		bl2.setPosY(80);
		frame.getExtra().add(bl2);
		
		Bloque bl3 = new Bloque();
		
		bl3.setColor("azul");
		bl3.setAlto(2);
		bl3.setAncho(4);
		bl3.setPosX(5);
		bl3.setPosY(90);
		frame.getExtra().add(bl3);
		
		Bloque bl4 = new Bloque();
		
		bl4.setColor("rojo");
		bl4.setAlto(2);
		bl4.setAncho(4);
		bl4.setPosX(6);
		bl4.setPosY(70);
		frame.getExtra().add(bl4);
		
		Bloque bl5 = new Bloque();
		
		bl5.setColor("rosado");
		bl5.setAlto(2);
		bl5.setAncho(4);
		bl5.setPosX(10);
		bl5.setPosY(110);
		frame.getExtra().add(bl5);
		
		Bloque bl6 = new Bloque();
		
		bl6.setColor("negro");
		bl6.setAlto(2);
		bl6.setAncho(4);
		bl6.setPosX(35);
		bl6.setPosY(120);
		frame.getExtra().add(bl6);
		
		/*
		 * Se crea el objeto Contorno, se setea color, forma, posX y posY, se agrega al frame
		 */
		
		
		
		Contorno c1 = new Contorno();
		
		c1.setColor("gris");
		c1.setAlto(650);
		c1.setAncho(180);
		c1.setPosX(0);
		c1.setPosY(0);
		frame.getExtra().add(c1);
		
		int opc;//Se declara la variable opc de tipo int para que el usuario pueda elegir entre las diferentes opciones
		opc=0;//Se iniciliaza la variable opc en 0
		Scanner leer = new Scanner(System.in);//Se utiliza la Clase Scanner para poder leer la opción que elija el usuario
		/**
		 * Se usa ciclo while con opc diferente a 11 pues 11 es para salir del juego, de 1 a 10 son las diferentes opciones que tiene el usuario
		 * de interactuar
		 * se usan los syso para que el usuario lea las opciones que tiene
		 */
		
		while(opc != 16) {
			System.out.println("Menú de opciones");
			System.out.println("Presiona 1 para comenzar");
			System.out.println("Presiona 2 para Mover el mando y la base a la izquierda el Mando");
			System.out.println("Presiona 3 para Mover el mando y la base a la derecha el Mando");
			System.out.println("Presiona 4 para obtener poderes");
			System.out.println("Presiona 5 para obtener una bonificación");
			System.out.println("Presiona 6 para que la base sea más larga");
			System.out.println("Presiona 7 para que la pelota rebote a la izquierda");
			System.out.println("Presiona 8 para que la pelota rebote a la derecha");
			System.out.println("Presiona 9 para que la pelota rebote en el techo");
			System.out.println("Presiona 10 para que la pelota rebote en un bloque");
			System.out.println("Presiona 11 para que el bloque cambie de color");
			System.out.println("Presiona 12 para que el bloque de una bonificación");
			System.out.println("Presiona 13 para que el contorno cambie de color");
			System.out.println("Presiona 14 para perder");
			System.out.println("Presiona 15 para recomenzar");
			System.out.println("Presiona 16 para salir");
			System.out.println();//syso para saltar un espacio
			opc = leer.nextInt();//se lee la opción que escogió el usuario
			System.out.println();//syso para saltar un espacio
			
switch (opc) {
			
			case 1:
				m1.comenzar();
				break;
			case 2: 
				b1.moverseIzquierda();
				break;
			case 3:
				m1.moverseDerecha();
				break;
			case 4: 
				b1.obtenerPoderes();
				break;
			case 5:
				b1.obtenerBonificacion();;
				break;
			case 6:
				b1.crecer();
				break;
			case 7:
				p1.rebotarIzquierda();
				break;
			case 8:
				p1.rebotarDerecha();
				break;
			case 9:
				p1.rebotarTecho();
				break;
			case 10:
				p1.rebotarBloque();
				break;
			case 11:
				bl1.cambiarColor();
				break;
			case 12:
				bl2.darBonificacion();
			case 13:
				c1.cambiarColor();
			case 14:
				m1.perder();
			case 15:
				m1.recomenzar();
			case 16:
				System.out.println("El juego ha finalizado");
				break;
				default:
					System.out.println("Opción inválida");
			}
	}

	}
}
