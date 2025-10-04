package Impactoecologic;

public class Auto implements ImpactoEcologico { 
	//la clase auto debe impelmentar todos los metodos de la interfaz(esta obligada)
	
	//atributos 
    private String marca;
    private String modelo;
    private double kilometrosAnuales;
    private double consumoCombustible; // litros por 100km se supone 
    private String tipoCombustible; // "gas", "nafta"

    
    //constructor 
    public Auto(String marca, String modelo, double kilometrosAnuales, 
                double consumoCombustible, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosAnuales = kilometrosAnuales;
        this.consumoCombustible = consumoCombustible;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
    	
        // Formula: (km anuales / 100) * consumo * factor emision
    	//(factor emision) es un valor que representa cuántos kilogramos de CO₂ se emiten por cada litro de combustible quemado.
        double litrosConsumidos = (kilometrosAnuales / 100) * consumoCombustible;
        double factorEmision = 0.0;
        
        switch(tipoCombustible.toLowerCase()) {
            case "nafta":    //estso son datos que no sabia (pueden estar mal)
                factorEmision = 2.3; // kg CO2 por litro
                break;
                
            case "gasoil":
                factorEmision = 2.7; // kg CO2 por litro
                break;
                
            case "gnc":
                factorEmision = 1.8; // kg CO2 por litro equivalente
                break;
        }
        
        return litrosConsumidos * factorEmision;
    }

    @Override  //devolvemos informacion 
    public String getIdentificacion() {
        return "Auto: " + marca + " " + modelo + " - Combustible: " + tipoCombustible;
    }
    
    // Metodo especifico de Auto
    public double calcularEmisionesPorKilometro() {
        return obtenerImpactoEcologico() / kilometrosAnuales;
    }
}