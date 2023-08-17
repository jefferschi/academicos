
package atividadepoo;

// classe herdando superclasse e o método construtor de overload (sobrecarga)
public class Bonificacao extends Movimento {
    
    //atributo específico
    private final String cliente;
    
    public Bonificacao(String produto, int qtd, String cliente){
        super(produto, qtd);
        
        this.cliente = cliente;
    }
    
    // método sobrescrito (sobreposto) sem alteração (item 8 sobrescrita)
    // uso de polimorfismo (item 8 polimorfismo)
    @Override
    double cobranca(){
        return super.cobranca();
    }
    
    //método de mesma assinatura entre as subclasses
    void mensagemVenda(){
        System.out.println("Caro(a) "+cliente+", agradecemos a preferencia!");
    }
    
    @Override
    void mostraInfo(){
        System.out.format("%s de um %s \n",getTipo(),getProduto());
    }
}
