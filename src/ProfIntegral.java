
public class ProfIntegral extends Professores{
    
    private double salario;

    public ProfIntegral(String n, double s) {
        super(n);
        this.setSalario (s);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }
    
    public double calcularSalarioLiquido(){
        return salario - (salario *0.11);
    }
}
