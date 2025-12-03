public class Book { 
    private String title;
    private String isbn;
    private String author;
    private int publicationYear;
    private boolean available;
    private int timesLoaned;
    static int contador = 0;

    public Book(String title, String isbn, String author, int publicationYear) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = true;
        this.timesLoaned = 0;
        contador++;
    }

    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isAvailable() { return available; }
    public int getTimesLoaned() { return timesLoaned; }


    public void setTitle(String title) { this.title = title; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setAuthor(String author) { this.author = author; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
    public void setAvailable(boolean available) { this.available = available; }

    public void setTimesLoaned(int timesLoaned) { 
        this.timesLoaned = timesLoaned; 
    }

    
    public boolean lend() {
        if (available) {
            available = false;
            timesLoaned++;
            return true;
        }
        return false;
    }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return String.format(
            "Título: %s | ISBN: %s | Autor: %s | Año: %d | Disponible: %b | Veces prestado: %d",
            title, isbn, author, publicationYear, available, timesLoaned
        );
    }
}
