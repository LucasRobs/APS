package questao3.repositorio;

import questao3.pessoas.*;
import questao3.produtos.Produto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pessoas{
  private HashMap<String, Pessoa> pessoas;

  public Pessoas() {
    this.pessoas = new HashMap<String, Pessoa>();
  }
  
  public void addPessoa(Pessoa pessoa){
    pessoas.put(pessoa.getMatricula(), pessoa);
  }
  public void rmPessoa(String key){
    pessoas.remove(key);
  }
  public Pessoa getPessoa(String key){
    return pessoas.get(key);
  }

  public HashMap<String, Pessoa> getValues(){
    return pessoas;
  }

  public void load(HashMap<String,Produto> produtos, ArrayList<Locacao> locacoes) throws FileNotFoundException{
    try{    
      InputStream gerentes = new FileInputStream("src/main/java/questao3/src/gerentes.csv");
      Scanner linha = new Scanner(gerentes);
      linha.nextLine();
      while(linha.hasNext()){
        String dado[] = linha.nextLine().split(",");
        Gerente gerente = new Gerente(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6], this.pessoas, produtos);
        pessoas.put(gerente.getMatricula(), gerente);
      }
      linha.close();
      gerentes.close();
      
      InputStream operadores = new FileInputStream("src/main/java/questao3/src/operadores.csv");
      linha = new Scanner(operadores);
      linha.nextLine();
      while(linha.hasNext()){
        String dado[] = linha.nextLine().split(",");
        OperadorDeSistemas operador = new OperadorDeSistemas(dado[0], dado[1], dado[2], dado[3], this.pessoas, produtos, locacoes);
        pessoas.put(operador.getMatricula(), operador);
      }
      linha.close();
      operadores.close();

      InputStream clientes = new FileInputStream("src/main/java/questao3/src/clientes.csv");
      linha = new Scanner(clientes);
      linha.nextLine();
      while(linha.hasNext()){
        String dado[] = linha.nextLine().split(",");
        Cliente cliente= new Cliente(dado[0], dado[1], dado[2], dado[3], dado[4]);
        pessoas.put(cliente.getMatricula(), cliente);
      }
      linha.close();
    }catch(Exception e){}
  }


  @Override
  public String toString() {
    StringBuilder infoPessoas = new StringBuilder();
    for(Pessoa pessoa : pessoas.values()){
      infoPessoas.append(pessoa.getNome()+", ");
    }
    return infoPessoas.toString();
  }

}