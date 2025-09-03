public class CuentaCorrienteException extends Exception{
    public CuentaCorrienteException()
    {
        super();
    }
    public CuentaCorrienteException(String mensaje)
    {
        super(mensaje);
    }

    @Override
    public String toString() {
        return "Error: " +this.getClass().getName()+" "+this.getMessage();
    }

    
    
}
