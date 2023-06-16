interface Tributavel {
    double calcularTributos();
}
class ContaPoupanca implements Tributavel {
    @Override
    public double calcularTributos() {
        return 0; // Conta poupança não é tributável, retorna 0.
    }
}
class ContaCorrente implements Tributavel {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double calcularTributos() {
        return saldo * 0.01; // Calcula 1% do saldo da conta corrente como tributo.
    }
}
class SeguroDeVida implements Tributavel {
    private double valorSeguro = 42.0;

    @Override
    public double calcularTributos() {
        return valorSeguro; // Retorna o valor fixo de 42 reais como tributo do seguro de vida.

    }
}

 public class Exercicio02 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente(5000);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosContaPoupanca = contaPoupanca.calcularTributos();
        double tributosContaCorrente = contaCorrente.calcularTributos();
        double tributosSeguroDeVida = seguroDeVida.calcularTributos();

        System.out.println("Tributos da conta poupança: " + tributosContaPoupanca);
        System.out.println("Tributos da conta corrente: " + tributosContaCorrente);
        System.out.println("Tributos do seguro de vida: " + tributosSeguroDeVida);

    }


}
