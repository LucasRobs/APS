package trabalho1;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locacoes locacoes = new Locacoes();
    Pessoas  pessoas  = new Pessoas();
    Produtos produtos = new Produtos();
    
    Scanner scanner = new Scanner(System.in);

    /*INTERFACE*/
    Locadora locadora = new Locadora();
    while(true){
        String comando = scanner.nextLine();
        //String[] cmd = comando.split(" ");
        System.out.println(locadora.menuBemVindo());
        if(comando.equals("1")){//Gerente
          System.out.println(locadora.Login());
          if(validacao(pessoas.get)){
            System.out.println(locadora.MenuGerente());

          }
        }
        else if(comando.equals("2")){//Operador
            System.out.println(locadora.Login());
            if(validacao(pessoas.values())){
              System.out.println(locadora.MenuOperador());

          }
            
        }
        else if(comando.equals("3")){//sair
            break;
        }
        
    }
  }

  public Boolean validacao(List pessoas){
    Scanner scanner = Scanner(System.in);
    String login = scanner.nextLine();
    String senha = scanner.nextLine();
    for(Pessoa pessoa : pessoas){
      if(pessoa instanceof Funcionario){
        if(pessoa.getLogin().equals(login)  && pessoa.getSenha().equals(senha)){
          return true;
        }
      }
    }
    return false;
  }
}
