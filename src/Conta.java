public class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta() {
        this.setNumero("");
        this.setSaldo(0);
        this.setTitular(null);
    }

    public Conta(String numero, Cliente titular) {
        this.setNumero(numero);
        this.setSaldo(0);
        this.setTitular(titular);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if(valor>0) {
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Valor a depositar: " + valor);
            this.setSaldo(getSaldo() + valor);
            System.out.println("Novo saldo: " + getSaldo());
        } else {
            System.out.println("Valor inválido! Digite um valor positivo.");
        }
    }

    public void sacar(double valor) {
        if(getSaldo()>=valor) {
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Valor a sacar: " + valor);
            this.setSaldo(getSaldo()-valor);
            System.out.println("Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Operação Cancelada!");
        }

    }
}
