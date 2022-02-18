package ejercicio4;

public class Electrodomestico {
   enum colores{
       A,B,C,E;
   }
    // constantes
    private static final String COLOR = "blanco";
    private static final char CONSUMOENERGETICO = 'F';
    private static final double PRECIOBASE = 100;
    private static final double PESO = 5;
    //Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    // constructores

    public Electrodomestico() {
    this(PRECIOBASE,COLOR,CONSUMOENERGETICO,PESO);
    }

    public Electrodomestico(double precioBase, double peso) {
       
        this.precioBase = precioBase;
        this.peso = peso;
        //this(COLOR,CONSUMOENERGETICO);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);

    }
    // metodo get

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico) {

        if (this.precioBase >= 30 || this.precioBase < 100) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = Electrodomestico.CONSUMOENERGETICO;
        }

    }

    private void comprobarColor(String color) {
        String colores;
        if (color == "negro") {
            this.color = color;

        } else if (color == "rojo") {
            this.color = color;

        } else if (color == "azul") {
            this.color = color;
        } else if (color == "gris") {
            this.color = color;
        } else {
            this.color = Electrodomestico.COLOR;

        }
 
    }
    public void precioFinal(){
        
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
}
