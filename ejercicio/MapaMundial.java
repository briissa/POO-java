package ejercicio;


import java.util.*;

public class MapaMundial {
    private Map<String, Continente> continentes = new HashMap<>();
    private Map<String, Pais> paises = new HashMap<>();

    public MapaMundial() {
        inicializar();
    }
    // Es el constructor de la clase MapaMundial, y su única función es llamar al método inicializar().
    //Esto significa que cada vez que se crea un objeto MapaMundial, automáticamente se crean los continentes “América” y “Europa” y se guardan en el mapa continentes.

    private void inicializar() {
        // Crear continentes
        Continente america = new Continente("América");
        Continente europa = new Continente("Europa");
        continentes.put("América", america);
        continentes.put("Europa", europa);

        // Crear países
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780000); //aca lo estoy creando y al mismo tiempo asignando sus valores
        Pais uruguay = new Pais("Uruguay", "Montevideo", 176000);
        america.agregarPais(argentina);
        america.agregarPais(uruguay);
        paises.put("Argentina", argentina);
        paises.put("Uruguay", uruguay);

        // Provincias
        argentina.agregarProvincia(new Provincia("Entre Ríos"));
        argentina.agregarProvincia(new Provincia("Santa Fe"));
        uruguay.agregarProvincia(new Provincia("Salto"));
        uruguay.agregarProvincia(new Provincia("Paysandú"));
    }

    public Set<Pais> getPaises(String nombreContinente) {            //Este método devuelve el conjunto de países (Set<Pais>)                                                          
        Continente cont = continentes.get(nombreContinente);     //que pertenecen a un continente específico, cuyo nombre se pasa como parámetro.
        return cont != null ? cont.getPaises() : new HashSet<>();
    }    //Si el continente existe (cont != null), devuelve su conjunto de países (cont.getPaises()).
        //Si no existe (es decir, no se encontró ese nombre en el mapa), devuelve un conjunto vacío (new HashSet<>()).

    public Set<Provincia> getProvincias(String nombrePais) {  
        Pais p = paises.get(nombrePais);
        return p != null ? p.getProvincias() : new HashSet<>();
    }

    public List<Pais> getPaisesOrdenadosPorSuperficie() {  //Devuelve una lista de países ordenada por superficie de mayor a menor.
        List<Pais> lista = new ArrayList<>(paises.values());
        lista.sort(Comparator.comparingDouble(Pais::getSuperficie).reversed());
        return lista;
    }

    public Pais compararSuperficie(String nombre1, String nombre2) { //compara dos paises por su superficie
        Pais p1 = paises.get(nombre1);
        Pais p2 = paises.get(nombre2);
        if (p1 == null || p2 == null) return null;
        return p1.getSuperficie() > p2.getSuperficie() ? p1 : p2;
    }
}
