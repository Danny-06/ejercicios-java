public class Pelicula {

  // Atributos de instancia
  private String id;
  private String titulo;
  private int duracion; // minutos
  private int ano;
  private String genero;

  // Constructores
  public Pelicula(String id, String titulo, int duracion, int ano, String genero) {
    this.id = id;
    this.titulo = titulo;
    this.duracion = duracion;
    this.ano = ano;
    this.genero = genero;
  }

  // Getters y Setters
  public String getId() {
    return this.id;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public int getDuracion() {
    return this.duracion;
  }

  public int getAno() {
    return this.ano;
  }

}
