/*
*
*@author Fredy Velasquez
*@author Angel Higueros
*@author Mynor Lima
*@version 1.0

*/

public class Operaciones { //Clase que va a tratar con las operaciones que se le vayan ingexeando por medio de la consola

	/*
	* Dejo este constructor vacio porque no me va a servir para nada cuando llame a la clase
	*/
    public Operaciones() {
			//Dejarlo asi
    }

	/*
	*
	*@param Expresion que sera ingresada por el usuario y que se operara
	*
	*/ 
    public String Operar(String expresion){ //Metodo que me permite realizar operaciones arimeticas
        String[] separar = expresion.split(" "); //Aqui voy separando segun los espacios en blanco que vengan. Es la expresion que ESPERO
        int exe; //Este metodo ya lo hemos trabajado en hojas anteriores
        try { //Lo que pasa primero 
           exe = Integer.parseInt(separar[1]); 
            switch (separar[0]){ //Switch que me ayuda a evaluar cuando venga el signo de la expresion ingresada
                case  "+": //Caso en el que venga una suma (+)
                    for (int i = 2; i < separar.length; i++) { 
                        if(!separar[i].equals(" ")){
                            exe += Integer.parseInt(separar[i]); //Agrego
                        }
                    }
                    break;
                case  "-": //En caso de que venga un  resta (-)
                    for (int i = 2; i < separar.length; i++) {
                        if(!separar[i].equals(" ")){
                            exe -= Integer.parseInt(separar[i]);
                        }
                    }
                    break;
                case  "*": //En caso de que venga una multiplicacion (*)
                    for (int i = 2; i < separar.length; i++) {
                        if(!separar[i].equals(" ")){
                            exe = exe *Integer.parseInt(separar[i]);
                        }
                    }
                    break;
                case  "/": //En caso de que venga una division (/)
                    for (int i = 2; i < separar.length; i++) {
                        if(!separar[i].equals(" ")){
                            exe= exe / Integer.parseInt(separar[i]);
                        }
                    }
                    break; //Aqui paro
            }
        } catch (Exception e){ //En caso de que venga algo desconocido o que no he contemplado
            return expresion; //Regreso lo ingresado
        }

        return String.valueOf(exe);
    }


}