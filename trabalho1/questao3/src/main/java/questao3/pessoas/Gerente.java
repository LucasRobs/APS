package questao3.pessoas;

import questao3.produtos.*;
import questao3.repositorio.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Gerente extends Funcionario{
    private String endereco;
    private int idade;
    private String sexo;
    private HashMap<String, Pessoa> pessoas;
    private HashMap<String, Produto> produtos;

  public Gerente(String nome, String matricula, String login, String senha, String endereco, String idade, String sexo, HashMap<String,Pessoa> pessoas, HashMap<String,Produto> produtos) {
    this.endereco = endereco;
    this.idade = Integer.parseInt(idade);
    this.sexo = sexo;
    this.pessoas = pessoas;
    this.produtos = produtos;
    super.setLogin(login);
    super.setSenha(senha);
    super.setMatricula(matricula);
    super.setNome(nome);
    this.produtos = produtos;
    this.pessoas = pessoas;
  }

    public void addCliente() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Escreva os dados do CLIENTE nessa ordem(separeos com virgola): nome,matricula,endereco,idade,sexo");
      String dado[] = scanner.nextLine().split(",");
      Cliente cliente = new Cliente(dado[0], dado[1], dado[2], dado[3], dado[4]);
      pessoas.put(cliente.getMatricula(), cliente);
      System.out.println("Sucesso!");
    }
    public void addProduto(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o tipo: (musica, filme)");
      String tipo = scanner.nextLine();
      if(tipo.equals("musica")){
        System.out.println("Digite o sub tipo: (cd, lp)");
        String subtipo = scanner.nextLine();
        if(subtipo.equals("cd")){
          System.out.println("Escreva os dados do CD nessa ordem(separeos com virgola): codigo,titulo,genero,locado,autor,numFaixas,(<boolean> arranhado) (<boolean> duplo)");
          String dado[] = scanner.nextLine().split(",");
          Cd cd = new Cd(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6], dado[7]);
          produtos.put(cd.getCodigo(), cd);
        }else if(subtipo.equals("lp")){
          System.out.println("Escreva os dados do LP nessa ordem(separeos com virgola): codigo,titulo,genero,locado,autor,numFaixas,(<boolean> raro)");
          String dado[] = scanner.nextLine().split(",");
          Lp lp = new Lp(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6]);
          produtos.put(lp.getCodigo(), lp);
        }
      }else if(tipo.equals("filme")){
        System.out.println("Digite o sub tipo: (dvd, vhs, bluray)");
        String subtipo = scanner.nextLine();
        if(subtipo.equals("dvd")){
          System.out.println("Escreva os dados do DVD nessa ordem(separeos com virgola): codigo,titulo,genero,locado,anoLancamanto,duracao,(<boolean> arranhado)");
          String dado[] = scanner.nextLine().split(",");
          Dvd dvd = new Dvd(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6]);
          produtos.put(dvd.getCodigo(), dvd);
        }else if(subtipo.equals("vhs")){
          System.out.println("Escreva os dados do VHS nessa ordem(separeos com virgola): codigo,titulo,genero,locado,anoLancamanto,duracao,(<boolean> corres)");
          String dado[] = scanner.nextLine().split(",");
          Vhs vhs = new Vhs(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6]);
          produtos.put(vhs.getCodigo(), vhs);
        }else if(subtipo.equals("bluray")){
          System.out.println("Escreva os dados do BLURAY nessa ordem(separeos com virgola): codigo,titulo,genero,locado,anoLancamanto,duracao");
          String dado[] = scanner.nextLine().split(",");
          Vhs vhs = new Vhs(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6]);
          produtos.put(vhs.getCodigo(), vhs);
        }
      }
      System.out.println("Sucesso!");
    }
    public void addOperador(ArrayList<Locacao> locacoes){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Escreva os dados do OPERADOR nessa ordem(separeos com virgola): nome,matricula,login,senha");
      String dado[] = scanner.nextLine().split(",");
      OperadorDeSistemas operador = new OperadorDeSistemas(dado[0], dado[1], dado[2], dado[3], pessoas, produtos, locacoes);
      pessoas.put(operador.getMatricula(), operador);
      System.out.println("Sucesso!");
    }
    public void listarCliente(){
      StringBuilder litaClientes = new StringBuilder();
      for(Pessoa cliente : pessoas.values()){
        if(cliente instanceof Cliente){
          litaClientes.append("\n"+cliente);
        }
      }
      litaClientes.deleteCharAt(0);
      System.out.println(litaClientes.toString());
    }
    public void listarProduto(){
      StringBuilder litaProdutos = new StringBuilder();
      for(Produto produto : produtos.values()){
        litaProdutos.append("\n"+produto);
      }
      litaProdutos.append(" ");
      litaProdutos.deleteCharAt(0);
      System.out.println(litaProdutos.toString());
    }
    public void listarOperadores(){
      StringBuilder litaOperadores = new StringBuilder();
      for(Pessoa operador : pessoas.values()){
        if(operador instanceof OperadorDeSistemas){
          litaOperadores.append("\n"+operador);
        }
      }
      litaOperadores.deleteCharAt(0);
      System.out.println(litaOperadores.toString());
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
    public void procurarOperadores(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("digite a matricula do OPERARIO: ");
      Pessoa pessoa = pessoas.get(scanner.nextLine());
      if(pessoa instanceof OperadorDeSistemas){
        System.out.println(pessoa);
      }else{
        System.out.println("Nada foi encontrado.");
      }
    }


  public String getEndereco() {
    return this.endereco;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getSexo() {
    return this.sexo;
  }

}
