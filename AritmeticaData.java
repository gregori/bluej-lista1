
/**
 * Escreva a descrição da classe AritmeticaData aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AritmeticaData
{
    /**
     * COnstrutor para objetos da classe AritmeticaData
     */
    public AritmeticaData()
    {
    }


    public int calculaDias(Data d1, Data d2)
    {
        // mes = 30 dias, ano = 365 dias
        // d1 > d2
        // dia/mes/ano  - dia/mes/ano
        // (dia + mes * 30 + ano * 365) - (dia + mes * 30 + ano * 365) 
        return d1.getDataEmDias() - d2.getDataEmDias();
    }
}
