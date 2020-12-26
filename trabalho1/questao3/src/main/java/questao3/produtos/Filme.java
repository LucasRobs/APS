package questao3.produtos;
public abstract class Filme extends Produto{
  private String anoLancamanto;
  private String duracao;

  public String getAnoLancamanto() {
    return this.anoLancamanto;
  }

  public String getDuracao() {
    return this.duracao;
  }

  public Filme(String codigo, String titulo, String genero, String locado, String anoLancamanto, String duracao) {
    super(codigo, titulo, genero, locado);
    this.anoLancamanto = anoLancamanto;
    this.duracao = duracao;
  }
  
}