
/**
 * Escreva a descrição da classe Prontuario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Prontuario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Cliente cliente;
    private Data dataNascimento;
    private float peso;
    private float altura;
    
    public Prontuario()
    {
    }

    public Cliente getCliente()
    {
        return cliente;
    }
    
    public Data getDataNascimento()
    {
        return dataNascimento;
    }
    
    public float getPeso()
    {
        return peso;
    }
    
    public float getAltura()
    {
        return altura;
    }
    
    public void setCliente(Cliente c)
    {
        cliente = c;
    }
    
    public void setDataNascimento(Data d)
    {
        dataNascimento = d;
    }
    
    public void setPeso(float p)
    {
        peso = p;
    }
     
    public void setAltura(float a)
    {
        altura = a;
    }
    
    public float calcularImc()
    {
        return peso / (altura * altura);
    }
    
    public void preDiagnosticar()
    {
        float imc = calcularImc();
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade Morbida");
        }
    }
}
