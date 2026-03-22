public class Biblioteca {
    Libro[] libros = new Libro[10];

    public void agregarLibro(Libro libro) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                System.out.println("Libro agregado: " + libro.titulo);
                break;
            }
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println(libro.titulo + " - " + libro.autor);
            }
        }
    }
}
