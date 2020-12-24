package trabalho1;
import java.util.ArrayList;
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
  public List getValues(){
    return locacoes;
  }
}