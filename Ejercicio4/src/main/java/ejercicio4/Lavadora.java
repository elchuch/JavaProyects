
package ejercicio4;


public class Lavadora extends Electrodomestico {
    private static final double CARGA=5;
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lavadora{carga=").append(carga);
        sb.append('}');
        return sb.toString();
    }
   
    
   
    
}
