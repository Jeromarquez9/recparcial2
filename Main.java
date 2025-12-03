public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===\n");

        Library library = new Library("Biblioteca Central");

        Book book1 = new Book("El Quijote", "978-1", "Miguel de Cervantes", 1605);
        Book book2 = new Book("Cien años de soledad", "978-2", "Gabriel García Márquez", 1967);
        Book book3 = new Book("1984", "978-3", "George Orwell", 1949);
        Book book4 = new Book("El amor en los tiempos del cólera", "978-4", "Gabriel García Márquez", 1985);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Libros agregados.\n");

        System.out.println("📊 Información de la biblioteca:");
        System.out.println(library);
        System.out.println(library.getStatistics());

        System.out.println("🔍 Buscando libros con 'amor' en el título:");
        LinkedList results = library.findBooksByTitle("amor");
        results.print();

        System.out.println("\n📖 Prestando un libro:");
        Book b = library.findBookByIsbn("978-1");
        if (b.lend()) System.out.println("Prestado: " + b.getTitle());

        System.out.println("\n📚 Disponibles:");
        library.getAvailableBooks().print();

        System.out.println("\n📤 Prestados:");
        library.getLoanedBooks().print();

        System.out.println("\n📊 Estadísticas finales:");
        System.out.println(library.getStatistics());
    }
}  o
