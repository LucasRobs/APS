package produtos;
public abstract class Produto{
  private int codigo;
  private String titulo;
  private String genero;
  private boolean locado;

  public abstract double calcularDiaria();

  public int getCodigo(){
    return codigo;
  }
}