package pop6jahaziel;

import java.util.Date;

public class Aviones {
  
    protected int peso, velocidad;
    protected Date fecha;
    protected String Estado;

    public Aviones() {
    }

    public Aviones(int peso, int velocidad, Date fecha, String Estado) {
        this.peso = peso;
        this.velocidad = velocidad;
        this.fecha = fecha;
        this.Estado = Estado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Aviones{" + "peso=" + peso + ", velocidad=" + velocidad 
                + ", fecha=" + fecha + ", Estado=" + Estado + '}';
    }
    
    
    
    
}
