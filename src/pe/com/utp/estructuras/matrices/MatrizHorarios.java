package pe.com.utp.estructuras.matrices;

// Clase encargada de gestionar la matriz de citas médicas del sistema
public class MatrizHorarios {

    // Cantidad de doctores
    private static final int FILAS = 3;

    // Cantidad de días de atención
    private static final int COLUMNAS = 5;

    // Matriz bidimensional que almacena la cantidad de citas médicas

    private int[][] matrizCitas;

    // Constructor de la clase.
    // Inicializa la matriz en memoria.
    public MatrizHorarios() {
        matrizCitas = new int[FILAS][COLUMNAS];
    }

    // OJO: SOLO SON DATOS DE PRUEBAS
    // Carga datos iniciales en la matriz de citas. Cada valor representa la cantidad de citas por día
    public void cargarDatosIniciales() {

        matrizCitas[0][0] = 5;
        matrizCitas[0][1] = 3;
        matrizCitas[0][2] = 4;
        matrizCitas[0][3] = 2;
        matrizCitas[0][4] = 1;

        matrizCitas[1][0] = 6;
        matrizCitas[1][1] = 4;
        matrizCitas[1][2] = 5;
        matrizCitas[1][3] = 3;
        matrizCitas[1][4] = 2;

        matrizCitas[2][0] = 2;
        matrizCitas[2][1] = 5;
        matrizCitas[2][2] = 3;
        matrizCitas[2][3] = 4;
        matrizCitas[2][4] = 6;
    }

    // Muestra la matriz de citas médicas en forma de tabla
    public void mostrarMatriz() {
        System.out.println("===== MATRIZ DE CITAS MÉDICAS =====");

        // Recorre las filas de la matriz
        // Cada fila representa un doctor
        for (int i = 0; i < FILAS; i++) {

            // Recorre las columnas de la matriz
            // Cada columna representa un día
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matrizCitas[i][j] + "\t");
            }

            System.out.println();
        }
    }

    // Calcula el total de citas por doctor. La suma se realiza por filas
    public void mostrarTotalPorDoctor() {
        System.out.println("===== TOTAL DE CITAS POR DOCTOR =====");

        // Recorre cada fila de la matriz.
        for (int i = 0; i < FILAS; i++) {
            int suma = 0;

            // Recorre las columnas de la fila actual
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matrizCitas[i][j];
            }

            System.out.println("Doctor " + (i + 1) + ": " + suma + " citas");
        }
    }

    // Calcula el total de citas por día. La suma se realiza por columnas
    public void mostrarTotalPorDia() {
        System.out.println("===== TOTAL DE CITAS POR DÍA =====");

        // Recorre las columnas de la matriz
        for (int j = 0; j < COLUMNAS; j++) {
            int suma = 0;

            // Recorre las filas de la columna actual
            for (int i = 0; i < FILAS; i++) {
                suma += matrizCitas[i][j];
            }

            System.out.println("Día " + (j + 1) + ": " + suma + " citas");
        }
    }
}