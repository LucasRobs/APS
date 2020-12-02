import java.util.*;
/*Exercicio 2
• Crie a classe "RevendaComArray" a qual deverá conter:
• Um atributo "produtos" (do tipo array de Produto), privado (utilize a classe Produto criada no exercício anterior);
• Um atributo privado para servir de índice.
• Um construtor que recebe como argumento a quantidade de produtos e inicializa o atributo "produtos" com um
array de produtos com o tamanho especificado;
• Um método "inserirProduto" que recebe como parâmetro um Produto e o insere no array;
• Um método "comprar" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
produto que foi adquirida pela revenda, percorre o array procurando o Produto e incrementa a quantidade em
estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro;
• Um método "vender" que recebe como parâmetro o código de um Produto e quantidade de unidades deste
produto que foi vendida pela revenda, percorre o array procurando o Produto e decrementa a quantidade em
estoque deste produto, caso ele não exista, o método deve imprimir uma mensagem de erro;
• Um método "consultaPrecoVenda" que recebe como parâmetro o código de um Produto, percorre o array
procurando o Produto e imprime o valor de venda deste produto, caso ele não exista, o método deve imprimir
uma mensagem de erro;
• Um método "listaPrecos" que imprime o código, a descrição e o valor de venda de todos os produtos;
• Elabore um programa que cria uma Revenda e oferece um menu com operações para criar produto, comprar, vender,
consultar preço, listar preco além de consultar e alterar os atributos valor de compra, custo e margem de lucro em um
determinado produto; */
public class RevendaComArray {
    private ArrayList<Produto> produtos; 
    private int indice;


    public RevendaComArray(int qtdProdutos) {
        this.produtos = new ArrayList<Produto>(qtdProdutos);
    }

    public void inserirProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void comprar(int codigo, int qtdProdutos){
        Boolean bandeira = true;
        for(Produto x : produtos){
            if(x.getCodigo() == codigo){
                bandeira = false;
                x.compra(qtdProdutos);
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto não existe!!!");
        }
    }

    public void vender(int codigo, int qtdProdutos){
        Boolean bandeira = true;
        for(Produto x : produtos){
            if(x.getCodigo() == codigo){
                bandeira = false;
                x.venda(qtdProdutos);
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto não existe!!!");
        }
    }
    public void consultaPrecoVenda(int codigo){
        Boolean bandeira = true;
        for(Produto x : produtos){
            if(x.getCodigo() == codigo){
                bandeira = false;
                System.out.println(x.getCusto());
            }
        }
        if(bandeira){
            System.out.println("Erro: Produto não existe!!!");
        }
    }
    public void listaPrecos(){
        for(Produto x : produtos){
            System.out.println(x.getCodigo() + " " + x.getDescricao() + " " + x.getCusto() + " " + x.getQtdEstoque());
        }
    }
    public Produto getProduto(int codigo){
        for(Produto x : produtos){
            if(x.getCodigo() == codigo){
                return x;
            }
        }
        System.out.println("Erro: Produto não existe!!!");
        return null;
    }
}