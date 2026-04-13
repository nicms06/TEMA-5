package ejercicio01.ejercicio03;

public class Productos {
    private String nombre;
    private double precio;

    /**
     * COnstructor de la clase Productos
     * @param nombre Nombre con el que se inicializa la clase
     * @param precio Precio con el que se inicializa la clase
     */
    public Productos(String nombre, double precio){
        this.nombre = nombre;
        setPrecio(precio);
    }

    /**
     * Metodo setter que valida el precio
     * @param precio Precio a introducir
     */
    public void setPrecio(double precio){
        if (precio < 0){
            throw new IllegalArgumentException("ERROR: Precio no válido.");
        }
        this.precio = precio;
    }

    /**
     * Metodo que calcular el precio total de todos los productos
     * @param cantidadProductos Número de productos
     * @return Devolvemos el precio de los productos introducidos
     */
    public double calcular(int cantidadProductos){
        return cantidadProductos * precio;
    }

    @Override
    public String toString(){
        return "Producto: " + nombre + "-> " + precio;
    }
}
