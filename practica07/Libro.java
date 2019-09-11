import java.util.Scanner; 
/**
 * Clase libro que tiene titulo, autor y un año de publicacion 
 * @author Blancas Ochoa Alan 
 * @version 1.0
 */
public class Libro{
	public String titulo;
	public String autor;
	public int año;


/**
 * Se crea un objeto con valores default
 * A titulo se le asigno que "No se encontro el titulo del libro
 * A autor se le asigno "Desconocido"
 * A año se le asigno "0"
 */

    public Libro() {
    	titulo = "";
    	autor = "Desconocido";
        int año = 0; 
    }
    /**
     * @param titulo  especificado
     * @param autor especificado
     * @param año especificado
     */

    public Libro(String titulo, String autor, int año) {
	this.titulo = titulo;
	this.autor = autor;
	this.año = año;
    }
    //Metodo que regresa un titulo, autor y año asignados 
    /**
	 * Regresa el titulo  
	 * @return titulo, regresa el titulo
	 */

	public String getTitulo() {
		return titulo;
	}
    /**
	 * Regresa el autor
	 * @return autor, regresa el autor
	 */
	public String getAutor() {
		return titulo;
	}
	
	/**
	 * Regresa el año de publicacion 
	 * @return año, regresa el año de publicacion 
	 */
	

	public int getAño() {
		return año;
	}
	/**
	 * Regresa el año de publicacion 
	 * @return año, regresa el año de publicacion 
	 */
	/**
	 * Asignar el titulo del libro 
	 * @param titulo , el titulo del libro
	 */
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	/**
	 * Asignar el autor del libro  
	 * @param autor , el nombre del autor 
	 */
	public void setAutor(String autor){
		this.autor = autor;
	}

	/**
	 * Asignar un año de publicacion de algun libro 
	 * @param año , el año en que se publico el libro 
	 */
	public void setAño(int año) {
		this.año = año;
	}
}

 