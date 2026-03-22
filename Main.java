public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("El Quijote", "Cervantes"));

        biblioteca.mostrarLibros();

        biblioteca.prestarLibro("1984");
        biblioteca.devolverLibro("1984");
    }
}