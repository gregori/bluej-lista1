
/**
 * Escreva a descrição da classe Banco aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Banco
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio

    /**
     * COnstrutor para objetos da classe Banco
     */
    public Banco()
    {
    }

    public void cadastra()
    {
        Cliente cliente1, cliente2;
        ContaBancaria conta1, conta2, conta3;
        
        cliente1 = new Cliente();
        cliente1.setNome("Ricardo");
        cliente2 = new Cliente();
        cliente2.setNome("Joao");
        
        conta1 = new ContaBancaria(1234,12,100);
        conta2 = new ContaBancaria(4321,10,2000);
        conta3 = new ContaBancaria(1111,1234,200);
        
        conta1.depositar(200);
        conta1.sacar(150);
        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
    }
}
