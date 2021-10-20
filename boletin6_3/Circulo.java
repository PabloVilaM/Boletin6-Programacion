package boletin6_3;

public class Circulo {
    private double radio;
    private final double PI = 3.14;
    
    public Circulo(){
        
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public void setRadio(double rad){
        radio = rad;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
       double area = Math.pow(radio, 2);
       return area;
    }
    
    public double calcularLongitud(){
        double longitud = radio*PI*2;
        return longitud;
    }
}
