package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un cortometraje, subclase de ContenidoAudiovisual.
 */
public class Cortometraje extends ContenidoAudiovisual {
    // Festival donde se presentó el cortometraje
    private String festival;
    // Lista de actores que participan en el cortometraje
    private List<Actor> actores;
    // Lista de festivales donde se ha presentado
    private List<String> festivales;

    /**
     * Constructor de la clase Cortometraje
     * @param titulo Título del cortometraje
     * @param duracionEnMinutos Duración en minutos
     * @param genero Género del cortometraje
     * @param festival Festival donde se presentó
     */
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festival) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
        this.actores = new ArrayList<>();
        this.festivales = new ArrayList<>();
        this.festivales.add(festival); // Se agrega el festival
    }

    // Getter y setter para festival
    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    // Métodos para manejar la lista de actores
    public List<Actor> getActores() {
        return actores;
    }

    public void agregarActor(Actor actor) {
        this.actores.add(actor);
    }

    public void eliminarActor(Actor actor) {
        this.actores.remove(actor);
    }

    // Métodos para manejar la lista de festivales
    public List<String> getFestivales() {
        return festivales;
    }

    public void agregarFestival(String festival) {
        this.festivales.add(festival);
    }

    public void eliminarFestival(String festival) {
        this.festivales.remove(festival);
    }

    /**
     * Devuelve una representación en cadena del cortometraje
     */
    @Override
    public String toString() {

        // Recorre la lista de actores y los concatena en una cadena
        String nombresActores = "";
        for (Actor actor : actores) {
            nombresActores += actor.toString() + ", ";
        }

        // Recorre la lista de festivales y los concatena en una cadena
        String nombresFestivales = "";
        for (String fest : festivales) {
            nombresFestivales += fest + ", ";
        }

        // Devuelve la información principal del cortometraje en formato texto
        return "Cortometraje: " + getTitulo() + " | Festival: " + festival + " | Duración: " + getDuracionEnMinutos() +
                " | Actores: [" + nombresActores + "] | Festivales: [" + nombresFestivales + "]";
    }
}
