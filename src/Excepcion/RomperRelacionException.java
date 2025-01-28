package Modelo.Excepcion;

import java.util.ArrayList;
import java.util.List;

public class RomperRelacionException extends Exception {

    private List<String> mensajes;

    public RomperRelacionException(List<String> msjs) {
        super((msjs != null && msjs.size() > 0 ? msjs.get(0) : null));
        if (msjs == null) {
            mensajes = new ArrayList<String>();
        } else {
            mensajes = msjs;
        }
    }

    public List<String> getMensajes() {
        return mensajes;
    }
}
