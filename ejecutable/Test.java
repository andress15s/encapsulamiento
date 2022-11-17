package ejecutable;

import modelo.Fecha;

public class Test 
{
    public static void main(String[] args) 
    {

        Fecha f = new Fecha(2,10,1970);

        Fecha f2 = new Fecha(20,10,2022);

        f2.setDia(03);
        f2.setMes(11);
        f2.setAnnio(1999);

        Fecha f3 = new Fecha("20/10/2022");
        Fecha f4 = new Fecha();
        Fecha f5 = f3;

        
        System.out.println("Dia: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Año: " + f.getAnnio());
        System.out.println(f.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());
        System.out.println(f5.toString());


        if(f.equals(f2))
        {
            System.out.println("Las fechas son iguales");
        }
        else
        {
            System.out.println("Las fechas son diferentes");
        }
        System.out.println(f.equals(f2));
    }    
}