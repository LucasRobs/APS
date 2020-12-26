package questao3.produtos;
public class Vhs extends Filme{
  private boolean cores;

  public Vhs(String codigo, String titulo, String genero, String locado, String anoLancamanto, String duracao, String cores) {
    super(codigo, titulo, genero, locado, anoLancamanto, duracao);
    this.cores = Boolean.getBoolean(cores);
  }
  
  public boolean isCores() {
    return this.cores;
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
        ", cores='" + isCores() + "'" +
        "}";
    }
}