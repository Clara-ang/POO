public class Circulo {
    private double raio;
    public Circulo (double raio){
        this.raio = raio;

    }
    public double get_area(){
        return raio * 3.14 * raio;
        
    }
    public double get_circunferencia(){
        return 2 * 3.14 * raio;
        
    }

}
