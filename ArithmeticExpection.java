
public class ArithmeticExpection extends Exception 
  {
      @Override
      public String getMessage()
      {
          return "N�o existe resultado para divis�o por 0.";
      }
  }