package questao3.produtos;

public class Dvd extends Filme{
  private boolean arranhado;

  public Dvd(String codigo, String titulo, String genero, String locado, String anoLancamanto, String duracao, String arranhado) {
    super(codigo, titulo, genero, locado, anoLancamanto, duracao);
    this.arranhado = Boolean.getBoolean(arranhado);
  }

  public boolean isArranhado() {
    return this.arranhado;
  }


  @Override
  public double calcularDiaria() {
    // TODO Auto-generated method stub
    return 0;
  }
  @Override
    public String toString() {
      return "{" +
        "codigo='" + getCodigo() + "'" +
        ", titulo='" + getTitulo() + "'" +
        ", genero='" + getGenero() + "'" +
        ", locado='" + isLocado() + "'" +
        ", anoLancamanto='" + getAnoLancamanto() + "'" +
        ", duracao='" + getDuracao() + "'" +
        ", arranhado='" + isArranhado() + "'" +
        "}";
    }
}