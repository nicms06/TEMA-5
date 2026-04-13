package ejercicio01.ejercicio01;

public class Hora {
    private int hora;
    private int minutos;

    /**
     * Constructor de la clase Hora que valida los valores de la hora y los minutos.
     * @param hora Hora que queremos asignar
     * @param minuto Minutos que queremos asignar
     */
    public Hora(int hora, int minuto){
        if (!setHora(hora)){
            this.hora = 0;
        }

        if (!setMinutos(minuto)){
            this.minutos = 0;
        }
    }

    /**
     * Setter que valida los minutos y asigna el valor si es correcto
     * @param valor Valor que queremos asignar a los minutos
     * @return Devolvemos true si se asigna el valor y en caso contrario devuelve false
     */
    public boolean setMinutos(int valor){
        if (valor > 59 || valor < 0){
            return false;
        }
        this.minutos = valor;
        return true;
    }

    /**
     * Setter que valida la hora y asigna el valor si es correcto
     * @param valor Valor que queremos asignar a la hora
     * @return Devolvemos true si se asigna el valor y en caso contrario devuelve false
     */
    public boolean setHora(int valor){
        if (valor < 0 || valor > 23){
            return false;
        }
        this.hora = valor;
        return true;
    }

    /**
     * Metodo que suma 1 a los minutos
     */
    public void inc(){
        minutos++;
        if (minutos == 60){
            minutos = 0;
            hora ++;

            if (hora == 24){
                hora = 0;
            }
        }
    }

    @Override
    public String toString(){
        return hora + ":" + String.format("%02d", minutos);
    }
}