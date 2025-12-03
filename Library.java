public class Library {
    private String name;
    private LinkedList books;

    public Library(String name) {
        this.name = name;
        this.books = new LinkedList();
    }

    public String getName() { return name; }
    public LinkedList getBooks() { return books; }
    public void setName(String name) { this.name = name; }

    public boolean addBook(Book book) {
        if (book != null) {
            books.add(book);
            return true;
        }
        return false;
    }

    public boolean removeBook(Book book) {
        return books.remove(book) != null;
    }

    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            Book b = (Book) books.get(i);
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public LinkedList findBooksByTitle(String title) {
        LinkedList found = new LinkedList();

        for (int i = 0; i < books.size(); i++) {
            Book b = (Book) books.get(i);
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                found.add(b);
            }
        }

        return found;
    }

    public LinkedList findBooksByAuthor(String authorName) {
        LinkedList found = new LinkedList();

        for (int i = 0; i < books.size(); i++) {
            Book b = (Book) books.get(i);
            if (b.getAuthor().equalsIgnoreCase(authorName)) {
                found.add(b);
            }
        }

        return found;
    }

    public LinkedList getAvailableBooks() {
        LinkedList available = new LinkedList();

        for (int i = 0; i < books.size(); i++) {
            Book b = (Book) books.get(i);
            if (b.isAvailable()) {
                available.add(b);
            }
        }

        return available;
    }

    public LinkedList getLoanedBooks() {
        LinkedList loaned = new LinkedList();

        for (int i = 0; i < books.size(); i++) {
            Book b = (Book) books.get(i);
            if (!b.isAvailable()) {
                loaned.add(b);
            }
        }

        return loaned;
    }

    public String getStatistics() {
        int totalBooks = books.size();
        int availableBooks = getAvailableBooks().size();
        int loanedBooks = getLoanedBooks().size();

        return String.format(
            "\nEstadísticas de la Biblioteca:\n" +
            "- Total de Libros: %d\n" +
            "- Libros Disponibles: %d\n" +
            "- Libros Prestados: %d\n",
            totalBooks, availableBooks, loanedBooks
        );
    }

    @Override
    public String toString() {
        return "Biblioteca: " + name + " | Libros cargados: " + books.size();
    }
}
