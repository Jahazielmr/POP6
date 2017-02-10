package pop6jahaziel;

import java.util.Date;

public class F117Nigthhawk extends Avion{
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
        return super.toString()+"F117Nigthhawk{" + "Pais=" + Pais + '}';
    }
    

    
}
