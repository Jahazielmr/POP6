package pop6jahaziel;

import java.awt.Color;
import java.util.Date;

public class F4Phantom extends Avion{
    protected Color color;

    public F4Phantom() {
        super();
    }

    public F4Phantom(Color color, int peso, int velocidad, Date fecha, String Estado) {
        super(peso, velocidad, fecha, Estado);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+"F4Phantom{" + "color=" + color + '}';
    }
    
    
      
    
}
