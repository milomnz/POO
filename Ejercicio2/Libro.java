public class Libro {
    private long id;
    private String titulo;
    private Autor autor; // Asociación con Autor

    public Libro(long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}
