package boletin6_1;

public class Coche {
    
    private int velocidade;
    
    public Coche(){
        velocidade = 0;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void acelerar(int ace){
        velocidade = velocidade + ace;
    }
    
    public void frenar(int menos){
        velocidade = velocidade - menos;
    }
}
