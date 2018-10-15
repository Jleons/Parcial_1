
package parcial_1;

import java.util.ArrayList;

/**
 *
 * @author Juan Sebastian Leon, Juan Camilo Amaya
 */
public class Carta {
    private int referencia;
    private Estudiante estudiante;
    private ArrayList <Patrocinador> patrocinador;
    private String texto;

    public Carta(int referencia, Estudiante estudiante, ArrayList<Patrocinador> patrocinador, String texto) {
        this.referencia = referencia;
        this.estudiante = estudiante;
        this.patrocinador = patrocinador;
        this.texto = texto;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public ArrayList<Patrocinador> getPatrocinador() {
        return this.patrocinador;
    }
    
    
    
    
    
}
