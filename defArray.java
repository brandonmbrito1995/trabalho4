
public class defArray 
{
    int[] ArrayA = new int[10];
    int[] ArrayB = new int[10];
    double c;
    public int getArrayA(int ArrayA)
    {
        return ArrayA;
    }
    public void setArrayA()
    {
        this.ArrayA = ArrayA;
    }
    public int getArrayB(int ArrayB)
    {
        return ArrayB;
    }
    public void setArrayB()
    {
        this.ArrayB = ArrayB;
    }
    public void setArrayAnaPosicao()
    {
    }
    public void setArrayBnaPosicao()
    {
    }
    public static void calculaQuociente(int a, int b)
    {
    try
    {
         double c = a / b;
    }
    catch(ArithmeticExpection e)
    {
       System.out.println(e.getMessage());
        e.printStackTrace();
    }
    }
    public void CalculaDivisaoArrays()
    {
        
    }
}
