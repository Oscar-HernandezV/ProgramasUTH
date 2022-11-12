public class Futbolista extends Equipo{

    /*Parte1:
    1. Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y
    propiedades utilizando encapsulamiento, desde la clase que contiene el método principal,
    establecer y obtener su edad, nombre y equipoActual (Métodos set y get).
    Para la parte 1, apoyarse en la explicación práctica del módulo 4 contenida en este video: Video*/
    public int edad;
    protected String nombre;
    protected String equipoActual;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipoActual() {
        return equipoActual;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipoActual(String equipoActual) {
        this.equipoActual = equipoActual;
    }

    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista();
        System.out.println("Datos del Futbolista:");
        futbolista.edad = 28;
        futbolista.nombre = "Alonso Marcos";
        futbolista.equipoActual = "Barcelona";
        System.out.println("Nombre: "+futbolista.getNombre());
        System.out.println("Edad: "+futbolista.getEdad());
        System.out.println("Equipo Actual: "+futbolista.getEquipoActual());

        Barcelona barcelona = new Barcelona();
        System.out.println("\nDatos del Barcelona:");
        barcelona.nombreEqipo = "Barcelona";
        barcelona.presidente = "Joan Laporta";
        barcelona.capitan = "Pique";
        System.out.println("Nombre del equipo: "+barcelona.nombreEqipo);
        System.out.println("Presidente: "+barcelona.presidente);
        System.out.println("Capitan: "+barcelona.capitan);

        RealMadrid madrid = new RealMadrid();
        System.out.println("\nDatos del Real Madrid:");
        madrid.nombreEqipo = "Real Madrid";
        madrid.presidente = "Florentino Pérez";
        madrid.capitan = "Benzema";
        System.out.println("Nombre del equipo: "+madrid.nombreEqipo);
        System.out.println("Presidente: "+madrid.presidente);
        System.out.println("Capitan: "+madrid.capitan);

        Liverpool liver = new Liverpool();
        System.out.println("\nDatos del Liverpool:");
        liver.nombreEqipo = "Liverpool";
        liver.presidente = "Martin Broughton";
        liver.capitan = "\tMilner, James";
        System.out.println("Nombre del equipo: "+liver.nombreEqipo);
        System.out.println("Presidente: "+liver.presidente);
        System.out.println("Capitan: "+liver.capitan);

    }
}
