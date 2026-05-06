package pe.com.utp.app;

import pe.com.utp.estructuras.matrices.MatrizHorarios;
import pe.com.utp.modelo.persona.Paciente;
import pe.com.utp.servicios.PacienteService;

/*
 * Clase principal del sistema.
 * Ejecuta pruebas iniciales del módulo de pacientes y matriz de citas.
 */
public class Main {

    public static void main(String[] args) {

        PacienteService pacienteService = new PacienteService();

        pacienteService.cargarPacientesIniciales();

        System.out.println("===== PACIENTES REGISTRADOS =====");
        pacienteService.mostrarPacientes();

        System.out.println("\n===== BÚSQUEDA DE PACIENTE =====");

        Paciente pacienteEncontrado = pacienteService.buscarPacientePorDni("45879632");

        if (pacienteEncontrado != null) {
            pacienteEncontrado.mostrarDatos();
        } else {
            System.out.println("Paciente no encontrado.");
        }

        System.out.println("\n===== ACTUALIZACIÓN DE PACIENTE =====");

        pacienteService.actualizarPaciente("73748381", "900111222", "nuevo_correo@correo.com");

        pacienteService.mostrarPacientes();

        System.out.println("\n===== ELIMINACIÓN DE PACIENTE =====");

        pacienteService.eliminarPaciente("74125896");

        pacienteService.mostrarPacientes();

        System.out.println("\n===== MATRIZ DE CITAS MÉDICAS =====");

        MatrizHorarios matrizHorarios = new MatrizHorarios();

        matrizHorarios.cargarDatosIniciales();
        matrizHorarios.mostrarMatriz();
        matrizHorarios.mostrarTotalPorDoctor();
        matrizHorarios.mostrarTotalPorDia();
    }
}