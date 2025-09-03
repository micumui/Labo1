public class Main
{
	public static void main(String[] args)
    {

    Cuenta nueva  = new Cuenta(123,"Belu");
    System.out.println(nueva);

    nueva.deposito(10);
    System.out.println(nueva);

    nueva.deposito(90);
    System.out.println(nueva);

    CajaDeAhorro nuevaAhorro = new CajaDeAhorro(134,"Agus",2);
    System.out.println(nuevaAhorro);
    nuevaAhorro.deposito(10);
    System.out.println(nuevaAhorro);
    nuevaAhorro.extracionCajaAhorro(5);
    System.out.println(nuevaAhorro);
    nuevaAhorro.deposito(5);

    System.out.println(nuevaAhorro.calculoInteres());
    System.out.println(nuevaAhorro.sumoInteres());
    System.out.println(nuevaAhorro);

    CuentaCorriente nuevCorriente = new CuentaCorriente(123,"Mica",1000);
    System.out.println("Deposite 100:");
    nuevCorriente.deposito(100);
    System.out.println(nuevCorriente);

    try
    {
      nuevCorriente.extracionCuentaCorriente(500);
    }
    catch (CuentaCorrienteException e)
    {
      System.out.println(e.getMessage());
    }
    System.out.println(nuevCorriente);

    try
    {
      nuevCorriente.extracionCuentaCorriente(700);
    }
    catch (CuentaCorrienteException e)
    {
      System.out.println(e.getMessage());
    }

    }

}