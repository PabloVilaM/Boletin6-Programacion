package boletin6_3;

import java.util.Scanner;

public class Boletin6_3 {

    public static void main(String[] args) {
        
        //Si no tenemos en cuenta la existencia del usuario
        
        Circulo primerCirculo = new Circulo();
        primerCirculo.setRadio(23);
       double longi= primerCirculo.calcularLongitud();
        double area = primerCirculo.calcularArea();
        System.out.println("La longitud del circulo es: " + longi + " el area del circulo es " + area);
        
        Circulo segundoCirculo = new Circulo(48);
        
        double rad = segundoCirculo.getRadio();
        System.out.println("Radio del segundo circulo:" + rad );
        
        //Si tenemos en cuenta al usuario 
        
        Circulo tercerCirculo = new Circulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el radio que quieres");
        double tercerrad = sc.nextFloat();
        tercerCirculo.setRadio(tercerrad);
        double longi2 = tercerCirculo.calcularLongitud();
        double area2 = tercerCirculo.calcularArea();
        System.out.println("La longitud del circulo es: " + longi2 + " el area del circulo es " + area2);
        
        System.out.println("Dime el radio que quieres");
        double cuartorrad = sc.nextFloat();
        
        Circulo cuartoCirculo = new Circulo(cuartorrad);
        
        double rad2 = cuartoCirculo.getRadio();
        System.out.println("Radio del segundo circulo:" + rad2 );
        
        
    }
    
}
