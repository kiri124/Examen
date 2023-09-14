public class main {
    public static void main(String[] args) {
        Teleticket concierto = new Teleticket("Artista X", "2023-09-15", "General");

        Fanatico fanatico1 = new Fanatico("Eduardo", "Ramirez");
        Fanatico fanatico2 = new Fanatico("Jhersvin", "Villodas");
        Fanatico fanatico3 = new Fanatico("Andrés", "Sanabria");

        concierto.agregarSubscriptor(fanatico1);
        concierto.agregarSubscriptor(fanatico2);
        concierto.agregarSubscriptor(fanatico3);

        concierto.notificarDisponibilidad();
    }
}
