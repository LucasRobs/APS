package questao3.produtos;
import java.util.ArrayList;
import java.util.Scanner;

public class BluRay extends Filme{
  private ArrayList<String> idiomas = new ArrayList<String>();

  public BluRay(String codigo, String titulo, String genero, String locado, String anoLancamanto, String duracao) {
    super(codigo, titulo, genero, locado, anoLancamanto, duracao);
    Scanner scanner =  new Scanner(System.in);
    while (true) {
      System.out.println("Informe um idima ou saia com a palavra: sair");
      String idioma = scanner.nextLine();
      if(idioma.equals("sair")){
        scanner.close();
        return;
      }else
        idiomas.add(idioma);
    }
  }

  private String getIdiomas(){
    StringBuilder listaIdiomas = new StringBuilder();
    listaIdiomas.append("[");
    for(String idioma : idiomas){
      listaIdiomas.append(idioma+" ");
    }
    listaIdiomas.deleteCharAt(listaIdiomas.length());
    listaIdiomas.append("]");
    return listaIdiomas.toString();
  }

  public double calcularDiaria() {
    return 0;
    // a fazer
  }

  @Override
    public String toString() {
      return "{" +
        "codigo='" + getCodigo() + "'" +
        ", titulo='" + getTitulo() + "'" +
        ", genero='" + getGenero() + "'" +
        ", locado='" + isLocado() + "'" +
        ", anoLancamanto='" + getAnoLancamanto() + "'" +
        ", duracao='" + getDuracao() + "'" +
        ", idiomas='" + getIdiomas() + "'" +
        "}";
    }
}