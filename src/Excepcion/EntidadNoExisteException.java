package Modelo.Excepcion;

public class EntidadNoExisteException extends Exception {

    public EntidadNoExisteException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public EntidadNoExisteException(String mensaje) {
        super(mensaje);
    }
}
