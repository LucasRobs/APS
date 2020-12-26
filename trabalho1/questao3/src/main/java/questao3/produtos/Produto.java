package questao3.produtos;
public abstract class Produto{
  private String codigo;
  private String titulo;
  private String genero;
  private boolean locado;

  public abstract double calcularDiaria();

  public Produto(String codigo, String titulo, String genero, String locado) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.genero = genero;
    this.locado = Boolean.getBoolean(locado);
  }

  public String getCodigo(){
    return codigo;
  }


  public String getTitulo() {
    return this.titulo;
  }

  public String getGenero() {
    return this.genero;
  }

  public boolean isLocado() {
    return this.locado;
  }

  public void setLocado(boolean bool){
    this.locado = bool;
  }

}