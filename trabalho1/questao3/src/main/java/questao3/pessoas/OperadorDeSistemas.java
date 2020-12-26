package questao3.pessoas;

import java.time.LocalDate;
import java.util.*;

import questao3.repositorio.*;
import questao3.produtos.*;

public class OperadorDeSistemas extends Funcionario{
  private HashMap<String, Pessoa> pessoas;
  private HashMap<String, Produto> produtos;
  private ArrayList<Locacao> locacoes;

  public OperadorDeSistemas(String nome, String matricula, String login, String senha, HashMap<String, Pessoa> pessoas, HashMap<String, Produto> produtos, ArrayList<Locacao> locacoes){
    super.setLogin(login);
    super.setSenha(senha);
    super.setMatricula(matricula);
    super.setNome(nome);
    this.pessoas = pessoas;
    this.produtos = produtos;
    this.locacoes = locacoes;
  }
  @Override
  public String toString() {
      return "{" +
          " matricula='" + getMatricula() + "'" +
          ", nome='" + getNome()+ "'"+
          "}";
  }

  public void fazerLocação(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite a matricula do CLIENTE e o codigo de PRODUTO: ");
    String[] dados = scanner.nextLine().split(" ");
    Produto produto = produtos.get(dados[1]);
    if(produto != null && !produto.isLocado() && pessoas.containsKey(dados[0])){
      produto.setLocado(true);
      LocalDate saida = LocalDate.now();
      LocalDate devolucao = LocalDate.now().plusDays(2);
      locacoes.add(new Locacao(dados[1], dados[0], saida, devolucao));
    }else{
      System.out.println("Ouve um problema, tente novamente com informações validas!");
    }
  }
  public void darBaixa(){
    double diaria = 2.50f;
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite a matricula do CLIENTE e o codigo de PRODUTO: ");
    String[] dados = scanner.nextLine().split(" ");
    for(Locacao locacao : locacoes){
      if(locacao.getMatricula().equals(dados[0]) && locacao.getCodigoDoProduto().equals(dados[1])){
        double multa = calcularMulta(diaria, locacao.getDataDeSaida(), locacao.getDataEntrega());
        if(multa > 0){
          System.out.println("atraso: "+ multa / diaria +"dias multa: "+multa + 5f +"R$");
          return;
        }else{
          System.out.println("A locação esta em dias. ");
          return;
        }
      }
    }
    System.out.println("Nenhuma locação foi encontrada. ");
    return;
  }
  public double calcularMulta(double multa ,LocalDate dataDeSaida, LocalDate dataEntrega){
    return  dataEntrega.getDayOfYear() - dataDeSaida.getDayOfYear() * multa;
  }

  public void excluirLocacao(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite a matricula do CLIENTE e o codigo de PRODUTO: ");
    String[] dados = scanner.nextLine().split(" ");
    for(Locacao locacao : locacoes){
      if(locacao.getMatricula().equals(dados[0]) && locacao.getCodigoDoProduto().equals(dados[1])){
        locacoes.remove(locacao);
        System.out.println("Locação excluda!");
        return;
      }
    }
    System.out.println("Locação não encontrada!");
    return;
  }

  public void procurarCliente(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite a matricula do CLIENTE: ");
    Pessoa pessoa = pessoas.get(scanner.nextLine());
    if(pessoa instanceof Cliente){
      System.out.println(pessoa);
    }else{
      System.out.println("Nada foi encontrado.");
    }
  }
  public void procurarProduto(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite a codigo do PRODUTO: ");
    System.out.println(produtos.get(scanner.nextLine()));
  }
}