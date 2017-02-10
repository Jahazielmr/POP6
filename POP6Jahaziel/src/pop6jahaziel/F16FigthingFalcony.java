package pop6jahaziel;

import java.util.Date;

public class F16FigthingFalcony extends Avion{
    
    private int Cant_Combustible; 

    public F16FigthingFalcony() {
        super();
    }

    public F16FigthingFalcony(int Cant_Combustible, int peso, int velocidad, Date fecha, String Estado) {
        super(peso, velocidad, fecha, Estado);
        this.Cant_Combustible = Cant_Combustible;
    }

    public int getCant_Combustible() {
        return Cant_Combustible;
    }

    public void setCant_Combustible(int Cant_Combustible) {
        this.Cant_Combustible = Cant_Combustible;
    }

    @Override
    public String toString() {
        return super.toString()+"F16FigthingFalcony{" + "Cant_Combustible=" + Cant_Combustible + '}';
    }
    
    
            
            
    



    
}
