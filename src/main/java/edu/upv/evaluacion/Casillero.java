package edu.upv.evaluacion;

public class Casillero {
    private int idCasillero;
    private int claveCasillero;
    private String Disponibilidad;
    private int Tarifa;
    private String Tamano;
    private Paquete paqueteGuardado;

    public int getclaveCasillero() {
        return claveCasillero;
    }
    public String getDisponibilidad() {
        return Disponibilidad;
    }
    public int getTarifa() {
        return Tarifa;
    }
    public int getidCasillero() {
        return idCasillero;

    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        this.Tamano = tamano;
    }

    public void setclaveCasillero(int clavecasillero) {
        this.claveCasillero = clavecasillero;
    }
    public void setDisponibilidad(String disponibilidad) {
        this.Disponibilidad = disponibilidad;
    }
    public void setTarifa(int tarifa) {
        this.Tarifa = tarifa;
    }
    public void setidCasillero(int idCasillero) {
        this.idCasillero = idCasillero;
    }

    public Paquete getpaqueteGuardado() {
        return paqueteGuardado;
    }
}