package biblioteca;

/**
 *  @author Manuel_Dominguez_Navarro
 *  Git-Hub-> <a>https://github.com/Manudominguez1994/DNM_Examen2_ED</a>
 *  Esta claro representa un libro dentro de la biblioteca
 *  La clase contiene atributos y metodos relacionados con el libro, como por ejemplo:
 *  titulo,autor,año de publicacion
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Atributos del libro
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor que inicializa un nuevo libro con los datos proporcionados
     * @param titulo el titulo del libro
     * @param autor el autor del libro
     * @param anioPublicacion el año de publicacion del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Metodo que obtiene el autor del libro
     * @return  el autor del libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Metodo que obtiene el año  de publicacion
     * @return año de publicacion del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
