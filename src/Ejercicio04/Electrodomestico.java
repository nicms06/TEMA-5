package Ejercicio04;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    protected static final double PRECIO_BASE_DEFECTO = 100;
    protected static final String COLOR_DEFECTO = "blanco";
    protected static final char CONSUMO_DEFECTO = 'F';
    protected static final double PESO_DEFECTO = 5;

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

        if (!comprobarConsumoEnergetico(consumoEnergetico)){
            this.consumoEnergetico = CONSUMO_DEFECTO;
        }

        if (!comprobarColor(color)){
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
     * Metodo que valida si el consumo energético es válido (Valores entre A y F)
     * @param letra Caracter que representa el valor energético a asignar
     */
    private boolean comprobarConsumoEnergetico(char letra){
        char valorMayus = Character.toUpperCase(letra);

        if (valorMayus < 'A' || valorMayus > 'F'){
            this.consumoEnergetico = CONSUMO_DEFECTO;
            return false;
        } else{
            this.consumoEnergetico = valorMayus;
            return true;
        }
    }

    /**
     * Metodo que valida si el color es válido (blanco, negro, rojo, azul y gris)
     * @param color String a asignar
     */
    private boolean comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String colorBuscar : coloresDisponibles){
            if (colorBuscar.equalsIgnoreCase(color)){
                this.color = colorBuscar.toLowerCase();
                return true;
            }
        }

        this.color = COLOR_DEFECTO;

        return false;

    }

    public double precioFinal(){
        double suma = 0;

        switch (consumoEnergetico){
            case 'A':
                suma += 100;
                break;
            case 'B':
                suma += 80;
                break;
            case 'C':
                suma += 60;
                break;
            case 'D':
                suma += 50;
                break;
            case 'E':
                suma += 30;
                break;
            case 'F':
                suma += 10;
                break;
        }

        if (peso >= 0 && peso <=19){
            suma += 10;
        } else if (peso >= 20 && peso <=49){
            suma += 50;
        } else if (peso >= 50 && peso <= 79){
            suma += 80;
        } else{
            suma += 100;
        }

        return precioBase + suma;
    }
}




























