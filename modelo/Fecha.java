package modelo;

public class Fecha
{

    // -----------------------
    // ------ Atributos ------
    // -----------------------

    private int dia;
    private int mes;
    private int annio;

    public Fecha(int d,int m , int a)
    {
        this.dia = d;
        this.mes = m;
        this.annio = a;

    }
    public Fecha()
    {

    }
    // Constructor con parametro String dd/mm/aaaa
    /* 
    public Fecha(String s)
    {
        String[] fecha = s.split("/");
        this.dia = Integer.parseInt(fecha[0]);
        this.mes = Integer.parseInt(fecha[1]);
        this.annio = Integer.parseInt(fecha[2]);
    }
    */
    public Fecha(String s)
    {
        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');

        String sDia = s.substring(0,pos1);
        dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = s.substring(pos2+1);
        annio = Integer.parseInt(sAnio);

    }
    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAnnio()
    {
        return annio;
    }
    public void setAnnio(int annio) 
    {
        this.annio = annio;
    }
    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    public void setDia(int dia) 
    {
        this.dia = dia;
    }
    public String toString()
    {
        return "Fecha: " + dia + "/" + mes + "/" + annio;
    }
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (dia == otra.dia) && (mes == otra.mes) && (annio == otra.annio);
    }

    public void addDias(int d)
    {
        int sum = fechaTodias() + d;
        diasToFecha(sum);

    } 



    private int fechaTodias()
    {
        return annio*360 + mes*30 + dia ;
    }

    private void diasToFecha(int i)
    {
        annio = (int)(i/360);
        int residuo = (i%360);
        mes = (int) residuo/360;
        dia = residuo%360;
       
        if (dia == 0)
        {
            dia =30;
            mes--;
        }

        if (mes == 0)
        {
            
        }

    }
    






}

