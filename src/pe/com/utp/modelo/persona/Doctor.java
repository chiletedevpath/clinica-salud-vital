package pe.com.utp.modelo.persona;

/*
 * Clase hija de Persona.
 * Representa a los doctores registrados en la clinica.
 */
public class Doctor extends Persona {

    // Atributos especificos del doctor
    private String especialidad;
    private String horario;

    /*
     * Constructor de la clase Doctor.
     * Inicializa atributos heredados y propios.
     */
    public Doctor(String codigo, String dni, String nombres, String apellidos, String telefono, String correo, String especialidad, String horario) {
        super(codigo, dni, nombres, apellidos, telefono, correo);
        this.especialidad = especialidad;
        this.horario = horario;
    }

    /*
     * Implementacion del metodo abstracto heredado.
     * Permite mostrar informacion especifica del doctor.
     */
    @Override
    public void mostrarDatos() {
        System.out.println("----- DATOS DEL DOCTOR -----");
        System.out.println("Código: " + getCodigo());
        System.out.println("DNI: " + getDni());
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Horario: " + horario);
    }

    // Metodos de acceso y modificacion de atributos
    public String getEspecialidad() {
        return especialidad;
    }

    public String getHorario() {
        return horario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}