package equipoFutbol;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    

    public  void viajar() {
        System.out.println(" todos podemos viajar");
    }

    public abstract void partidoFutbol();// metodo abstracto,pues quien lo utiliza a su manera

    public abstract void entrenamiento();

}
