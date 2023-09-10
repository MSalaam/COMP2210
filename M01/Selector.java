import java.util.Arrays;

/**
* Defines a library of selection methods
* on arrays of ints.
*
* @author   YOUR NAME (YOU@auburn.edu)
* @author   Dean Hendrix (dh@auburn.edu)
* @version  TODAY
*
*/
public final class Selector {

   /**
    * Can't instantiate this class.
    *
    * D O   N O T   C H A N G E   T H I S   C O N S T R U C T O R
    *
    */
   private Selector() { }


   /**
    * Selects the minimum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int min(int[] a) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0) {
      
         throw new IllegalArgumentException();
      }
   
   // return smallest element.
   
      int min = a[0];
      for (int i = 1; i < a.length; i++) {
      
         if (a[i] < min) {
            min = a[i];
         }
      }
    
   
      return min;
   }


   /**
    * Selects the maximum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int max(int[] a) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
   
   // return largest element.
   
      int max = a[0];
      for (int i = 1; i < a.length; i++) {
      
         if (a[i] > max) {
            max = a[i];
         }
      }
   
      return max;
   }


   /**
    * Selects the kth minimum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth minimum value. Note that there is no kth
    * minimum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmin(int[] a, int k) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0 || k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      
      // 
      int[] b = new int[a.length];
      for (int i = 0; i < a.length; i ++) {
         b[i] = a[i];
      }
      
      // sort array.
      
      Arrays.sort(b);
      int distinct = 1;
      int temp = b[0];
      int kmin = 0;
      
      // return first element because its smallest after sorting.
      
      if (kmin == 1) {
         kmin = b[0];
         return kmin;
      }
      
      // find distinct and compare to k to first smallest.
      // and find temp
      
      for (int i = 1; i < a.length; i++) {
         if (b[i] != temp) {
            distinct++;
            
            if (distinct == k) {
               kmin = b[i];
            }
         }
      
         temp = b[i];
      }
      
      // no kmin if k > distinct.
      
      if (k > distinct) {
      
         throw new IllegalArgumentException();
      }
      
   
      return kmin;
   }


   /**
    * Selects the kth maximum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth maximum value. Note that there is no kth
    * maximum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmax(int[] a, int k) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0 || k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      
      // 
      int[] b = new int[a.length];
      for (int i = 0; i < a.length; i++) {
         b[i] = a[i];
      }
      
      // sort array 
      
      Arrays.sort(b);
      int distinct = 1;
      int temp = b[b.length - 1];
      int kmax = 0;
      
      // return last element because its the largest after sorting.
      
      if (kmax == 1) {
         kmax = b[b.length - 1];
      
         return kmax;
      }
      
      // compare distinct and find temp.
      
      for (int i = b.length - 1; i >= 0; i--) {
      
         if (b[i] != temp) {
            distinct++;
         
            if (distinct == k) {
               kmax = b[i];
            
            }
         }
         temp = b[i];
      }
      
      // no kmax if k > distinct.
      
      if (k > distinct) {
      
         throw new IllegalArgumentException();
      }
      
      
      return kmax;
   }


   /**
    * Returns an array containing all the values in a in the
    * range [low..high]; that is, all the values that are greater
    * than or equal to low and less than or equal to high,
    * including duplicate values. The length of the returned array
    * is the same as the number of values in the range [low..high].
    * If there are no qualifying values, this method returns a
    * zero-length array. Note that low and high do not have
    * to be actual values in a. This method throws an
    * IllegalArgumentException if a is null or has zero length.
    * The array a is not changed by this method.
    */
   public static int[] range(int[] a, int low, int high) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      // find actual range.
      
      int size = 0;
      for (int i = 0; a.length < i; i++) {
         if (a[i] >= low && a[i] <= high) {
            size++;
         }
      }
      
      // range is now size.
      
      int[] range = new int[size];
      if (size == 0) {
         return range;
      }
      
      // j = range.
      
      int j = 0;
      for (int  i = 0; i < a.length; i++) {
         if (a[i] >= low && a[i] <= high) {
            range[j] = a[i];
            j++;
         }
      }
      
      
      
      
      return range;
   }


   /**
    * Returns the smallest value in a that is greater than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int ceiling(int[] a, int key) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      
     
      int ceiling = 0;
      boolean found = false;
      
      // look for ceiling and define size.
      
      for (int i = 0; i < a.length; i++) {
      
         if (!found && a[i] >= key) {
            ceiling = a[i];
            found = true;
         }
         
         // define ceiling as element size.
         else if (a[i] >= key && a[i] <= ceiling) {
            ceiling = a[i];
         }
      }
      
      // throw exception if no elements or = 0.
      
      if (!found) {
      
         throw new IllegalArgumentException();
      }
      
      
      
      return ceiling;
   }


   /**
    * Returns the largest value in a that is less than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int floor(int[] a, int key) {
   
   // throw exception if theres no a or elements in array.
   
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int floor = 0;
      boolean found = false;
      
      // look for floor and define size.
      
      for (int i = 0; i < a.length; i++) {
      
         if (!found && a[i] <= key) {
         
            floor = a[i];
            found = true;
         }
         
         // define floor as element size.
         
         else if (a[i] <= key && a[i] >= floor) {
            floor = a[i];
         }
      }
      
      // throw exception if no elements or = 0.
      if (!found) {
      
         throw new IllegalArgumentException();
      }
      
      
      
      return floor;
   }

}
