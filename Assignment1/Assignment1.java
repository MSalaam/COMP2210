import java.util.Scanner;

public class Assignment1 {

   public static void main(String[] args){
   
      Scanner input = new Scanner(System.in);
      int n = 10;
      int smallest = Integer.MAX_VALUE;
      int[] avg = new int[n];
      int total = 0;
      
      System.out.println("Enter 10 number between -500 to 500");
   
      for (int i = 0; i < n; i++){
      
      
      
      }
      
      for (int i = 0; i < avg.length; i++){
      
         avg[i] = input.nextInt();
         total = total + avg[i];
         int current = avg[i];
         if (avg[i] < smallest){
            smallest = current;
         }
      }
      input.close();
      
      int average = total / avg.length;
      
      System.out.println("Smallest number is " + smallest);
      System.out.println("Average number is " + average);
   }
}