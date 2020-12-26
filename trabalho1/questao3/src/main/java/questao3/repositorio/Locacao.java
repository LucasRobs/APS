package questao3.repositorio;

import java.time.LocalDate;
public class Locacao{
    private String codigoDoProduto;
    private String matricula;
    private LocalDate dataDeSaida;
    private LocalDate dataEntrega;


    public Locacao(String codigoDoProduto, String matricula, LocalDate dataDeSaida, LocalDate dataEntrega) {
        this.codigoDoProduto = codigoDoProduto;
        this.matricula = matricula;
        this.dataDeSaida = dataDeSaida;
        this.dataEntrega = dataEntrega;
    }

    public String getCodigoDoProduto() {
        return this.codigoDoProduto;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public LocalDate getDataDeSaida() {
        return this.dataDeSaida;
    }

    public LocalDate getDataEntrega() {
        return this.dataEntrega;
    }

}