
public class ArithmeticExpection extends Exception 
  {
      @Override
      public String getMessage()
      {
          return "Não existe resultado para divisão por 0.";
      }
  }