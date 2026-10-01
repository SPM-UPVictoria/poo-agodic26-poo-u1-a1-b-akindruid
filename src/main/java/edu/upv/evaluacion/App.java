package edu.upv.evaluacion;


public class App 
{
    public static void main()
    {
        Casillero cas1 = new Casillero();
        Casillero cas2 = new Casillero();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete();

        cas1.setidCasillero(100);
        cas2.setidCasillero(101);
        String Ocupado = "Ocupado";
        String Libre = "Libre";
        cas1.setDisponibilidad(Ocupado);
        cas2.setDisponibilidad(Libre);
        cas1.setclaveCasillero(123);
        cas2.setclaveCasillero(321);
        cas1.setTarifa(20);
        cas2.setTarifa(30);




    }

}
