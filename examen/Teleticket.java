import java.util.HashSet;
import java.util.Set;

public class Teleticket {
   
    private String nombreArtista;
    private String fechaConierto;
    private double precio;
    private String categoría;
    private int disponibilidad;
    private Set<Fanatico> suscriptores;

    public Teleticket(String nombreArtist, String fechaConierto, double precio, String categoría, int disponibilidad){

        this.nombreArtista = nombreArtista;
        this.fechaConierto = fechaConierto;
        this.precio = precio;
        this.categoría = categoría;
        this.disponibilidad = disponibilidad;
        this.suscriptores = new HashSet<>();
    }

    public void agregarSuscriptor(Fanatico fanatico){
        suscriptores.add(fanatico);
    }

    public void quitarSuscriptor(Fanatico fanatico){
        suscriptores.remove(fanatico);
    }

    public void notificarDisponibilidad(){
        if (fechaConierto.endsWith("-15")){
            for (Fanatico fanatico : suscriptores){
                System.out.println("Notificación para: " + fanatico.getNombre() + ": Entradaas disponibles para " + nombreArtista + " el" + fechaConierto + " en la categoría" + categoría + "!");
            }
        }
    }
}