package ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String nombre;
    private String capital;
    private double superficie;
    private Continente continente;
    private Set<Provincia> provincias;

    public Pais(String nombre, String capital, double superficie) {
        this.nombre = nombre;
        this.capital = capital;
        this.superficie = superficie;
        this.provincias = new HashSet<>();
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    @Override
    public String toString() {
        return nombre + " (" + capital + ", " + superficie + " km²)";
    }
}
