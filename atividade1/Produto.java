/*Exercício 1
• Implemente uma classe Produto
• atributos:
• código: código do produto (private int)
• descrição: descrição do produto (private String)
• valor de compra (private double)
• custo: custo para armazenar e/ou beneficiar o produto (private double)
• margem de lucro: margem de lucro desejada, utilizado para calcular o preço de venda do produto,
(private double)
• quantidade em estoque: quantidade de unidades do produto em estoque (private int)

• métodos:
• void compra(int quant){qtd_estoque = qtd_estoque + quant;}
• void venda(int quant){qtd_estoque = qtd_estoque - quant;}
• double calculaPrecoVenda( ){returrn vl_compra + custo + margem_lucro*(vl_compra + custo) }
• crie métodos getAtributo e setAtributo para os atributos: valor de compra, custo e margem de lucro
• crie um construtor para inicializar o valor dos atributos: código e descrição
• crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo e
margem de lucro
• crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo,
margem de lucro e quantidade em estoque*/
public class Produto{
    private int codigo;
    private String descricao;
    private double valorCompra;
    private double custo;
    private double margemLucro;
    private int qtdEstoque;



    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        
    }
    public Produto(int codigo, String descricao, double valorCompra, double custo, double margemLucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
        
    }
    public Produto(int codigo, String descricao, double valorCompra, double custo, double margemLucro, int qtdEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
        this.qtdEstoque = qtdEstoque;
    }

    public void compra(int qtd){
        qtdEstoque += qtd;
    }
    public void venda(int qtd){
        qtdEstoque -= qtd;
    }
    public double calculaPrecoVenda( ){
        return valorCompra + custo + margemLucro*(valorCompra + custo);
    }


    public double getValorCompra() {
        return this.valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargemLucro() {
        return this.margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getQtdEstoque() {
        return this.qtdEstoque;
    }


}