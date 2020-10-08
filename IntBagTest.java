/* A class to create a collection of positive integers and test IntBag Class
 * @author : Miray Ayerdem
 * @version : 06/10/2020
 * */
import java.util.Scanner;
public class IntBagTest {
   public static void main(String args[])
   {
      Scanner in;
      IntBag numbers;
      int opt;
      int index;
      numbers = new IntBag();
      in = new Scanner(System.in);
      int nums;
      nums = 2;
      index = 0;
      opt = 0;
      
      do
      { 
         System.out.println("1-Creating a new collection of positive numbers\n2-Add a number to collection\n3- Add number to a specific location of collection");
         System.out.println("4-Remove number which given index\n5-Remove all values of given number\n6-Showing number with given index\n7-Check if the collection contains given number or not");
         System.out.println("8-Print collection\n9-Exit ");
         
         System.out.print("Please choose option: ");
         opt = in.nextInt();
         
         if(opt == 1)
         {
            System.out.print("Enter the elements of the array: ");
            while(nums != 0)
            {
               nums = in.nextInt();
               if(nums != 0)
                  numbers.add(nums);
            } 
         }
         else if( opt == 2)
         {
            System.out.print("Choose a number to be added: ");
            nums = in.nextInt();
            numbers.add(nums);
         }
         else if( opt == 3)
         {
            System.out.print("Choose a number to be added and the index: ");
            nums = in.nextInt();
            index = in.nextInt();
            if( numbers.addFromIndex(nums, index))
               System.out.println("Adding the value is successful");
            else
               System.out.println("The index is out of bounds or your number is not positive");
         }
         else if (opt == 4)
         {
            System.out.print("Choose a index of a value to be removed: ");
            index = in.nextInt();
            if(numbers.removeElement(index))
               System.out.println("Removing the value is successful");
            else
               System.out.println("Given index is out of bounds");
         }
         else if(opt == 5)
         {
            System.out.print("Choose a number to be removed: ");
            nums = in.nextInt();
            if(numbers.removeAll(nums))
               System.out.println("Removing number is successful");
            else
               System.out.println("The array does not contain the number");
         }
         else if(opt == 6)
         {
            System.out.print("Choose an index to show the number locates the index: ");
            index = in.nextInt();
            if( numbers.showValue(index) != -1)
               System.out.println("The value is " + numbers.showValue(index));
            else
               System.out.println("Given index is out of bounds");
         }
         else if(opt == 7)
         {
            System.out.print("Choose the number to test : ");
            nums = in.nextInt();
            numbers.testValue(nums); 
         }
         else if( opt == 8)
            System.out.println("The array is :" + numbers.toString()); 
         
         
         
      }
      while(opt != 9);
      
      
      
   }
}