public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("\n=== Conta Corrente ===");
        super.imprimirInfosComuns();

    }

}
