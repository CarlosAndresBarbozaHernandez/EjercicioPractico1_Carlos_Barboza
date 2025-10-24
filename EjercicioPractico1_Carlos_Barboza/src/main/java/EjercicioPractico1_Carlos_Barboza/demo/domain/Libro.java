package EjercicioPractico1_Carlos_Barboza.demo.domain;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private String descripcion;
    private Long categoriaId; // Referencia a Categoria
    private String fechaPublicacion;
    private boolean disponible;
    private Double precio;
    private String createdAt;
    private String updatedAt;

    // Constructores
    public Libro() {}

    public Libro(Long id, String titulo, String autor, Long categoriaId) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoriaId = categoriaId;
    }

    // Getters y Setters (omito por brevedad, pero agrégalos como en Categoria)
}
