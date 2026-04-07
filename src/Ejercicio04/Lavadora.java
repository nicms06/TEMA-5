package Ejercicio04;

public class Lavadora extends Electrodomestico{

    private double carga;

    protected static final double CARGA_DEFECTO = 5;

    /**
     * Constructor de la clase Lavadora con el precio base y el peso. El resto de atributos por defecto
     * @param precioBase Precio de la superclase
     * @param peso Peso de la superclase
     */
    public Lavadora (double precioBase, double peso){
        super (precioBase, peso);
        this.carga = CARGA_DEFECTO;
    }

    /**
     * Constructor de la clase Lavadora con todos los atributos
     * @param precioBase Precio de la superclase
     * @param color Color de la superclase
     * @param consumoEnergetico Consumo de la superclase
     * @param peso Peso de la superclase
     * @param carga Carga de la clase hija
     */
    public Lavadora (double precioBase, String color, char consumoEnergetico, double peso, double carga){
        super (precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * Metodo que se encarga de calcular el precio final de la lavadora
     * @return Devolvemos el precio final
     */
    @Override
    public double precioFinal(){
        double precioHerencia = super.precioFinal();

        if (carga > 30){
            precioHerencia += 50;
        }

        return precioHerencia;
    }
}