package Impactoecologic;

//en este caso y en todos pasa lo mismo, estan obligados a implementar ImpactoEcologico
public class Edificio implements ImpactoEcologico {
	
    private String nombre;
    private double consumoEnergiaAnual; // en kWh
    private String tipoEnergia; // "electricidad", "gas", "carbon"
    private int numeroPersonas;

    //constructorr
    public Edificio(String nombre, double consumoEnergiaAnual, String tipoEnergia, int numeroPersonas) {
        this.nombre = nombre;
        this.consumoEnergiaAnual = consumoEnergiaAnual;
        this.tipoEnergia = tipoEnergia;
        this.numeroPersonas = numeroPersonas;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Formula simplificada: consumo en kWh * factor de emisión
        double factorEmision = 0.0;
        
        switch(tipoEnergia.toLowerCase()) {
        
            case "electricidad":
                factorEmision = 0.5; // kg CO2 por kWh
                break;
            case "gas":
                factorEmision = 2.0; // kg CO2 por kWh
                break;
            case "carbon":
                factorEmision = 3.5; // kg CO2 por kWh
                break;
        }
        
        return consumoEnergiaAnual * factorEmision;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio: " + nombre + " - Personas: " + numeroPersonas;
    }
    
    // Metodos específicos de Edificio
    public double calcularConsumoPorPersona() {
        return consumoEnergiaAnual / numeroPersonas;
    }
}