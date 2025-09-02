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



    }

}