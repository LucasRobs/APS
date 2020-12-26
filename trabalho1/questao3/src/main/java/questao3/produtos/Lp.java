package questao3.produtos;
public class Lp extends Musica{
    private boolean raro;

    public Lp(String codigo, String titulo, String genero, String locado, String autor, String numFaixas, String raro) {
        super(codigo, titulo, genero, locado, autor, numFaixas);
        this.raro = Boolean.getBoolean(raro);
    }
    
    public boolean isRaro() {
        return this.raro;
    }

    @Override
    public String toString() {
      return "{" +
        "codigo='" + getCodigo() + "'" +
        ", titulo='" + getTitulo() + "'" +
        ", genero='" + getGenero() + "'" +
        ", locado='" + isLocado() + "'" +
        ", autor='" + getAutor() + "'" +
        ", numFaixas='" + getNumFaixas() + "'" +
        ", raro='" + isRaro() + "'" +
        "}";
    }
}