package ejercicio2;

public class Persona {
    public  final static int bajoPeso=-1;
    public final static int pesoCorrecto=0;
    public final static int sobrePeso=1;
    

    private String nombre;
    private int edad;
    private int dni;
    private char sexo = 'H';
    private double peso;
    private double altura;
    // constructores

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, int  dni, double peso, double altura) {
        this(nombre, edad, sexo);
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        
        if (imc < 20) {
            return bajoPeso;
        } else {
            if (imc >= 20 && imc <= 25) {
                return pesoCorrecto;
            } else {
                return sobrePeso;
            }
        }
       
    }

    public boolean esMayorDeEdad() {
        boolean valor = true;
        if (this.edad > 18) {
            valor = true;

        } else {
            valor = false;
        }
        return valor;
    }

    private void comprobarSexo(char sexo) {
        if (this.sexo != sexo) {
            this.sexo = sexo;

        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

}
