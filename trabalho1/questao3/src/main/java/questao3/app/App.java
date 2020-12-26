package questao3.app;

import java.util.*;

import questao3.repositorio.*;
import questao3.pessoas.*;

public class App {
  public static void main(String[] args) {
    //start
    Locacoes locacoes = new Locacoes();
    Pessoas pessoas = new Pessoas();
    Produtos produtos = new Produtos();
    //load
    try{
    pessoas.load(produtos.getValues(), locacoes.getValues());
    produtos.load();
    }catch(Exception e){}

    System.out.println(pessoas);
    Scanner scanner = new Scanner(System.in);

    /* INTERFACE */
    Locadora locadora = new Locadora();
    while (true) {
      System.out.print(locadora.menuBemVindo());
      String comando = scanner.nextLine();
      if (comando.equals("1")) {// Gerente
        System.out.println(locadora.login());
        Pessoa pessoa = validacao(pessoas.getValues().values());
        if (pessoa != null && pessoa instanceof Gerente) {
          while(true){
            System.out.println(locadora.menuGerente(pessoa.getNome()));
            comando = scanner.nextLine();
            if(comando.equals("1")){((Gerente)pessoa).addProduto();}
            else if(comando.equals("2")){((Gerente)pessoa).addCliente();}
            else if(comando.equals("3")){((Gerente)pessoa).addOperador(locacoes.getValues());}
            else if(comando.equals("4")){((Gerente)pessoa).listarProduto();}
            else if(comando.equals("5")){((Gerente)pessoa).listarCliente();}
            else if(comando.equals("6")){((Gerente)pessoa).listarOperadores();}
            else if(comando.equals("7")){((Gerente)pessoa).procurarProduto();}
            else if(comando.equals("8")){((Gerente)pessoa).procurarCliente();}
            else if(comando.equals("9")){((Gerente)pessoa).procurarOperadores();}
            else if(comando.equals("10")){System.out.println("Deslogado!"); break;}
          }
        }else{
          System.out.println(locadora.falhaLogin());
        }
      } else if (comando.equals("2")) {// Operador
        System.out.println(locadora.login());
        Pessoa pessoa = validacao(pessoas.getValues().values());
        if (pessoa != null && pessoa instanceof OperadorDeSistemas) {
          while(true){
            System.out.println(locadora.menuOperador(pessoa.getNome()));
            comando = scanner.nextLine();
            if(comando.equals("1")){((OperadorDeSistemas)pessoa).fazerLocação();}
            else if(comando.equals("2")){((OperadorDeSistemas)pessoa).darBaixa();}
            else if(comando.equals("3")){((OperadorDeSistemas)pessoa).excluirLocacao();}
            else if(comando.equals("4")){((OperadorDeSistemas)pessoa).procurarProduto();}
            else if(comando.equals("5")){((OperadorDeSistemas)pessoa).procurarCliente();}
            else if(comando.equals("6")){System.out.println("Deslogado!"); break;}
          }
        }
      } else if (comando.equals("3")) {// sair
        break;
      }

    }

    scanner.close();
  }

  public static Pessoa validacao(Collection<Pessoa> collection) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite seu login: ");
    String login = scanner.nextLine();
    System.out.print("Digite seu senha: ");
    String senha = scanner.nextLine();

    for (Pessoa pessoa : collection) {
      if (pessoa instanceof Funcionario) {
        if (((Funcionario)pessoa).getLogin().equals(login) && ((Funcionario)pessoa).getSenha().equals(senha)) {
          return pessoa;
        }
      }
    }
    return null;
  }
}
