package pop6jahaziel;

import java.util.ArrayList;

public class POP6Jahaziel {

    public static void main(String[] args) {
        
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
}
