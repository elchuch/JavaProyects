
package equipoFutbol;


public class Medico extends Persona {
    private String titulacion;
    private  int anosExperencia;

    public Medico(String titulacion, int anosExperencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperencia = anosExperencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperencia() {
        return anosExperencia;
    }
    @Override
    public void partidoFutbol(){
        System.out.println(" da asistencia a un jugador");
    }
    @Override
    public void entrenamiento(){
        System.out.println(" da terapias y asistencias medicas");
    }
    public void curarLesion(){
        System.out.println("cura lesion");
    }
}
