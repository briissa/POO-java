package Impactoecologic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear ArrayList de tipo ImpactoEcologico
        ArrayList<ImpactoEcologico> objetosEcologicos = new ArrayList<>();
        
        // Crear objetos de cada clase
        Edificio edificioOficina = new Edificio("Torre Empresarial", 50000, "electricidad", 200);
        Auto autoFamiliar = new Auto("Toyota", "Corolla", 15000, 7.5, "gasoil");
        Bicicleta biciUrbana = new Bicicleta("urbana", "aluminio", 2000, false);
        Bicicleta biciElectrica = new Bicicleta("montaña", "carbono", 3000, true);
        
        // Agregar objetos al ArrayList
        objetosEcologicos.add(edificioOficina);
        objetosEcologicos.add(autoFamiliar);
        objetosEcologicos.add(biciUrbana);
        objetosEcologicos.add(biciElectrica);
        
        // Iterar y mostrar información polimórficamente
        System.out.println("=== IMPACTO ECOLÓGICO DE DIFERENTES OBJETOS ===\n");
        
        for (ImpactoEcologico objeto : objetosEcologicos) {
            System.out.println("Identificación: " + objeto.getIdentificacion());
            System.out.printf("Impacto: %.0f kg CO₂%n", objeto.obtenerImpactoEcologico());
            System.out.println("----------------------------------------");
        }
        
        // Mostrar total
        double totalImpacto = objetosEcologicos.stream()
        						//transforma os numeros a double
                                .mapToDouble(ImpactoEcologico::obtenerImpactoEcologico)
                                //suma todos los numeros 
                                .sum();
        System.out.printf("\nIMPACTO ECOLÓGICO TOTAL: %.0f kg CO2 anuales%n", totalImpacto);
    }
}