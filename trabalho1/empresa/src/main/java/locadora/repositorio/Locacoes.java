package repositorio;
import java.util.ArrayList;
import java.*;
class Locacoes{
  private ArrayList<Locacao> locacoes = new ArrayList<Locacao>();

  public void addLocacao(Locacao locacao){
    locacoes.add(locacao);
  }
  public void rmLocacao(Locacao locacao){
    locacoes.remove(locacao);
  }
  public Locacao getLocacao(int indice){
    return locacoes.get(indice);
  }
  public ArrayList getValues(){
    return locacoes;
  }
}