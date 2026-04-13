package ejercicio01.ejercicio02;

public class Empleado {
    private String nombre;

    /**
     * Constructor de la clase empleado
     * @param nombre Nombre con el que se inicializan los objetos
     */
    public Empleado(String nombre){
        setNombre(nombre);
    }

    /**
     * Metodo set para validar el nombre
     * @param nombre Nombre que se quiere introducir
     */
    public void setNombre(String nombre){
        String[] nombreSeparado = nombre.split("");
        for (String letra : nombreSeparado){
            if (Character.isDigit(letra.charAt(0))){
                throw new IllegalArgumentException("ERROR: Nombre no válido.");
            }
        }

        this.nombre = nombre;
    }

    /**
     * Metodo getNombre
     * @return Devuelve el nombre
     */
    public String getNombre(){
        return this.nombre;
    }

    @Override
    public String toString(){
        return  "Empleado: " + nombre;
    }
}
