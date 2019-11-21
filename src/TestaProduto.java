public class TestaProduto {
    public static void main(String [] args){
        Motor m1= new Motor("1111", "Motor V8","V8", 8000.00, 5000, 20000);
        Parafuso p1= new Parafuso("2222", "Parafuso Sextavado", "Sextavado", 2.50,  10.0, 2.0);
        
        System.out.println(m1.calcularPrecoFinal());
        System.out.println(m1.imprimirDados());
        
        System.out.println(p1.calcularPrecoFinal());
        System.out.println(p1.imprimirDados());
    }
}
