public class ConversorTemperatura {
     // características da classe
     double celsius;
     double fahrenheit;
    
    // funções construtoras
    //public ConversorTemperatura() {}; // construtor padrão


    // métodos/funções
    public double conversor (celsius) {   // Celsius para Fahrenheit
        double resultado = celsius * 1.8 + 32.0;
            return resultado;
    }

    public double conversor (fahrenheit) {   // Fahrenheit para Celsius
        double resultado = (fahrenheit-32.0)/1.8;
            return resultado;
    }
   
    
}

