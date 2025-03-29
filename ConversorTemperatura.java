public class ConversorTemperatura {
     // características da classe
    
    // funções construtoras
    //public ConversorTemperatura() {}; // construtor padrão


    // métodos/funções
    public double conversor (double celsius) {   // Celsius para Fahrenheit
        double resultado = celsius * 1.8 + 32.0;
            return resultado;
    }

    public double conversor (double fahrenheit ) {   // Fahrenheit para Celsius
        double resultado = (fahrenheit-32.0)/1.8;
            return resultado;
    }
   
    
}

