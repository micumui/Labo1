public class CajaDeAhorro extends Cuenta {
    
    private double interesMensual;

    public CajaDeAhorro()
    {
        super();
    }

    public CajaDeAhorro(int nroId, String titular, double interesMensual) {
        super(nroId, titular);
        this.interesMensual = interesMensual;
    }

    public double extracionCajaAhorro (double quieroSacar)
    {
        if(getSaldo() < 0)
        {
            System.out.println("No se puede realizar el movimiento.");  //Encapsular.
        }
        else
        {
            extracion(quieroSacar);
        }
        return getSaldo();
    }

    public double calculoInteres()
    {
        return (interesMensual * getSaldo())/100;
    }
    public double sumoInteres()
    {
        return getSaldo() + calculoInteres();
    }

    public String toString()
    {
        return "Caja de ahorro " +super.toString() + "Saldo con interes: [" +sumoInteres()+"]";
    }

}
