package Impactoecologic;

public class Bicicleta implements ImpactoEcologico {
	
    private String tipo; // "urbana", "montaña", "carrera"
    private String material; // "aluminio", "acero", "carbono"
    private double kilometrosAnuales;
    private boolean esElectrica;

    public Bicicleta(String tipo, String material, double kilometrosAnuales, boolean esElectrica) {
        this.tipo = tipo;
        this.material = material;
        this.kilometrosAnuales = kilometrosAnuales;
        this.esElectrica = esElectrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Las bicicletas tienen impacto mínimo
        double impacto = 0.0;
        
        // Impacto por fabricación
        double impactoFabricacion = 0.0;
        switch(material.toLowerCase()) {
            case "carbono":
                impactoFabricacion = 150.0; // kg CO2
                break;
            case "aluminio":
                impactoFabricacion = 100.0; // kg CO2
                break;
            case "acero":
                impactoFabricacion = 80.0; // kg CO2  significa kilogramos de dióxido de carbono
                break;
        }
        
        // Impacto anual por fabricación
        impacto += impactoFabricacion / 5;
        
        // Si es electrica, agregar consumo de electricidad
        if (esElectrica) {
            double consumoElectrico = kilometrosAnuales * 0.01; // kWh por km
            impacto += consumoElectrico * 0.5; // factor emisión electricidad
        }
        
        return impacto;
    }

    @Override
    public String getIdentificacion() {
        String tipoBici = esElectrica ? "Bicicleta Eléctrica" : "Bicicleta";
        return tipoBici + " " + tipo + " - Material: " + material;
    }
    
    // Método específico de Bicicleta
    public boolean esEcologica() {
        return obtenerImpactoEcologico() < 50;
    }
}
