public class Locadora{
    public String menuBemVindo(){
        return 
        "****Bem-vindo, escolha um perfil abaixo:\n        1 – Gerente \n        2 – Operador de Sistema\n        3 – Sair\n        Digite a opção:_<ENTER>";
    }

    public String Login(){
      return 
      "****Faça seu Login**** \n      Digite seu login:_ <ENTER> \n      Digite sua senha:_ <ENTER>";
    }

    public String MenuGerente(){
        return("****Olá Gerente <Nome do Gerente>*****\n        1 – Cadastrar Produto\n        2 – Cadastrar Cliente\n        3 – Cadastrar Operador\n        4 – Listar Produtos\n        5 – Listar Clientes\n        6 – Listar Operadores\n        7 – Procurar Produto\n        8 – Procurar Cliente\n        9 – Procurar Operador\n        10 – Sair\n        Digite a opção:_<ENTER>");
    }

    public String MenuOperador() {
        return"****Olá Operador <Nome do Operador>****\n        1 – Fazer locação\n        2 – Dar baixa em locação\n        3 – Excluir locação\n        4 – Procurar Produto\n        5 – Procurar Cliente\n        6 – Sair\n        Digite a opção:_<ENTER>";
    }

}