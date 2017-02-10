package pop6jahaziel;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class F117Nigthhawk extends Avion {

    private String Pais;

    public F117Nigthhawk() {
        super();
    }

    public F117Nigthhawk(String Pais, int peso, int velocidad, Date fecha, String Estado) {
        super(peso, velocidad, fecha, Estado);
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return super.toString() + "F117Nigthhawk{" + "Pais=" + Pais + '}';
    }

    
    @Override
    public void Volar() {
        if (Estado.equalsIgnoreCase("volando")) {
            try {
                throw new MyException("Ya está en vuelo");
            } catch (MyException ex) {
                JOptionPane.showMessageDialog(null, "No es válido");
            }
        } else {
            Estado="Volando";
        }
    }

    @Override
    public void Aterriza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarCombustible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
