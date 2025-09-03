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

    //Tengo que corregir que si por ejemplo, yo quede en saldo -500 y quiero sacar 600 más, si podría sacar 500 y 100 no. PREGUNTAR!!!
    public double extracionCuentaCorriente(double quieroSacar) throws CuentaCorrienteException
    {

        if((getSaldo() - quieroSacar) >= -limiteParaSacar)
        {
            extracion(quieroSacar);
        }
        else
        {
            throw new CuentaCorrienteException("Usted está intentando extraer más del límite.");
        }
        return getSaldo();
    }

    public String toString()
    {
        return "Cuenta corriente --> " +super.toString();
    }




}
