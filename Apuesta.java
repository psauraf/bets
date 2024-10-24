
package PqUd8;

public class Apuesta 
{
    //ATRIBUTOS
    protected int importe;
    protected int premio;
    
    //CONSTRUTOR
    public Apuesta(int pImporte) 
    {
        this.importe = pImporte;
        this.premio = 0;
    }

    //GETTERS & SETTERS
    public int getImporte() 
    {
        return this.importe;
    }

    public int getPremio() 
    {
        return this.premio;
    }

    public void setPremio(int pPremio) 
    {
        this.premio = pPremio;
    }
    
}