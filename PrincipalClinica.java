
/**
 * Escreva a descrição da classe PrincipalClinica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class PrincipalClinica
{
    /**
     * COnstrutor para objetos da classe PrincipalClinica
     */
    public PrincipalClinica()
    {
    }

    public void testarClinica() 
    {
        Prontuario p1, p2;
        Cliente c1, c2;
        
        p1 = new Prontuario();
        p2 = new Prontuario();
        
        c1 = new Cliente();
        c2 = new Cliente();
        
        p1.setCliente(c1);
        p2.setCliente(c2);
        p1.setPeso(79);
        p1.setAltura(1.55f);
        p2.setPeso(44);
        p2.setAltura(1.70f);
        p1.preDiagnosticar();
        p2.preDiagnosticar();
        
    }
}
