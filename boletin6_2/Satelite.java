
package boletin6_2;


public class Satelite {
    private double meridiano;
    private double pararelo;
    private double distanciaTerra;
    
    public Satelite(){
        meridiano = pararelo = distanciaTerra = 0;
    }
    
    public Satelite(double meri, double para, double distanciaT){
        meridiano = meri;
        pararelo = para;
        distanciaTerra = distanciaT;
    }
    
    public void verPosicion(){
        System.out.println("o satelite atopase no pararelo " + pararelo + " meridiano " + meridiano + " a unha distancia da terra " + distanciaTerra);
    }
}
