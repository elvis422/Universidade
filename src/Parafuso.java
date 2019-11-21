
public class Parafuso extends Produto{
    
    private double comprimento;
    private double diametro;
    
    public Parafuso (String c, String n,String desc, double p, double comp, double dia){
        super(c,n,desc,p);
        this.setComprimento(comp);
        this.setDiametro(dia);
    }
    
    public double calcularPrecoFinal(){
        return getPreco() - (0.15*getPreco());
    }
    
    public String imprimirDados(){
        String p = "Código: "+getCod()+ "Nome: "+getNome()+"Descrição: "+getDescricao()+"Valor: "+getPreco()+"Comprimento: "+getComprimento()+"Diâmetro: "+getDiametro();
        return p;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setComprimento(double comp) {
        this.comprimento = comp;
    }

    public void setDiametro(double dia) {
        this.diametro = dia;
    }
    
    
}