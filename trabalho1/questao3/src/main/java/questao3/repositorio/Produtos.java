package questao3.repositorio;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

import questao3.produtos.BluRay;
import questao3.produtos.Cd;
import questao3.produtos.Dvd;
import questao3.produtos.Lp;
import questao3.produtos.Produto;
import questao3.produtos.Vhs;
public class Produtos{
  private HashMap<String, Produto> produtos;

  public Produtos() {
    this.produtos = new HashMap<String, Produto>();
  }

  public void addProduto(Produto produto){
    produtos.put(produto.getCodigo(), produto);
  }
  public void rmProduto(int code){
    produtos.remove(code);
  }
  public Produto getProduto(int code){
    return produtos.get(code);
  }
  public HashMap<String, Produto> getValues(){
    return produtos;
  }

  public void load(){
    try{    
      InputStream arcProdutos = new FileInputStream("src/main/java/questao3/src/produtos.csv");
      Scanner linha = new Scanner(arcProdutos);
      linha.nextLine();
      while(linha.hasNext()){
        String dado[] = linha.nextLine().split(",");
        if(dado[0].equals("musica")){
          if(dado[1].equals("lp")){
            Lp lp = new Lp(dado[2], dado[3], dado[4], dado[5], dado[6], dado[7], dado[8]);
            produtos.put(lp.getCodigo(), lp);
          }else if(dado[1].equals("cd")){
            Cd cd = new Cd(dado[2], dado[3], dado[4], dado[5], dado[6], dado[7], dado[8],dado[9]);
            produtos.put(cd.getCodigo(), cd);
          }
        }else if(dado[0].equals("filme")){
          if(dado[1].equals("dvd")){
            Dvd dvd = new Dvd(dado[2], dado[3], dado[4], dado[5], dado[6], dado[7], dado[8]);
            produtos.put(dvd.getCodigo(), dvd);
          }else if(dado[1].equals("bluray")){
            BluRay bluRay = new BluRay(dado[2], dado[3], dado[4], dado[5], dado[6], dado[7]);
            produtos.put(bluRay.getCodigo(), bluRay);
          }else if(dado[1].equals("vhs")){
            Vhs vhs = new Vhs(dado[2], dado[3], dado[4], dado[5], dado[6], dado[7], dado[8]);
            produtos.put(vhs.getCodigo(), vhs);
          }
        }
      }
      linha.close();
      arcProdutos.close();
    }catch(Exception e){}
  }
}