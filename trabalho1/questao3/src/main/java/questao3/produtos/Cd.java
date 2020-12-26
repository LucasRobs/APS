package questao3.produtos;

public class Cd extends Musica{
  private boolean arranhado;
  private boolean duplo;

  public Cd(String codigo, String titulo, String genero, String locado, String autor, String numFaixas, String arranhado, String duplo) {
    super(codigo, titulo, genero, locado, autor, numFaixas);
    this.arranhado = Boolean.getBoolean(arranhado);
    this.duplo = Boolean.getBoolean(duplo);
  }

  public boolean isArranhado() {
    return this.arranhado;
  }

  public boolean isDuplo() {
    return this.duplo;
  }

  @Override
  public String toString() {
    return "{" +
      "codigo='" + getCodigo() + "'" +
      ", titulo='" + getTitulo() + "'" +
      ", genero='" + getGenero() + "'" +
      ", locado='" + isLocado() + "'" +
      ", autor='" + getAutor() + "'" +
      ", numFaixas='" + getNumFaixas() + "'" +
      ", arranhado='" + isArranhado() + "'" +
      ", duplo='" + isDuplo() + "'" +
      "}";
  }
  
}