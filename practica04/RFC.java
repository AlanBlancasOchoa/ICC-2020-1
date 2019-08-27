import java.util.Scanner;

public class RFC {
	    public static void main(String[] args) {
 			    
 			    Scanner teclado = new Scanner(System.in);
 			    String nombreCompleto, fecha;
 			    String regresaTodo;

 	    System.out.println("Introduce tu nombre completo (empezando por el nombre): ");
 	    nombreCompleto = teclado.nextLine();
 	   
 	    int apellido_paterno = nombreCompleto.indexOf(' ');
 	    int apellido_materno = nombreCompleto.lastIndexOf(' ');
 	    char nombre = nombreCompleto.charAt(0);
 	    String ap = nombreCompleto.substring(apellido_paterno+2);
 	    char am = nombreCompleto.charAt(apellido_materno + 1);


 	    System.out.println("Introduce tu fecha de nacimientp en formato ddmmaaaa: ");
 	    fecha = teclado.nextLine();


 	    String dia = fecha.substring(0,2);
 	    String mes = fecha.substring(2,5);
 	    String año = fecha.substring(6,8);


 	    regresaTodo = ap + am + nombre + año + mes + dia;

 	    regresaTodo = regresaTodo.toUpperCase();

 	    System.out.println("Hola tu RFC " + nombreCompleto + " es: " + regresaTodo);

        
}

 	}