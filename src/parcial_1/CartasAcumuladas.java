
package parcial_1;

import java.util.ArrayList;

/**
 *
 * @author Juan Sebastian Leon, Juan Camilo Amaya
 */
public class CartasAcumuladas {
    private ArrayList <Carta> cartas;
    
    public CartasAcumuladas (ArrayList<Carta>cartas){
        this.cartas= cartas;
    }
    
    public void getCartas(){
        for (int i = 0; i < this.cartas.size(); i++) {
            System.out.println("Estudiante" + cartas.get(i).getEstudiante.getNombre());
            System.out.println("Patrocinador" + cartas.get(i).getPatrocinador.getNombre());
            System.out.println("Estudiante" + cartas.get(i).getRef());
        }
    
    
    }
    
    
    
}
