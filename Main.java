/**
 * Interprete
 *@author Angel HIgueros
 *@author Mynor Lima
 *@author Fredy Velasquez
 *@version 1.0
 */

public class Main { //Clase que ejecuta todo

    public static void main(String[] args) {

        // Utilidades
        Interprete interprete = new Interprete(); //Instancio Interprete
        
        //Bienvenida
        System.out.print("\n\n :: INTERPRETE LISP :: \n");
        interprete.ejecutar(); //Llamo a lo que tengo dentro de interprete con el metodo ejecutar

    }
}
