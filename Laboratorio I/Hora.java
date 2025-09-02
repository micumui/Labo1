public class Hora {

    private int horas;

    private int minutos;

    private int segundos;

    public Hora ()
    {
        horas = 0;

        minutos = 0;

        segundos = 0;


    }

    public Hora (int horas, int minutos, int segundos)
    {
        this.horas = horas;

        this.minutos = minutos;

        this.segundos = segundos;

    }

    public void setHora (int h)
    {
        if(h>0 && h<23)
        {
            horas = h;
        }
        else
        {
            horas = 0;
        }

    }
    public int getHora ()
    {
        return horas;
    }    
    public void setMinutos(int m)
    {
        if(m>0 && m<59)
        {
            minutos = m;
        }
        else
        {
            minutos = 0;
        }
    }
    public int getMinutos()
    {
        return minutos;
    }
    public void setSegundos(int s)
    {
        if(s>0 && s<59)
        {
            segundos = s;
        }
        else
        {
            segundos = 0;
        }
    }
    public int getSegundos()
    {
        return segundos;
    }

    public String toString()  //Para que no me muestre la dirección de memoria en el main. 
    {
        return horas+":"+minutos+":"+segundos;

    }

    public int sumarMinutos(int sumo)
    {

        

    }






    
}
