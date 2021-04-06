
/*
*@author Angel Higueros
*@author Fredy Velasquez
*@author Mynor Lima
*@version 1.0
*/



public class Variable { //Clase que cuenta con las funcinoes de VARIABLE
    private String valor; //Variable valor
    private String nombre; //Variable nombre

    
    //Creo mi constructor y asigno valores a mis variables
    public Variable(String nombre, String valor) {
        this.nombre = nombre; //Asigno
        this.valor = valor; //Asigno
    } 

    //Creo los setters y getters respectivos para cada uno de las variables que defini arriba
    
    public String getNombre() { //get de Nombre
        return nombre; //Retorno
    } 
                //Paso el parametro valor
    public void setValor(String valor) { //set de Valor
        this.valor = valor; //Asigno aqui
    }

    public String getValor() { //get de Valor
        return valor; //Retorno
    }

    //Aca creo mi toString
    public String toString() {
        return (valor); //Retorno mi valor
    }
}
