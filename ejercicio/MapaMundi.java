package ejercicio;


import java.util.Scanner;
// creamos la clase MapaMundi que va a tener un método main para llamar los métodos e imprimir en pantalla los resultados

// • Tenga un método getPaises que reciba como parámetro un String con el nombre del Continente y devuelva un Set de Países 

public class MapaMundi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MapaMundial mapa = new MapaMundial();

        while (true) {
            System.out.println("\n1. Listar países de un continente");
            System.out.println("2. Listar provincias de un país");
            System.out.println("3. Mostrar países ordenados por superficie");
            System.out.println("4. Comparar superficie entre dos países");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt(); // lee un número entero desde el teclado
            scanner.nextLine(); // Limpiar buffer (Esta línea consume ese salto de línea sobrante y deja el buffer limpio, para que la próxima entrada de texto (nextLine()) funcione correctamente.

            switch (opcion) { //utilizamos un segun para resolverlo
                case 1:
                    System.out.print("Ingrese nombre del continente: ");
                    String cont = scanner.nextLine(); // (tipo de dato) (variable 'cont')(asignacion '=')y (scanner.netLine())--> que es para que el usuario pueda ingresar el contienente y lo guarde en cont
                    mapa.getPaises(cont).forEach(System.out::println);
                    //→ Llama al método getPaises(cont) del objeto mapa, que devuelve un Set<Pais> (conjunto de países del continente ingresado),
                    // → Luego recorre ese conjunto y muestra en pantalla cada país usando System.out.println().
                    break;
                case 2:
                    System.out.print("Ingrese nombre del país: ");
                    String pais = scanner.nextLine();
                    mapa.getProvincias(pais).forEach(System.out::println);
                    break;
                case 3:
                    mapa.getPaisesOrdenadosPorSuperficie().forEach(System.out::println);
                    break;
                case 4:
                    System.out.print("Primer país: "); //hacemos el calculo directamente aca 
                    String p1 = scanner.nextLine();
                    System.out.print("Segundo país: ");
                    String p2 = scanner.nextLine();
                    Pais mayor = mapa.compararSuperficie(p1, p2);
                    System.out.println("El país con mayor superficie es: " + (mayor != null ? mayor : "No encontrado"));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    scanner.close(); //siempre debemos  de cerrar el scanner
                    return;
                default:
                    System.out.println("Opción inválida");
            }
           
        }
    }
}



//      La clase MapaMundi contiene el método main, que es el punto de entrada del programa.
//      Su objetivo es permitir la interacción del usuario con el mapa del mundo a través de un menú por consola.
//          Al ejecutarse, el programa:

//    1. Crea un objeto MapaMundial, que contiene los continentes, países y provincias cargados previamente.

//    2.Muestra un menú con 4 opciones:

//        - Listar los países de un continente ingresado.
//        - Listar las provincias de un país ingresado.
//        - Mostrar los países ordenados por superficie (de mayor a menor).
//        - Comparar dos países y mostrar cuál es más grande en superficie.

//    3.Utiliza un switch para manejar las acciones según la opción elegida por el usuario.

//    4.Pide datos por teclado con Scanner y ejecuta métodos correspondientes sobre el objeto mapa.

//    5.La opción 0 permite salir del programa.
