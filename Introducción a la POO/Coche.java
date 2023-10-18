/*
 * Creación de la clase Coche
 * 
 * @author Adrián Jim�nez Santiago
 */

public class Coche {

    //Atributos
    String marca, modelo, color, matricula;
    int numeroPuertas;

    //Métodos
    public void arrancar(){
        System.out.println("Vroom~~ Vroom~~ ");
    }

    public void velocidadMaxima(){
        System.out.println("Mi velocidad máxima es de 130 km/h");
    }

    public void sonarClaxon(){
        System.out.println("Piiii~~ Piiiiii~~");
    }

    public static void main(String[] args){
        //Creamos dos objetos de la clase Coche
        Coche audi = new Coche();
        Coche seat = new Coche();

        audi.arrancar();
        seat.velocidadMaxima();
    }

}