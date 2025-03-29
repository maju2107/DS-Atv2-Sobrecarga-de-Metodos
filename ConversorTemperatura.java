public class ConversorTemperatura {
    
   public ConversorTemperatura() {}; // construtor padrão

   // métodos/funções

   public double conversor (int celsius) {   // Celsius para Fahrenheit
       double resultado = (celsius * 9.0/5.0) + 32.0;
           return resultado;
   }

   public double conversor (double fahrenheit) {   // Fahrenheit para Celsius
       double resultado = (fahrenheit - 32.0)/1.8;
           return resultado;
   }
  
   public double conversor (int celsius, double ajuste, boolean arredondamento) {   // Celsius para Fahrenheit + ajuste +arredondamento
        double resultado = (celsius * 9.0/5.0) + 32.0 + ajuste;
     // Verifica se o valor deve ser arredondado
     if (arredondamento = true) {
        resultado = Math.round(resultado); // Arredonda para o inteiro mais próximo
    }
        return resultado;
  }

  public double conversor (double fahrenheit, double ajuste, boolean arredondamento) {   // Fahrenheit para Celsius+ ajuste +arredondamento
        double resultado = (fahrenheit - 32.0)/1.8 + ajuste;
     // Verifica se o valor deve ser arredondado
     if (arredondamento = true) {
        resultado = Math.round(resultado); // Arredonda para o inteiro mais próximo
    }
        return resultado;
  }
   
}
// obs: o valor em graus Celsius também poderia ser um double, mas daí não daria certo para fazer 
// a sobrecarga pois as assinaturas ficariam iguais, então eu deixei como int
