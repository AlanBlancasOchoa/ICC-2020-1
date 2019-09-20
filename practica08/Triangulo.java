package geometria; 
import java.util.Scanner;
/**
 * Representa un polígono de tres lados.  Está definido por tres puntos en el plano cartesiano.
 *@author Blancas Ochoa Alan 
 *@version 1.0
 */
public class Triangulo {

	private Punto a;
	private Punto b;
	private Punto c;
//Triángulo equilatero: Todos sus lados miden lo mismo.
	public static final int EQUILATERO = 0;
//Triángulo isosceles: Dos de sus lados miden lo mismo.
	public static final int ISOSCELES = 1;
//Triangulo Escaleno: Todos sus lados son distintos 
	public static final int ESCALENO = 2;

/**
 * @param Punto a de su vertice 
 * @param Punto b de su vertice 
 * @param Punto c de su vertice 
 * Crea un triángulo con los tres puntos dados.
 */

    
	public Triangulo(Punto a, Punto b, Punto c) {

    this.a = new Punto (a.getX(), a.getY());
	this.b = new Punto (b.getX(), b.getY());
	this.c = new Punto (c.getX(), c.getY());


	}
/**
 * Crear un triangulo con tres puntos dados
 * @param a un punto con coordenadas (0,0)
 * @param b un punto con coordenadas (1,0)
 * @param c un punto con coordenadas (0.5, sin(3.1416/3))
 */

    public Triangulo(){
	this.a = new Punto(0,0);
	this.b = new Punto(1,0);
	this.c = new Punto(0.5, Math.sin(Math.PI/3));
    }

/**
 * Se crea un triangulo con los puntos declarados
 * @param a Es el primer punto 
 * @param b Es el segundo punto 
 * @param c Es el tercer punto 
 */

public Triangulo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
/**
 * Determina si los vértices de este triángulo están alineados.
 * @return true si todos lops vertices entan alineados  
 */
public boolean tieneVerticesAlineados() {
	   return a.estanAlineados(b , c);
}
/**
 * Devuelve el tipo de triangulo que es basado en las medidas de sus lados.
 * @return el tipo de triangulo que es, ya sea equilatero, isosceles o escaleno.
 */

    public int tipo() {
        if (a.distancia(b) == b.distancia(c) && a.distancia(b) == c.distancia(a) && b.distancia(c) == a.distancia(c)){
            return EQUILATERO;
        }else{

        if (a.distancia(b) != b.distancia(c) && a.distancia(b) != c.distancia(a) && b.distancia(c) != a.distancia(c)){
            return ESCALENO;
        }else{
            return ISOSCELES;
    }}
/**
 * Devuelve el punto a
 * @return el punto a
 */

public Punto getA () {
	return a;
	}
/**
 * Devuelve el punto b
 * @return el punto b
 */
public Punto getB() {
	return b;
	}
/**
 * Devuelve el punto c
 * @return el punto c
 */
public Punto getC() {
    return c;
    }
}

	

