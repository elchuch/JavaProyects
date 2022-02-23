
package com.gm.pcmundo;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclador;// relacion de agregacion
    private Raton raton;
    private static int contadorComputadora;
    private Computadora(){
        this.idComputadora=++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclador, Raton raton) {
         this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclador = teclador;
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclador() {
        return teclador;
    }

    public void setTeclador(Teclado teclador) {
        this.teclador = teclador;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

   
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclador=" + teclador + ", raton=" + raton + '}';
    }
    
}
