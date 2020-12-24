package repositorio;
import pessoas.*;
import java.util.HashMap;
import java.*;
class Pessoas{
  private HashMap<Integer, Pessoa> pessoas = new HashMap<Integer, Pessoa>();
  
  public void addPessoa(Pessoa pessoa){
    pessoas.put(pessoa.getMatricula(), pessoa);
  }
  public void rmPessoa(int key){
    pessoas.remove(key);
  }
  public Pessoa getPessoa(int key){
    return pessoas.get(key);
  }

  public List getValues(int key){
    return pessoas.values();
  }
}