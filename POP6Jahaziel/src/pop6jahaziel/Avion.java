package pop6jahaziel;

import java.util.Date;

public abstract class Avion {
  
    
    protected int Peso, Velocidad;
    protected Date Fecha;
    protected String Estado="";

    public Avion() {
    }

    public Avion(int Peso, int Velocidad, Date Fecha, String Estado) {
        this.Peso = Peso;
        this.Velocidad = Velocidad;
        this.Fecha = Fecha;
        this.Estado = Estado;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Aviones{" + "Peso=" + Peso + ", Velocidad=" + Velocidad 
                + ", Fecha=" + Fecha + ", Estado=" + Estado + '}';
    }
    
    public abstract void Volar();
    public abstract void Aterriza();
    public abstract void CargarCombustible();
    
    
    
}
