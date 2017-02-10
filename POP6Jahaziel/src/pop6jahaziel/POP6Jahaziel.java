package pop6jahaziel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POP6Jahaziel {

    public static void main(String[] args) {
        F117Nigthhawk a=new F117Nigthhawk();
        do {
            String opc =JOptionPane.showInputDialog("Ingrese el estado\n"
                + "1. Volando");
            a.Volar();
        } while (true);
        
    }

    // F4 50 
    // F16 200
    // F117 250
    public String listar(ArrayList Arreglo) {
        String lista = "";
        for (int i = 0; i < Arreglo.size(); i++) {
            lista += i + ". " + Arreglo.get(i) + "\n";
        }
        return lista;
    }
    
    public static void addmodMayBach(int pos) {
        String opc = "1";
        boolean agregar = false;
        if (pos == -1) {
            Carros.add(new MayBach());
            pos = Carros.size() - 1;
            agregar = true;
        } else {
            opc = JOptionPane.showInputDialog("Ingrese lo que desea modificar\n"
                    + "1. Color\n"
                    + "2. Fecha\n"
                    + "3. Kilometros por galón\n"
                    + "4. Marca de llantas\n"
                    + "5. No. de serie\n"
                    + "6. Polarizado\n"
                    + "7. Precio\n"
                    + "8. Velocidad máxima\n"
                    + "9. Cantidad de llantas de repuesto\n");
        }

        switch (opc) {
            //Clase Carro
            case "1":
                Carros.get(pos).setColor(leeColor());
                if (!agregar) {
                    break;
                }
            case "2":
                Carros.get(pos).setFechaEnsamblado(leeFecha());
                if (!agregar) {
                    break;
                }
            case "3":
                Carros.get(pos).setKMxGalon(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                
            case "4":
                Carros.get(pos).setMarcaDeLlantas(JOptionPane.showInputDialog("Ingrese la marca de llantas"));
                if (!agregar) {
                    break;
                }
                
            case "5":
                Carros.get(pos).setNoSerie(JOptionPane.showInputDialog("Ingrese número de serie"));
                if (!agregar) {
                    break;
                }
                
            case "6":
                Carros.get(pos).setPolarizado(JOptionPane.showInputDialog("Ingrese si es polarizado o no"));
                if (!agregar) {
                    break;
                }
                
            case "7":
                Carros.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta")));
                if (!agregar) {
                    break;
                }
                
            case "8":
                Carros.get(pos).setVelocidadMax(Float.parseFloat(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }

            //Clase Carro
            case "9":
                ((MayBach) (Carros.get(pos))).setLlantasRepuesto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Kilómetros por galón")));
                if (!agregar) {
                    break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida");
        }
    }
}
