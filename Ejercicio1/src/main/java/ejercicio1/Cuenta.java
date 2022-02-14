package ejercicio1;

public class Cuenta {

    private String titular;
    private double cantidad;
    // metodos constructores

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;

    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // metodos especiales
    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = this.cantidad + cantidad;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
      
    public void retirar(double cantidad) {
      if(this.cantidad-cantidad<0){
          this.cantidad=0;
      }else{
          this.cantidad=this.cantidad-cantidad;
      }
    }

}
