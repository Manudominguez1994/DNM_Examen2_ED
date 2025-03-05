package biblioteca;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    @Test
    void agregarLibro() {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El temor de un hombre sabio","Patrick Rothfuss", 2011);

        boolean resutlado = biblioteca.agregarLibro(libro);

        assertTrue(resutlado);
    }

    @Test
    void eliminarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El temor de un hombre sabio","Patrick Rothfuss", 2011);

        boolean resutlado = biblioteca.eliminarLibro(libro);

        assertTrue(resutlado);
    }

    @Test
    void encuentraLibroPorTitulo() {

        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El temor de un hombre sabio","Patrick Rothfuss", 2011);
        biblioteca.agregarLibro(libro);

        Libro result = biblioteca.encuentraLibroPorTitulo("El temor de un hombre sabio");

        assertNotNull(result, "El libro se encontró por título.");
        assertEquals(libro, result, "El libro encontrado no es el esperado.");
    }

    @Test
    void encuentraLibrosPorAutor() {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("La piedra filosfal", "J.K. Rowling", 1998);
        Libro libro2 = new Libro("La camara secreta", "J.K. Rowling", 1999);
        Libro libro3 = new Libro("El prisionero de azkaban", "J.K. Rowling", 2001);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        List<Libro> libros = biblioteca.encuentraLibrosPorAutor("J.K. Rowling");

        assertNotNull(libros, "La lista no debe ser null.");
        assertEquals(2, libros.size(), "Debe haber 2 libros de J.K. Rowling.");
        assertTrue(libros.contains(libro1), "La lista debe contener 'La camara secreta'.");
        assertTrue(libros.contains(libro2), "La lista debe contener 'El prisionero de azkaban'.");

        List<Libro> librosInexistente = biblioteca.encuentraLibrosPorAutor("J.R.R. Tolkien");

        assertTrue(librosInexistente.isEmpty(), "La lista debe estar vacía para un J.R.R. Tolkien.");
    }

    @Test
    void testConstructorLibro() {

        String tituloEsperado = "Harry Potter y la piedra filosofal";
        String autorEsperado = "J.K. Rowling";
        int anioPublicacionEsperado = 1998;

        Libro libro = new Libro(tituloEsperado, autorEsperado, anioPublicacionEsperado);

        assertEquals(tituloEsperado, libro.getTitulo(), "El título del libro no es correcto.");

        assertEquals(autorEsperado, libro.getAutor(), "El autor del libro no es correcto.");

        assertEquals(anioPublicacionEsperado, libro.getAnioPublicacion(), "El año de publicación del libro no es correcto.");
    }
}