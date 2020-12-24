 /*Um Gerente deve ter as seguintes ações:
– Adicionar um Cliente
– Adicionar um Produto qualquer
– Adicionar um Operador
– Listar os Clientes, Produtos e Operadores
– Procurar Cliente, Produtos e Operadores por matricula ou código  */

public class Gerente extends Funcionario{
    private String endereco;
    private int idade;
    private char sexo;
    private Pessoas pessoas;
    private Produtos produtos;

    public Gerente(Pessoas repPessoas, Produtos repProdutos){
      pessoas = repPessoas;
      produtos = repProdutos;
    }

    public void addCliente(){

    }
    public void addProduto(Produto produto){
    }
    public void addOperador(){

    }
    public void listarCliente(){

    }
    public void listarProduto(){
        
    }
    public void listarOperadores(){
        
    }
    public void procurarCliente(){

    }
    public void procurarProduto(){
        
    }
    public void procurarOperadores(){
        
    }
}
