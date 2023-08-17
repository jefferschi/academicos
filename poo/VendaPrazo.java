
package atividadepoo;

// outra subclasse (além da classe do tema) para herdar a superclasse (item 3 e item 8 herança)
public class VendaPrazo extends Movimento {
    //atributo específico
    private final String cliente;
    private final int prazo;
    
    public VendaPrazo(String tipo, String produto, int qtd, Double preco, String cliente, int prazo){
        super(tipo, produto, qtd, preco);    
        
        //atribuição da variável do parâmetro para o atributo da classe
        this.cliente = cliente;
        this.prazo = prazo;
    }
    
    // método sobreposto com acréscimo de 5% sobre o valor total da venda (item 8 sobrescrita)
    // uso de polimorfismo (item 8 polimorfismo)
    // estrutura de repetição (item 7)
    @Override
    double cobranca(){
        double taxa1 = 1.05;
        double taxa2 = 1.08;
        double precoFinal;
        
        if (prazo >= 90){
            precoFinal = taxa2*(getQtd()*getPreco());
        }
        else {
            precoFinal = taxa1*(getQtd()*getPreco());  
        }
        return precoFinal;
    }
    
    //método de mesma assinatura entre as subclasses
    void mensagemVenda(){
        System.out.println("Caro(a) "+cliente+", agradecemos a preferencia!");
    }
    
    
    // método getter para acessar prazo na classe principal
    public int getPrazo() {
        return prazo;
    }


}
