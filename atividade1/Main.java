import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RevendaComArray revenda = new RevendaComArray(0);
        Scanner ler = new Scanner(System.in);
        while(true){
            String comando = ler.nextLine();
            String[] cmd = comando.split(" ");
            System.out.println("$"+ comando);
            if(cmd[0].equals("addProduto")){
                revenda.inserirProduto(new Produto(Integer.parseInt(cmd[1]), cmd[2], Double.parseDouble(cmd[3]), Double.parseDouble(cmd[4]), Double.parseDouble(cmd[5]), Integer.parseInt(cmd[6])));
            }
            else if(cmd[0].equals("comprar")){
                revenda.comprar(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
            }else if(cmd[0].equals("vender")){
                revenda.vender(Integer.parseInt(cmd[1]), Integer.parseInt(cmd[2]));
            }else if(cmd[0].equals("consulta")){
                revenda.consultaPrecoVenda(Integer.parseInt(cmd[1]));
            }else if(cmd[0].equals("listar")){
                revenda.listaPrecos();
            }else if(cmd[0].equals("AttValor")){
                revenda.getProduto(Integer.parseInt(cmd[1])).setValorCompra(Double.parseDouble(cmd[2]));
            }else if(cmd[0].equals("AttCusto")){
                revenda.getProduto(Integer.parseInt(cmd[1])).setCusto(Double.parseDouble(cmd[2]));
            }else if(cmd[0].equals("AttLucro")){
                revenda.getProduto(Integer.parseInt(cmd[1])).setMargemLucro(Double.parseDouble(cmd[2]));
            }else{
                break;
            }
        }
    }
}