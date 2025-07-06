package poo;
import uni1a.*;
import java.util.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear listas de objetos base
        List<Actor> actores = new ArrayList<>();
        actores.add(crearActor("Sam Worthington", 45, "Australia", "Jake Sully"));
        actores.add(crearActor("Zoe Saldana", 42, "EEUU", "Neytiri"));
        actores.add(crearActor("Sigourney Weaver", 70, "EEUU", "Grace"));
        actores.add(crearActor("Stephen Lang", 68, "EEUU", "Miles Quaritch"));

        List<Temporada> temporadas = new ArrayList<>();
        temporadas.add(crearTemporada(1, 10, 2011, "Inicio de la serie"));
        temporadas.add(crearTemporada(2, 10, 2012, "Desarrollo de la trama"));
        temporadas.add(crearTemporada(3, 10, 2013, "Clímax"));
        temporadas.add(crearTemporada(4, 6, 2014, "Final inesperado"));

        List<Investigador> investigadores = new ArrayList<>();
        investigadores.add(crearInvestigador("Carl Sagan", "NASA", "Astronomía", 30));
        investigadores.add(crearInvestigador("Neil deGrasse Tyson", "Hayden Planetarium", "Astrofísica", 20));
        investigadores.add(crearInvestigador("Jane Goodall", "Instituto Jane Goodall", "Primatología", 50));
        investigadores.add(crearInvestigador("Stephen Hawking", "Universidad de Cambridge", "Cosmología", 40));

        // Crear pelicula y agregar actores aleatorios
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Random rand = new Random();
        for (int i = 0; i < 2; i++) {
            Actor actorAleatorio = actores.get(rand.nextInt(actores.size()));
            pelicula.agregarActor(actorAleatorio);
        }

        // Crear serieDeTv y agregar temporadas aleatorias
        SerieDeTV serieDeTv = new SerieDeTV("Game of Thrones", 60, "Fantasy", 0);
        for (int i = 0; i < 3; i++) {
            Temporada tempAleatoria = temporadas.get(rand.nextInt(temporadas.size()));
            serieDeTv.agregarTemporada(tempAleatoria);
        }

        // Crear documental y agregar investigadores aleatorios
        Documental documental = new Documental("Nuestro Planeta", 50, "Naturaleza", "Biodiversidad");
        for (int i = 0; i < 2; i++) {
            Investigador investigadorAleatorio = investigadores.get(rand.nextInt(investigadores.size()));
            documental.agregarInvestigador(investigadorAleatorio);
        }

        // Crear cortometraje y agregar actores y festivales aleatorios
        Cortometraje cortometraje = new Cortometraje("La Jetée", 28, "Ciencia Ficción", "Festival de Cannes");
        for (int i = 0; i < 2; i++) {
            Actor actorAleatorio = actores.get(rand.nextInt(actores.size()));
            cortometraje.agregarActor(actorAleatorio);
        }

        // Crear VideoYouTube y agregar actores aleatorios
        VideoYouTube videoYouTube = new VideoYouTube("El experimento de la doble rendija", 15, "Ciencia", "QuantumFracture", 250000, true);
        for (int i = 0; i < 2; i++) {
            Actor actorAleatorio = actores.get(rand.nextInt(actores.size()));
            videoYouTube.agregarActor(actorAleatorio);
        }

        // Guardar en el arreglo
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = pelicula;
        contenidos[1] = serieDeTv;
        contenidos[2] = documental;
        contenidos[3] = cortometraje;
        contenidos[4] = videoYouTube;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }

    // Métodos privados para crear objetos base
    private static Actor crearActor(String nombre, int edad, String nacionalidad, String personaje) {
        return new Actor(nombre, edad, nacionalidad, personaje);
    }
    private static Temporada crearTemporada(int numero, int episodios, int anio, String sinopsis) {
        return new Temporada(numero, episodios, anio, sinopsis);
    }
    private static Investigador crearInvestigador(String nombre, String institucion, String especialidad, int anios) {
        return new Investigador(nombre, institucion, especialidad, anios);
    }
}