
/**
 * Escreva a descrição da classe ContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ContaBancaria
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int conta;
    private int agencia;
    private float saldo;
    private Cliente correntista;

    /**
     * COnstrutor para objetos da classe ContaBancaria
     */
    public ContaBancaria(int novaConta, int novaAgencia, float novoSaldo)
    {
        conta = novaConta;
        agencia = novaAgencia;
        saldo = novoSaldo;
    }

    public int getConta()
    {
        return conta;
    }
    
    public void setConta(int novaConta)
    {
        conta = novaConta;
    }
    
    public int getAgencia()
    {
        return agencia;
    }
    
    public void setAgencia(int novaAgencia)
    {
        agencia = novaAgencia;
    }
    
    public void sacar(float valor)
    {
        saldo = saldo - valor;
        // saldo -= valor;
    }
    
    public void depositar(float valor)
    {
        saldo = saldo + valor;
        // saldo += valor;
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public Cliente getCorrentista()
    {
        return correntista;
    }
    
    public void setCorrentista(Cliente cliente)
    {
        correntista = cliente;
    }
    
}
