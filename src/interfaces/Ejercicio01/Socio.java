package interfaces.Ejercicio01;

public class Socio implements Comparable<Socio>{
    private int id;
    private String nombre;
    private int edad;

    public Socio(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Socio [ID=" + id + ", Nombre=" + nombre + ", Edad=" + edad + "]";
    }

    @Override
    public int compareTo(Socio otroSocio) {
        return Integer.compare(this.id, otroSocio.id);
    }
}
