import java.util.HashSet;
import java.util.Set;

public class Teleticket {
   
    private String nombreArtista;
    private String fechaConcierto;
    private String categoría;
    private Set<Subscriptor> observadores;

    public Teleticket(String nombreArtista, String fechaConcierto, String categoría) {
        this.nombreArtista = nombreArtista;
        this.fechaConcierto = fechaConcierto;
        this.categoría = categoría;
        this.observadores = new HashSet<>();
    }

    public void agregarSubscriptor(Subscriptor observador) {
        observadores.add(observador);
    }

    public void quitarSubscriptor(Subscriptor observador) {
        observadores.remove(observador);
    }

    public void notificarDisponibilidad() {
        if (fechaConcierto.endsWith("-15")) {
            String mensaje = "Entradas disponibles para " + nombreArtista + " el " + fechaConcierto + " en la categoría " + categoría + "!";
            for (Subscriptor observador : observadores) {
                observador.actualizar(mensaje);
            }
        }
    }
}
