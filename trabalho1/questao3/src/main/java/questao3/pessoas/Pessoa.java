package questao3.pessoas;

public abstract class Pessoa{
  private String nome;
  private String matricula;

  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getNome(){
    return this.nome;
  }

  public String getMatricula(){
    return matricula;
  }
}