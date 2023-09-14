public class Fanatico implements Subscriptor {
   
    private String nombre;
    private String apellido;
    
    
    public Fanatico(String nombre, String apellido){
        this.apellido=apellido;
        this.nombre=nombre;    
     }
    
     @Override
     public void actualizar(String mensaje) {
         System.out.println(nombre + " " + apellido + " ha recibido una notificación: " + mensaje);
     }

    }