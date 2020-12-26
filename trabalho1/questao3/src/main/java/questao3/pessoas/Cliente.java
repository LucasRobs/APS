package questao3.pessoas;

public class Cliente extends Pessoa {
    private String endereco;
    private int idade;
    private String sexo;

    public Cliente(String nome, String matricula, String endereco, String idade, String sexo) {
        this.endereco = endereco;
        this.idade = Integer.parseInt(idade);
        this.sexo = sexo;
        super.setMatricula(matricula);
        super.setNome(nome);
    }

    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            ", nome='" + getNome()+ "'" +
            ", endereco='" + endereco + "'" +
            ", idade='" + idade + "'" +
            ", sexo='" + sexo + "'" +
            "}";
    }
}
