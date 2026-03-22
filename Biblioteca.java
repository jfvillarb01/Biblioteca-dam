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
    System.out.println("Catálogo de la biblioteca:");
        for (Libro libro : libros) {
        if (libro != null) {
            System.out.println("• " + libro.titulo + " - " + libro.autor);
        }
        }    
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
        if (libro != null && libro.titulo.equals(titulo)) {
            System.out.println("📕 Libro prestado: " + titulo);
            return;
        }
        }
    System.out.println("Libro no encontrado");
    }

}
