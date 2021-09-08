public class Main {

    public static void main(String[] args){

        // Testando a classe Conta()
        // Construtor sem parâmetros
        Conta novaConta = new Conta();
        novaConta.depositar(100);
        novaConta.sacar(80);

        //Construtor com parâmetros
        Cliente novoCliente1 = new Cliente("Eric", "Tomson");

        Conta novaConta1 = new Conta("123456",novoCliente1);
        novaConta1.depositar(100);
        novaConta1.sacar(80);

        Cliente novoCliente2 = new Cliente("Paty", "Miyazaki");

        Conta novaConta2 = new Conta("789101112",novoCliente2);
        novaConta2.depositar(9000);
        novaConta2.sacar(500);
    }
}
