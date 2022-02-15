package ejercicio2;

import java.util.Scanner;

public class Principal {

    public static void muestraSobrePeso(Persona p) {
        int tipo = p.calcularIMC();
        switch (tipo) {
            case Persona.bajoPeso:
                System.out.println("peso bajo");
                break;
            case Persona.pesoCorrecto:
                System.out.println("peso correcto");
                break;
            case Persona.sobrePeso:
                System.out.println("Ssobre peso");
                break;

        }
    }

    public static void main(String args[]) {
        Scanner entradaDatos = new Scanner(System.in);
        String nombre;
        int edad, dni;
        double peso, altura;
        char sexo;
        System.out.println("Ingresa nombre: ");
        nombre = entradaDatos.nextLine();
        System.out.println("Ingresa DNI: ");
        dni = entradaDatos.nextInt();
        System.out.println("Ingresa peso: ");
        peso = entradaDatos.nextDouble();
        System.out.println("Ingresa altura: ");
        altura = entradaDatos.nextDouble();
        System.out.println("Ingresa edad: ");
        edad = entradaDatos.nextInt();
        System.out.println("Ingresa sexo:  ");
        sexo = entradaDatos.next().charAt(0);
        Persona p1 = new Persona(nombre, edad, sexo,dni, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        p3.setNombre("Irma Vazquez");
        p3.setEdad(23);
        p3.setAltura(1.78);
        p3.setSexo('F');
        p3.setDni(4200);
        p3.setPeso(67.89);
        System.out.println("persona 1");
        System.out.println(p1);
        muestraSobrePeso(p1);
        System.out.println("Persona 2");
        System.out.println(p2);
        muestraSobrePeso(p2);
        System.out.println("persona 3");
        System.out.println(p3);

        muestraSobrePeso(p3);

    }
}
