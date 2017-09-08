
/**
 * Escreva a descrição da classe Data aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Data
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int dia;
    private int mes;
    private int ano;

    /**
     * COnstrutor para objetos da classe Data
     */
    public Data()
    {
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int getDia()
    {
        return dia;
    }
    
    public void setDia(int d)
    {
        dia = d;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public void setMes(int m)
    {
        mes = m;
    }
    
    public int getAno()
    {
        return ano;
    }
    
    public void setAno(int a)
    {
        ano = a;
    }
    
    public void imprimirData()
    {
        System.out.format("%02d/%02d/%04\n", dia, mes, ano);
    }
    
    public int getDataEmDias()
    {
        return dia + mes * 30 + ano * 365;
    }
    
    
    
}
