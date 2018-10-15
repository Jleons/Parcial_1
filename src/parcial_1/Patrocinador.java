
package parcial_1;

import java.util.ArrayList;

/**
 *
 * @author Juan Sebastian Leon, Juan Camilo Amaya
 */
public class Patrocinador {
    private ArrayList <Premios> premios;
    private String nombre;

    public Patrocinador(ArrayList<Premios> premios, String nombre) {
        this.premios = premios;
        this.nombre = nombre;
    }

      public String getNombre() {
        return nombre;
    }
    
    
    
    
}
