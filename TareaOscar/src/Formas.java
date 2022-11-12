public class Formas{
    protected String color="Rojo";

    public String dibujar(){
        return "Dibujar Formas";
    }

    public String establecerColor(){
        return color;
    }

    public static void main(String[] args) {
        Formas forma = new Formas();
        System.out.println(forma.dibujar());
        System.out.println("Color de las forma: " +forma.color);

        Formas dibujoCirculo;
        dibujoCirculo = new Circulo();
        System.out.println("\nDibujo: " +dibujoCirculo.dibujar());
        Circulo radio = new Circulo();
        System.out.println("Radio: " +radio.calcularRadio()+ " cm");

        Formas dibujarLinea = new Linea();
        System.out.println("\nDibujo: " +dibujarLinea.dibujar());

        Formas dibujarTriangulo = new Triangulo();
        System.out.println("\nDibujo: " +dibujarTriangulo.dibujar());
        Triangulo area = new Triangulo();
        System.out.println("Area: " +area.calcularArea());

        Formas dibujarCuadrado = new Cuadrado();
        System.out.println("\nDibujo: " +dibujarCuadrado.dibujar());
        Cuadrado areacuadrado = new Cuadrado();
        System.out.println("Area: " +areacuadrado.calcularArea() + " centimetros cuadrados" );
    }
}
