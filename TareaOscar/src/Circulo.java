public class Circulo extends Formas{
    protected double radio=8.2;

    @Override
    public String dibujar() {
        return "Circulo";
    }

    public double calcularRadio(){
        return radio;
    }

}
