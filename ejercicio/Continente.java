
package ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Continente {
    private String nombre;
    private Set<Pais> paises;

    public Continente(String nombre) { //este es el contructor 
        this.nombre = nombre;
        this.paises = new HashSet<>();
    }
    


    public void agregarPais(Pais pais) {
        paises.add(pais);
        pais.setContinente(this);
    }

    public Set<Pais> getPaises() {
        return paises;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
