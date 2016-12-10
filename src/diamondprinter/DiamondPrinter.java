
package diamondprinter;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Laura Josuweit
 */
public class DiamondPrinter 
{
                      //PROJECT 6 PART 2 - DIAMOND PRINTER//
 
   
    public static void main(String[] args) 
    {
          
       Scanner scan = new Scanner(System.in);
       
       int num = 0;//this will hold how long the middle line will be after the
       //exception catching loop below.
       
       do
       {
            System.out.println("Please enter an odd integer to be the width "
                    + "of "
                + "the diamond:");//need to make the middle of the diamond 
                                 //this length
      
     
          try//check to make sure what they enter is actually an integer.
          {
               num = scan.nextInt();
          
          } 
          
          catch (InputMismatchException e)//if it is not,
            {
                       System.out.println("That is not an integer!");
                       
                       scan.next();//need this to clean out the bad token so
                       //the try-catch does not go in an infinite loop.
                       continue;
            }
                             
     
           
                
            if (num % 2 == 0)//if the number is even,
            {
                num = 0;//resent number so loop will run again
                System.out.println("That is not an odd number.");
                //inform user they entered invalid input
            }
            
       }while(num == 0);
       
       
       
        
        System.out.println("Please enter what character you would like "
                + "the pyramid to be made out of:");//So the user can enter
        //whatever character they want
       
        String ch = scan.next();//stores the character the user enters as 
        //a string
       
      
   int i = 1;//loop counter
       
   while(i<=(num/2)+1)//this will give us the rows we need to make the top
            //half of the diamond.
        {
            int j = 1;//inner counter
            while (j <= ((num/2)+3)-i)//the longest line will have a cushion 
                //of 2 spaces in front of it.
            {
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            
            while(j<2*i)
            {
                System.out.print(ch);
                j++;
            }
        
            System.out.println("");
            
            i++;
        
        }
        
        
   
     i = 1;//reset counter
        
       while(i<=((num/2)))//we will need 1 less row than the top half.
         
        {
            int j = 1;
            while (j <= i+2)//cushion of 3 spaces to start with.
            {
                System.out.print(" ");
                j++;
            }
            
            j = 1;
            
            while(j<2*(((num/2)+1)-i))//will print 2 less on each line.
                
            {
                System.out.print(ch);
                j++;
            }
        
            System.out.println("");
            
            i++;
        
        } 
       
        
    }
    
}
