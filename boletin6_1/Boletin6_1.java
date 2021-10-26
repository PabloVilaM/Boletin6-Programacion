package boletin6_1;

import java.util.Scanner;


public class Boletin6_1 {

    public static void main(String[] args) {
        int velocidadeMomento;
        Coche velocidades = new Coche();
        
        //Velocidad dada por nosotros
        
        velocidadeMomento = velocidades.getVelocidade(); //Hacer esto parece el equivalente a un log.info en verdad
        System.out.println(velocidadeMomento);
        velocidades.acelerar(73);
        velocidadeMomento = velocidades.getVelocidade();
        System.out.println(velocidadeMomento);
        velocidades.frenar(30);
        velocidadeMomento = velocidades.getVelocidade();
        System.out.println(velocidadeMomento);
        
        //Velocidad dada por el usuario
        
        Coche velocidades2 = new Coche();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuanto aceleras");
       int acel = sc.nextInt();
        velocidades2.acelerar(acel); //Acelera
        velocidadeMomento = velocidades2.getVelocidade();
        System.out.println(velocidadeMomento);
        
        System.out.println("Dime cuanto frenas");
        velocidades2.frenar(sc.nextInt()); //Simplificacion de lo de arriba 
        velocidadeMomento = velocidades2.getVelocidade();
        System.out.println(velocidadeMomento);
        
    }
    
}
