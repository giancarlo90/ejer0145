
/**
 * Write a description of class FechaYHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minutos;

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        dia = 01;
        mes = 01;
        ano = 01;
        hora = 0;
        minutos = 0;
    }
    
    /**
     * Metodo para obtener la fecha y la hora
     */
    public String getFechaYHora()
    {
        String fechaADevolver;
        String parte1 = dia + "";
        String parte2 = mes + "";
        String parte3 = ano + "";
        String parte4 = hora + "";
        String parte5 = minutos + "";
        if (parte1.length() < 2) {
            parte1 = "0" + parte1;   
        }
        if (mes < 10) {
            parte2 = "0" + parte2;    
        }
        if (parte3.length() < 2) {
            parte3 = "0" + parte3;
        }
        if (parte4.length() < 2) {
            parte4 = "0" + parte4;
        }
        if (parte5.length() < 2) {
            parte5 = "0" + parte5;
        }
        fechaADevolver = parte1 + "-" + parte2 + "-" + parte3 + " " + parte4 + ":" + parte5;
        return fechaADevolver;
    }
    
        /**
     * Metodo para fijar una fecha
     */
    public void fijarFechaYHora ( int nuevoDia, int nuevoMes, int nuevoAno, int nuevaHora, int nuevosMinutos)
    {
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
        hora = nuevaHora;
        minutos = nuevosMinutos;
    }
    
}
