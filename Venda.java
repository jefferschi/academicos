
package atividadepoo;

// classe do tema escolhido (item 1)
//classe extendendo (herdando) a classe abstrata Movimento (item 8 herança)
public class Venda extends Movimento{
    
    //atributo específico (item 5)
    private final String cliente;

    //método construtor da subclasse heradando atributos da superclasse
    public Venda(String tipo, String produto, int qtd, Double preco, String cliente) {
        //método contrutor da superclasse
        super(tipo, produto, qtd, preco);       
        
        //atribuição da variável do parâmetro para o atributo da classe
        this.cliente = cliente;
    }
    
    
    // método sobrescrito (sobreposto) sem alteração (item 8 sobrescrita)
    // uso de polimorfismo (item 8 polimorfismo)
    @Override
    double cobranca(){
        return super.cobranca();
    }
 
    
    //método de mesma assinatura entre as subclasses mostrando o valor de atruibutos específico
    void mensagemVenda(){
        System.out.println("Caro(a) "+cliente+", agradecemos a preferencia!");
    }
}
