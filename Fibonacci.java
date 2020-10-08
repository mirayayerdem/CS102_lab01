/* A class to show Fibonacci numbers
 * @author : Miray Ayerdem
 * @version : 06/10/2020
 * */
public class Fibonacci
{
   public static void main(String args[])
   {
      IntBag fibo;
      int sum;
      sum = 0;
      fibo = new IntBag();
      fibo.add(0);
      fibo.add(1);
      
      for(int i = 0 ; i < fibo.calculateSize() - 1 && fibo.calculateSize() < 40  ; i++) //add elements of array until stores 40 elements
      {
         sum = fibo.getBag()[i] + fibo.getBag()[i + 1]; //the next value is the sum of previous two values
         fibo.add(sum);
      }
      System.out.println(fibo.toString()); //prints fibonacci numbers
      
   }
}