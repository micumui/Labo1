public class CuentaCorriente extends Cuenta  {
    
    public double limiteParaSacar;
    public double quieroSacar;

    public CuentaCorriente()
    {
        super();
    }

    public CuentaCorriente(int nroId, String titular, double limiteParaSacar) 
    {
        super(nroId, titular);
        this.limiteParaSacar = limiteParaSacar;
    }

    public double extracionCuentaCorriente(double quieroSacar, double limiteParaSacar)
    {
        if(getSaldo() < 0)
        {
            if(limiteParaSacar < quieroSacar)
            {
                System.out.println("No se puede realizar la extracción.");  //Encapsular.
            }
        }
        else
        {
            extracion(quieroSacar);
        }
        return getSaldo();
    }

    public String toString()
    {
        return "Cuenta corriente --> " +super.toString()+" Saldo luego de extracción: " +extracionCuentaCorriente(quieroSacar, limiteParaSacar);
    



}
