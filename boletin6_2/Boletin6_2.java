package boletin6_2;

import java.util.Scanner;

public class Boletin6_2 {

    public static void main(String[] args) {
        
        //Sin usuario
        
       Satelite primerSatelite = new Satelite();
       primerSatelite.verPosicion();
       
       Satelite segundoSatelite = new Satelite(34.5,43.5,48.5);
       segundoSatelite.verPosicion();
       
       //Usuario related
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Dame el meridiano el pararelo y la distancia de la tierra");
       float mer = sc.nextFloat();
       float par = sc.nextFloat();
       float dis = sc.nextFloat();
       
       Satelite tercerSatelite = new Satelite(mer,par,dis);
       tercerSatelite.verPosicion();
    }
    
}
