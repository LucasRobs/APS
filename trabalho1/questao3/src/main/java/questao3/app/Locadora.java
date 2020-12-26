package questao3.app;

public class Locadora{
    public String menuBemVindo(){
        return 
        "****Bem-vindo, escolha um perfil abaixo:\n"+
            "1 – Gerente \n"+
            "2 – Operador de Sistema\n"+
            "3 – Sair\n"+
            "Digite a opção: ";
    }

    public String login(){
      return 
      "****Faça seu Login****";
    }

    public String menuGerente(String nome){
        return("****Olá Gerente "+nome+"*****\n"+
                "1 – Cadastrar Produto\n"+
                "2 – Cadastrar Cliente\n"+
                "3 – Cadastrar Operador\n"+
                "4 – Listar Produtos\n"+
                "5 – Listar Clientes\n"+
                "6 – Listar Operadores\n"+
                "7 – Procurar Produto\n"+
                "8 – Procurar Cliente\n"+
                "9 – Procurar Operador\n"+
                "10 – Sair\n"+
                "Digite a opção: ");
    }

    public String menuOperador(String nome) {
        return"****Olá Operador "+ nome +"****\n"+
              "1 – Fazer locação\n"+
              "2 – Dar baixa em locação\n"+
              "3 – Excluir locação\n"+
              "4 – Procurar Produto\n"+
              "5 – Procurar Cliente\n"+
              "6 – Sair\n"+
              "Digite a opção: ";
    }

    public String falhaLogin() {
        return"****Falha no login!****\n";
    }
}