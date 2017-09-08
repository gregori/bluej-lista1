
/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String endereco;
    private String telefone;
    private long rg;
    private long cpf;

    /**
     * COnstrutor para objetos da classe Cliente
     */
    public Cliente()
    {
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getEndereco()
    {
        return endereco;
    }
    
    public String getTelefone()
    {
        return telefone;
    }
    
    public long getRg()
    {
        return rg;
    }
    
    public long getCpf()
    {
        return cpf;
    }
    
    public void setNome(String novoNome) 
    {
        nome = novoNome;
    }
    
    public void setEndereco(String novoEndereco) 
    {
        endereco = novoEndereco;
    }
    
    public void setTelefone(String novoTelefone) 
    {
        telefone = novoTelefone;
    }
    
    public void setRg(long novoRg)
    {
        rg = novoRg;
    }
    
    public void setCpf(long novoCpf)
    {
        cpf = novoCpf;
    }
    
    public void imprimir()
    {
        System.out.println("Cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
    }
}
