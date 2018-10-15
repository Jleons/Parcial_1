
package parcial_1;

/**
 *
 * @author Juan Sebastian Leon, Juan Camilo Amaya
 */
public class Estudiante {
        private Premios premio;
        private String nombre;
        private Carta carta;

    public Estudiante(Premios premio, String nombre, Carta carta) {
        this.premio = premio;
        this.nombre = nombre;
        
    }
        
    public void createCarta (Estudiante estudiante, int ref, ArrayList<Patrocinador>patrocinadores, cartasAcumuladas cart){
    estudiante.carta.add(new Carta (ref, estudiante, patrocinadores,"Gracias por el premio"));
    carta.cartas.add(estudiante.getCarta());
   
    }

    public String getNombre() {
        return this.nombre;
    }

    public Carta getCarta() {
        return this.carta;
    }
        
    
    
    
}
