
public class ProfHorista extends Professores{
    
    private double salhora;

    public ProfHorista(String n, double sh) {
        super(n);
        this.setSalhora (sh);
    }

    public double getSalhora() {
        return salhora;
    }

    public void setSalhora(double sh) {
        this.salhora = sh;
    }
    
    public double calcularSalarioLiquido(){
        
        return salhora - (salhora * 0.05);
    }
    
}
