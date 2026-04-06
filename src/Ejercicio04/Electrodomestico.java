package Ejercicio04;

import java.util.Objects;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected final double PRECIO_BASE_DEFECTO = 100;
    protected final String COLOR_DEFECTO = "blanco";
    protected final char CONSUMO_DEFECTO = 'F';
    protected final double PESO_DEFECTO = 5;

    public Electrodomestico(double precioBase, double peso){

        if (!setPrecioBase(precioBase)){
            this.precioBase = PRECIO_BASE_DEFECTO;
        }

        if (!setPeso(peso)){
            this.peso = PESO_DEFECTO;
        }

        this.color = COLOR_DEFECTO;
        this.consumoEnergetico = CONSUMO_DEFECTO;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        if (!setPrecioBase(precioBase)){
            this.precioBase = PRECIO_BASE_DEFECTO;
        }

        if (!setPeso(peso)){
            this.peso = PESO_DEFECTO;
        }

        if (!setConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico = CONSUMO_DEFECTO;
        }

        if (!setColor(color)){
            this.color = COLOR_DEFECTO;
        }
    }

    /**
     * Setter que valida que el precio base no sea negativo. Si es positivo asignamos el valor
     * @param valor Valor que queremos asignar al precio base
     * @return Devolvemos true si se asigna el valor y false si no
     */
    public boolean setPrecioBase(double valor){
        if (valor < 0){
            return false;
        }
        this.precioBase = valor;
        return true;
    }

    /**
     * Setter que valida que el peso base no sea negativo. Si es positivo asignamos el valor
     * @param valor Valor que queremos asignar al precio base
     * @return Devolvemos true si se asigna el valor y false si no
     */
    public boolean setPeso(double valor){
        if (valor < 0){
            return false;
        }
        this.peso = valor;
        return true;
    }

    /**
     * Setter que valida si el consumo energético es válido (Valores entre A y F)
     * @param valor Caracter que representa el valor energético a asignar
     * @return Devolvemos true si se asigna el valor y false si no
     */
    public boolean setConsumoEnergetico(char valor){
        char valorMayus = Character.toUpperCase(valor);

        if (valorMayus < 'A' || valorMayus > 'F'){
            return false;
        }
        this.consumoEnergetico = valorMayus;
        return true;
    }

    /**
     * Setter que valida si el color es válido (blanco, negro, rojo, azul y gris)
     * @param color String a asignar
     * @return Devolvemos true si se asigna el valor y false si no
     */
    public boolean setColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String colorBuscar : coloresDisponibles){
            if (colorBuscar.equalsIgnoreCase(color)){
                this.color = colorBuscar.toLowerCase();
                return true;
            }
        }

        return false;
    }
}




























