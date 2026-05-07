package pe.com.utp.estructuras.listas;

import pe.com.utp.modelo.persona.Paciente;

// Nodo utilizado en la lista enlazada de pacientes
// Cada nodo almacena un paciente y una referencia al siguiente nodo de la lista

public class Nodo {

    // Dato almacenado en el nodo
    private Paciente paciente;

    // Referencia al siguiente nodo
    private Nodo siguiente;

    // Constructor del nodo. Inicializa el paciente y el siguiente nodo.
    public Nodo(Paciente paciente) {
        this.paciente = paciente;
        this.siguiente = null;
    }

    // Métodos de acceso y modificación
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}