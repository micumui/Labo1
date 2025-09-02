public class Cuenta {
    
    private int nroId;

    private double saldo;

    private String titular;

    public Cuenta()
    {
        nroId = 0;
        saldo = 0;
        titular = "Nulo";
    }

    public Cuenta(int nroId, String  titular)
    {
        this.nroId = nroId;
        this.titular = titular;
    }

    public void deposito(double deposite)
    {
        if(saldo == 0)
        {
            saldo = deposite;
        }
        else
        {
            saldo += deposite;
        }
    }

    public void extracion(double quieroSacar)
    {
        saldo = saldo - quieroSacar;
    }

    public String getStringTitular()
    {
        return titular;
    }
    public int getNroId()
    {
        return nroId;
    }

    public double getSaldo()
    {
        return saldo;
    }


    @Override
    public String toString() {
        return "Número de identificación: [" + nroId + "] Saldo: [" + saldo + "] Titular: [" + titular + "]";
    }

}

