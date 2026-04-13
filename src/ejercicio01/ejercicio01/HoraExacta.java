package ejercicio01.ejercicio01;

public class HoraExacta extends Hora {
    private int segundos;

    /**
     * Constructor de la clse HoraExacta
     * @param hora Hora a asignar
     * @param minutos Minutos a asignar
     * @param segundos Segundos a asignar
     */
    public HoraExacta(int hora, int minutos, int segundos){
        super(hora, minutos);
        if (!setSegundos(segundos)){
            this.segundos = 0;
        }
    }

    /**
     * Setter que valida los segundos y si son correctos los asigna
     * @param valor Segundos a asignar
     * @return Devuelve true si se asigna el valor y false si no
     */
    public boolean setSegundos(int valor){
        if (valor > 59 || valor < 0){
            return false;
        }
        this.segundos = valor;
        return true;
    }

    /**
     * Metodo que incrementa en 1 los segundos
     */
    @Override
    public void inc(){
        segundos ++;
        if (segundos == 60){
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d", segundos);
    }
}