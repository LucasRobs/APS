package pessoas;

public abstract class Funcionario extends Pessoa{
    private String login;
    private String senha;

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}