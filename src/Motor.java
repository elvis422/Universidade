
public class Motor extends Produto{
    
    private double potencia;
    private double rpm;

    public Motor(String c, String n, String desc, double p, double pot, double rpm) {
        super(c, n, desc, p);
        this.setPotencia (pot);
        this.setRpm (rpm);
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double pot) {
        this.potencia = pot;
    }

    public double getRpm() {
        return rpm;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    
    public double calcularPrecoFinal(){
        return getPreco() - (0.5 * getPreco());
    }
        
    public String imprimirDados(){
        String s = "Codigo: "+getCod()+" Nome: "+getNome()+" Descrição: "+getDescricao()+" Preço: "+getPreco()+"\nPontencia: "+getPotencia()+" RPM: "+getRpm();
        return s;
    }    
    
}
