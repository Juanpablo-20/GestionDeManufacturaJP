package Vista;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

public class ModeloDeTabla extends DefaultTableModel {

    Collection<Object> data;
    Object[] claseColumnas;

    public ModeloDeTabla(String[] nomCol, Object[] tipoCol) {
        claseColumnas = tipoCol;
        data = new ArrayList<>();
        setColumnIdentifiers(nomCol);
    }

    @Override
    public Class getColumnClass(int c) {
        return claseColumnas[c].getClass();
    }
}
