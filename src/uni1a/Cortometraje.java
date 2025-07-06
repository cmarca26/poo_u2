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
     * Muestra los detalles del cortometraje en consola.
     * Incluye el título, festival principal, duración, actores y festivales donde se ha presentado.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Festival principal: " + festival);
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println("  - " + actor);
        }
        System.out.println("Festivales:");
        for (String fest : festivales) {
            System.out.println("  - " + fest);
        }
        System.out.println();
    }
}
