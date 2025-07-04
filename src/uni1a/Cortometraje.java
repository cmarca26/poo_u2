package uni1a;

/**
 * Clase que representa un cortometraje, subclase de ContenidoAudiovisual.
 */
public class Cortometraje extends ContenidoAudiovisual {
    // Festival donde se presentó el cortometraje
    private String festival;
    // Duración en segundos
    private int duracionEnSegundos;

    /**
     * Constructor de la clase Cortometraje
     * @param titulo Título del cortometraje
     * @param duracionEnMinutos Duración en minutos
     * @param genero Género del cortometraje
     * @param festival Festival donde se presentó
     * @param duracionEnSegundos Duración en segundos
     */
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festival, int duracionEnSegundos) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
        this.duracionEnSegundos = duracionEnSegundos;
    }

    // Getter y setter para festival
    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    // Getter y setter para duracionEnSegundos
    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    /**
     * Devuelve una representación en cadena del cortometraje
     */
    @Override
    public String toString() {
        return "Cortometraje: " + getTitulo() + " | Festival: " + festival + " | Duración: " + duracionEnSegundos + " segundos";
    }
}
