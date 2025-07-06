package uni1a;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un video de YouTube, subclase de ContenidoAudiovisual.
 */
public class VideoYouTube extends ContenidoAudiovisual {
    // Canal que subió el video
    private String canal;
    // Cantidad de likes
    private int likes;
    // Indica si el video está monetizado
    private boolean monetizado;
    // Lista de actores que participan en el video
    private List<Actor> actores;

    /**
     * Constructor de la clase VideoYouTube
     * @param titulo Título del video
     * @param duracionEnMinutos Duración en minutos
     * @param genero Género del video
     * @param canal Canal que subió el video
     * @param likes Cantidad de likes
     * @param monetizado Si el video está monetizado
     */
    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int likes, boolean monetizado) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.likes = likes;
        this.monetizado = monetizado;
        this.actores = new ArrayList<>();
    }

    // Getter y setter para canal
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    // Getter y setter para likes
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    // Getter y setter para monetizado
    public boolean isMonetizado() {
        return monetizado;
    }

    public void setMonetizado(boolean monetizado) {
        this.monetizado = monetizado;
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

    /**
     * Muestra los detalles del video de YouTube en consola.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video de YouTube:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Canal: " + canal);
        System.out.println("Likes: " + likes);
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Monetizado: " + (monetizado ? "Sí" : "No"));
        System.out.println("Actores:");
        for (Actor actor : actores) {
            System.out.println("  - " + actor);
        }
        System.out.println();
    }
}
