public class ContaCorrente extends ContaBancaria
{
    private double taxaDeOperacao;

    public ContaCorrente(double saldoInicial, double taxaDeOperacao)
    {
        super(saldoInicial);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void imprimirSaldo()
    {
        System.out.println("Saldo da conta corrente: " + this.saldo);
    }
}