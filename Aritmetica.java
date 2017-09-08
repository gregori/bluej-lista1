
/**
 * Escreva a descrição da classe Aritmetica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Aritmetica
{
    /**
     * COnstrutor para objetos da classe Aritmetica
     */
    public Aritmetica()
    {
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int somar(int a, int b)
    {
        return a + b;
    }
    
    public int subtrair (int a, int b)
    {
        return a - b;
    }
    
    public int multiplicar (int a, int b)
    {
        return a * b;
    }
    
    public float dividir (int a, int b)
    {
        return (a * 1.0f) / b;
    }
    
    public void testaInteiros(int a, int b) 
    {
        int soma = somar(a, b);
        int subtracao = subtrair(a, b);
        int multiplicacao = multiplicar(a, b);
        float divisao = dividir(a, b);
        System.out.println(a + " + " + b + " = " + soma);
        System.out.println(a + " - " + b + " = " + subtracao);
        System.out.println(a + " * " + b + " = " + multiplicacao);
        System.out.println(a + " / " + b + " = " + divisao);
    }
     
}
