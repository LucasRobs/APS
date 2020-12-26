package questao3.produtos;
public class Musica extends Produto{
  private String autor;
  private int numFaixas;

  @Override
  public double calcularDiaria() {
    return 0;
  }

  public Musica(String codigo, String titulo, String genero, String locado, String autor, String numFaixas) {
    super(codigo, titulo, genero, locado);
    this.autor = autor;
    this.numFaixas = Integer.parseInt(numFaixas);
  }

  public String getAutor() {
    return this.autor;
  }

  public int getNumFaixas() {
    return this.numFaixas;
  }
}