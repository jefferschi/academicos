
package atividadepoo;

//classe abstrata que servirá de superclasse para as demais herdarem (item 2)
public abstract class Movimento {
    
    // atributos genéricos encapsulados (item 4 e item 8) 
    private String tipo;
    private String produto;
    private int qtd;
    private Double preco;

    // método construtor
    public Movimento(String tipo, String produto, int qtd, Double preco){
        this.tipo = tipo;
        this.produto = produto;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    // polimorfismo - sobrecarga (overload) do método contrutor sem um parâmetro
    public Movimento(String produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
        this.tipo = "Bonificacao";
        this.preco = 0.0;
    }
    
    // método genérico, sobrescrito apenas em uma das subclasses
    void mostraInfo(){
        
        System.out.format("Venda %s de %s %s pelo preco de %s a unidade\n", tipo,qtd,produto,preco);
    }
    
    // método a ser herdado e sobrescrito(sobreposto)
    double cobranca(){
        return getQtd() * getPreco();
    }
    
    /* métodos de acesso getter e setter para os atributos de classe encapsulados
    (item 6)*/
    
     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

   
    
}
