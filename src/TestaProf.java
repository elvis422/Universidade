
public class TestaProf {
    public static void main(String[] args) {
        
        ProfIntegral pi1 = new ProfIntegral("Julio",3434.5);
        
        ProfHorista ph1 = new ProfHorista("Joao",3535.9);
       
        
        System.out.println (pi1.calcularSalarioLiquido());
        System.out.println (ph1.calcularSalarioLiquido());
    }
}
