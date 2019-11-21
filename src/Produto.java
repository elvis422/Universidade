
public abstract class Produto {
    
    private String cod;
    private String nome;
    private String descricao;
    private double preco;

    public Produto(String c, String n, String desc, double p) {
        this.setCod (c);
        this.setNome (n);
        this.setDescricao (desc);
        this.setPreco (p);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String c) {
        this.cod = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desc) {
        this.descricao = desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double p) {
        this.preco = p;
    }
    
    public abstract double calcularPrecoFinal();
    
    public abstract String imprimirDados();
}
