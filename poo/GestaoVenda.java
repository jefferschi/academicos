
package atividadepoo;


public class GestaoVenda {

 
    public static void main(String args[]) {
       
        //instanciando as classes
        Venda v1 = new Venda("A Vista","Notebook",2,3499.90,"Caetano");
        VendaPrazo vp1 = new VendaPrazo("A Prazo","Geladeira",1,1600.0,"Maria Ortiz",60);
        VendaPrazo vp2 = new VendaPrazo("A Prazo","Geladeira",1,1600.0,"Frida Calo",90);
        
        Bonificacao b1 = new Bonificacao("TV 45'",1,"Domingos Gomes");
                
        
        v1.mensagemVenda();
        v1.mostraInfo();
        System.out.println("O valor total a pagar e de "+v1.cobranca());
        
        System.out.println("----------------------------");
                
        vp1.mensagemVenda();
        vp1.mostraInfo();
        System.out.println("O valor total a pagar e de "+vp1.cobranca()+" com "+vp1.getPrazo()+" dias");
        
        System.out.println("----------------------------");
        
        vp2.mensagemVenda();
        vp2.mostraInfo();
        System.out.println("O valor total a pagar e de "+vp2.cobranca()+" com "+vp2.getPrazo()+" dias");
        
        System.out.println("----------------------------");
        
        b1.mensagemVenda();
        b1.mostraInfo();
        System.out.println("O valor total a pagar e de "+b1.cobranca());
        
        
    }
}
