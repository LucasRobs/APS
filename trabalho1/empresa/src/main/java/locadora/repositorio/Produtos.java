package repositorio;
import java.*;
import produtos.*;

import java.util.HashMap;
class Produtos{
  private HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();

  public void addProduto(Produto produto){
    produtos.put(produto.getCodigo(), produto);
  }
  public void rmProduto(int code){
    produtos.remove(code);
  }
  public Produto getProduto(int code){
    return produtos.get(code);
  }
  public List getValues(){
    return produtos.values();
  }
}