package Tp7;

public class App {

    public static void main(String[] args) {

        // dimensiones inválidas
        try {
            System.out.println("Creando matriz con dimensiones negativas...");
            MatrizObjetos m1 = new MatrizObjetos(-5, 3);
        } catch (MatrizException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // filas fuera de rango
        try {
            System.out.println("\nInsertando fuera de rango de filas...");
            MatrizObjetos m2 = new MatrizObjetos(3, 2);
            m2.setRowCol(10, 0, "Hola");
        } catch (MatrizException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // columnas fuera de rango
        try {
            System.out.println("\nObteniendo columna inexistente...");
            MatrizObjetos m3 = new MatrizObjetos(3, 3);
            m3.setRowCol(0, 0, "Dato");
            Object obj = m3.getRowCol(0, 5);
        } catch (MatrizException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // uso correcto
        try {
            System.out.println("\nUsando matriz correctamente...");
            MatrizObjetos m4 = new MatrizObjetos(2, 2);
            m4.setRowCol(0, 0, "Texto");
            m4.setRowCol(1, 0, 123);
            System.out.println("Contenido matriz: " + m4.toString());
        } catch (MatrizException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

