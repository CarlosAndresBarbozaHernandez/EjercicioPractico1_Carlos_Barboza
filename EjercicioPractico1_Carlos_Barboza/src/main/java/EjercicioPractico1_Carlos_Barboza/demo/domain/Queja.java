package EjercicioPractico1_Carlos_Barboza.demo.domain;

public class Queja {
    private Long id;
    private String nombreCliente;
    private String email;
    private String telefono;
    private String tipo; // QUEJA, SUGERENCIA, CONSULTA
    private String asunto;
    private String mensaje;
    private boolean tratado;
    private String createdAt;

    // Constructores
    public Queja() {}

    public Queja(Long id, String nombreCliente, String email, String tipo, String mensaje) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    // Getters y Setters (omito por brevedad, pero agrégalos)
}
