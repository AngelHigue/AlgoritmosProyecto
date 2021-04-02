/*
*
*@author Fredy Velasquez
*@author Angel Higueros
*@author Mynor Lima
*@version 1.0

*/

//Tener cuidado con el package en el que metemos esta clase para la compilacion final!


import java.util.*; //Importe esto porque me va servir bastante de lo que trae dentro

public class Funciones { //Clase con la que voy a poder evaluar las funciones que me van a dar

	//Declaro las variables que utilizo aqui
    private String argus;
    private String eje;
    /**
     * 	Este constructor si lo utilizo
		@param argus - Param que recibe para que pueda operar correctamente
		@param eje - Operaciones de la funcion
     */
    public Funciones(String eje,String argus) { //Sobrecargo mi constructor 
        this.eje = eje; //Asigno 
        this.argus = argus; //Asigno
    }
	
	
	
	/**
	 * Este metodo es complementario y solo me ayuda hasta el final del resto 
     * @return regresa las instrucciones de la funcion indicada.
	 
     */
    @Override
    public String toString() { //toString ya lo hemos utilizado
        return (eje); //Me devuelve la operacion de la function
    }



 /**
     * Realiza el cambio por la funcion que debo utilizar para operar correctamente
     * @param Recibo es quien adquiere la forma del param en la func
     * @return Recibo de nuevo la funcionalidad del metodo pero con distinto params
     */
    public String funcionamiento(String recibo){

        String[] auxiliar = eje.split(" ");
        StringBuilder obj = new StringBuilder();
        for (int i = 0; i < auxiliar.length; i++){ //For que llega hasta donde se complete auxiliar
            if(auxiliar[i].equals(argus)){ //Aqui hago evaluo la condicional para saber si entro al IF
                auxiliar[i] = recibo; //Lo meto en auxiliar
            } else { //Si no pasa lo dea rriba
            obj.append(auxiliar[i]);
            obj.append(" "); 
        }

        return obj.toString();
    }



    /**
		Esta funcion me ayuda a segmentar lo que recibe (entrada) y asi determina que debe hacer y con que parametros debe funcionar (argus)
     * @param entrada para evaluar que la funcion y asi saber que hace
	 * @return Recibo de regreso el nombre de la funcion con el primer valor y luegos las operaciones que ejecuta
     */
    public Funciones Defun(String entrada) {
        String[] auxiliar = entrada.split(" "); //Aqui voy separando con los espacios en blanco
        StringBuilder obj = new StringBuilder();
        //System.out.println(Arrays.toString(auxiliar));
        for (int i = 6; i < auxiliar.length; i++) { 
            try {
                char e = entrada.charAt(i);

                if(Character.isLetterOrDigit(e)|| auxiliar[4].equals(auxiliar[i])){
					//Aqui voy evaluando cada caracter que reciba 
                    if(auxiliar[i].equals("(") || auxiliar[i].equals(")") || auxiliar[i].equals("=") || auxiliar[i].equals("-") || auxiliar[i].equals("+") || auxiliar[i].equals("*") || auxiliar[i].equals("/")|| auxiliar[i].equals("<") || auxiliar[i].equals(">") ){
                        obj.append(" "); //Utilizo el metodo append
                        obj.append(auxiliar[i]); //Uso append con Aux para ir ejecutando
                        obj.append(" "); //Aqui cierro lo que vaya haciendo antes 
                    }else{ //En caso de que AUXILIAR no reciba lo esperado

                        obj.append(" "); //Antes de ingresar lo importante
                        obj.append(auxiliar[i]); //En aux
                        obj.append(" "); //Para mantener la separacion
                    }
                }
                else{ //Verifico en orden
                    recorrer(auxiliar, obj, i);
                } 
            }catch (Exception e){ //Peor caso USAR una exception aqui!
                recorrer(auxiliar, obj, i);
            }

        }
		
		
        return new Funciones(obj.toString(),auxiliar[4]); //Retorno aqui 
    }
	
	
	
	
	

    /**
	 *  Tambien es complementario pero me ayuda a ver que todo vaya bien en esta clase
	 *  @param Obj - Me ayuda a manejar el resultado de que la expresion no contase con los espacios en blanco (" ") que necesitamos para evaluar que esta pasando
     * @param Auxiliar - Me ayuda a ver los caracteres que tengo que ANALIZAR
     * @param i - Indice que ma ayuda a recorrer para cada espacio de los caracteres
     */
    private void recorrer(String[] auxiliar, StringBuilder obj, int i) {     //Listado con los caracteres que soporta
        if(auxiliar[i].equals("(") || auxiliar[i].equals(")") || auxiliar[i].equals("=") || auxiliar[i].equals("-") || auxiliar[i].equals("+") || auxiliar[i].equals("*") || auxiliar[i].equals("/")|| auxiliar[i].equals("<") || auxiliar[i].equals(">") ){
						//Con el if voy recorriendo y evaluando que mis condicionales se vayan cumpliendo
            obj.append(" ");
            obj.append(auxiliar[i]); //En auxiliar
            obj.append(" ");
        }else{
            obj.append(auxiliar[i]); //Igual en aux pero sin los espacios de arriba
        }
    }

   

    
	
	
	/*
		Constructor vacio - No lo utilizo para nada
	*/
    public Funciones() {  //Dejarlo como est
			//Solo por convencion
    }
	
}