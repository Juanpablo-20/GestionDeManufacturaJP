package Modelo.Excepcion;

public class EntidadYaExisteException extends Exception {

    public EntidadYaExisteException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

    public EntidadYaExisteException(String mensaje) {
        super(mensaje);
    }
}
