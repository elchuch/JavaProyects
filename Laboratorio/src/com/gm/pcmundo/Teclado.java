
package com.gm.pcmundo;


public class Teclado extends DispositivosEntrada {
    private final int idTeclado;
    private static int contadoteclados;

    public Teclado( String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadoteclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
}
