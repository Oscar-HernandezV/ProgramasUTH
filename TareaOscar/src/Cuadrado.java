public class Cuadrado extends Formas{
    protected double areaC=12.8;

    @Override
    public String dibujar() {
        return "Cuadrado";
    }

    public double calcularArea(){
        return areaC;
    }
}
