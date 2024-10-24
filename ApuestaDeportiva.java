
package PqUd8;

public class ApuestaDeportiva extends Apuesta
{
    //ATRIBUTO
    private String equipo;

    //CONSTRUCTOR
    public ApuestaDeportiva(int pImporte, String pEquipo) 
    {
        super(pImporte);
        this.equipo = pEquipo;
    }

    //GETTER
    public String getEquipo() 
    {
        return equipo;
    }
    
}