public class main {
    public static void main(String[] args){
        Teleticket concierto = new Teleticket("Artista X", "2023-09-15", 50.0, "General", 1000);

        Fanatico fanatico1 = new Fanatico("Eduardo", "Ramirez");
        Fanatico fanatico2 = new Fanatico("Jhersvin", "Villodas");
        Fanatico fanatico3 = new Fanatico("Andrés", "Sanabria");

        concierto.agregarSuscriptor(fanatico1);
        concierto.agregarSuscriptor(fanatico2);
        concierto.agregarSuscriptor(fanatico3);

        concierto.notificarDisponibilidad();

    }
   
}