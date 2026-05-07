package pe.com.utp.estructuras.listas;

import pe.com.utp.modelo.persona.Paciente;
import pe.com.utp.interfaces.TADListaPacientes;

// Implementación de lista enlazada simple para gestionar pacientes dinámicamente
public class ListaPacientes implements TADListaPacientes {

    // Primer nodo de la lista
    private Nodo inicio;

    // Constructor de la lista. Inicialmente la lista está vacía
    public ListaPacientes() {
        inicio = null;
    }

    // Inserta un nuevo paciente al final de la lista enlazada
    @Override
    public void insertarPaciente(Paciente paciente) {

        // Crea un nuevo nodo con el paciente recibido
        Nodo nuevoNodo = new Nodo(paciente);

        // Si la lista está vacía, el nuevo nodo se convierte en el inicio
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {

            // Nodo auxiliar utilizado para recorrer la lista
            Nodo actual = inicio;

            // Recorre la lista hasta llegar al último nodo
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            // Enlaza el último nodo con el nuevo nodo
            actual.setSiguiente(nuevoNodo);
        }

        System.out.println("Paciente insertado correctamente en la lista");
    }

    // Muestra todos los pacientes almacenados en la lista enlazada
    @Override
    public void mostrarPacientes() {

        // Verifica si la lista está vacía
        if (inicio == null) {
            System.out.println("La lista de pacientes está vacía");
            return;
        }
        System.out.println("===== LISTA ENLAZADA DE PACIENTES =====");

        // Nodo auxiliar utilizado para recorrer la lista
        Nodo actual = inicio;

        // Recorre nodo por nodo hasta llegar a null
        while (actual != null) {
            System.out.println();

            // Muestra los datos del paciente actual
            actual.getPaciente().mostrarDatos();

            // Avanza al siguiente nodo
            actual = actual.getSiguiente();
        }
    }

    // Busca un paciente mediante su DNI dentro de la lista enlazada
    @Override
    public Paciente buscarPacientePorDni(String dni) {

        // Nodo auxiliar para recorrer la lista
        Nodo actual = inicio;

        // Recorre nodo por nodo hasta encontrar coincidencia.

        while (actual != null) {

            // Compara el DNI ingresado con el DNI del paciente almacenado en el nodo actual
            if (actual.getPaciente().getDni().equals(dni)) {
                // Retorna el paciente encontrado
                return actual.getPaciente();
            }

            // Avanza al siguiente nodo
            actual = actual.getSiguiente();
        }

        // Retorna null si no existe coincidencia
        return null;
    }

    // Elimina un paciente de la lista enlazada mediante su DNI
    @Override
    public void eliminarPaciente(String dni) {

        // Verifica si la lista está vacía
        if (inicio == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Caso especial: el paciente a eliminar está en el inicio
        if (inicio.getPaciente().getDni().equals(dni)) {

            inicio = inicio.getSiguiente();

            System.out.println("Paciente eliminado correctamente");
            return;
        }

        // Nodos auxiliares para recorrer la lista
        Nodo actual = inicio;
        Nodo anterior = null;

        // Recorre la lista buscando el nodo a eliminar
        while (actual != null &&
                !actual.getPaciente().getDni().equals(dni)) {

            anterior = actual;
            actual = actual.getSiguiente();
        }

        // Verifica si el paciente fue encontrado
        if (actual == null) {
            System.out.println("Paciente no encontrado");
            return;
        }

        // Desconecta el nodo encontrado de la lista
        anterior.setSiguiente(actual.getSiguiente());

        System.out.println("Paciente eliminado correctamente");
    }
}