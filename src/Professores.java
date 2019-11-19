
public abstract class Professores {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public Professores(String n) {
        this.setNome (n);
    }
    
    public abstract double calcularSalarioLiquido();
    
}
