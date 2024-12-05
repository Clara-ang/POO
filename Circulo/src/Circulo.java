
public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.setRaio(raio);
    } 
    public double getRaio(){
        return this.raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.raio,2);    
    }

    public double getCircunferencia(){
        return 2*Math.PI*this.raio;  
    }

}
