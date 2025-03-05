package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *  @author Manuel_Dominguez_Navarro
 *  Git-Hub-> <a></a>
 *  Esta clase representa un biblioteca y con ella podemos gestionar todos sus libros.
 *  Podemos agregar, eliminar y buscar libros de diferentes maneras.
 *  Podemos encontrar metodo para buscar un libro especifico segun parametros o una lista de libros segun autor o titulo
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista de libros de la biblioteca
     */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**
     * Constructor de la clase Biblioteca
     * Inicializa un lista vacia de libros
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Constructor de la clase biblioteca, inicializa la lista de libros
     * @param libros lista de libros
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Metodo que agrega un libro a la biblioteca
     * @param libro el libro que se va a agregar
     * @return true si el libro  se agrega correctamente, false si no se agrega
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado

    /**
     * Metodo para eliminar un libro de la biblioteca
     * @param libro que se va a eliminar
     * @return true si el libro se elimina correctamente y false si no se elimino
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Metodo que obtiene una lista de todos los libros de la biblioteca
     * @return una lista de libros de la biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Metodo que busca un libro en la biblioteca segun si titulo
     * @param titulo titulo del libro que se va a buscar
     * @return  si lo encuentra retorna el libro y si no null
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearl
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * Busca un libro en la biblioteca por autor
     * Metodo obsoleto, remplazado por {@link #encuentaLibroPorAutor(String)}
     * @param autor autor del libro
     * @return si lo encuentra devuelve el libro y si no lo encuentra null
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca todos lo libros segun el auto especificado
     * Este metodo esta disponible desde la version 2.0
     * @param autor el autor de los libros que se van a buscar
     * @return Una lista de libros del autor o una lista de libros vacia
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
