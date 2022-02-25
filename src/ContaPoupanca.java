public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("\n=== Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
