package pe.com.utp.modelo.persona;

/*
 * Clase hija de Persona.
 * Representa a los pacientes registrados en la clinica.
 */
public class Paciente extends Persona {

    // Atributos especificos del paciente
    private int edad;
    private String diagnostico;

    /*
     * Constructor de la clase Paciente.
     * Utiliza super() para inicializar los atributos heredados.
     */
    public Paciente(String codigo, String dni, String nombres, String apellidos, String telefono, String correo, int edad, String diagnostico) {
        super(codigo, dni, nombres, apellidos, telefono, correo);
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    /*
     * Sobrescritura del metodo abstracto heredado de Persona.
     * Cada tipo de persona mostrará información diferente.
     */
    @Override
    public void mostrarDatos() {
        System.out.println("----- DATOS DEL PACIENTE -----");
        System.out.println("Código: " + getCodigo());
        System.out.println("DNI: " + getDni());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Edad: " + edad);
        System.out.println("Diagnóstico: " + diagnostico);
    }

    // Metodos de acceso y modificacion de atributos
    public int getEdad() {
        return edad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}