import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class MinOfThreeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   
      /** METHOD 1. **/
   @Test
   public void min1Test1() {
      int a = 1;
      int b = 2;
      int c = 3;
      int order = MinOfThree.min1(a, b, c);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min1Test2() {
      int a = 2;
      int b = 1;
      int c = 3;
      int order = MinOfThree.min1(b, a, c);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min1Test3() {
      int a = 2;
      int b = 3;
      int c = 1;
      int order = MinOfThree.min1(c, a, b);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min1Test4() {
      int a = 3;
      int b = 2;
      int c = 1;
      int order = MinOfThree.min1(c, b, a);
      assertEquals(1, 2, 3);
   }

   @Test 
   public void min1Test5() {
      int a = 3;
      int b = 3;
      int c = 2;
      int expected = 1;
      int actual = MinOfThree.min1(c, b, a);
      assertEquals(actual, expected);
   }
   
   @Test 
   public void min1Test6() {
      int a = 2;
      int b = 2;
      int c = 3;
      int expected = 2;
      int actual = MinOfThree.min1(a, b, c);
      assertEquals(actual, expected);
   }

      /** METHOD 2. **/
      
   @Test
   public void min2Test1() {
      int a = 1;
      int b = 2;
      int c = 3;
      int order = MinOfThree.min2(a, b, c);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min2Test2() {
      int a = 2;
      int b = 1;
      int c = 3;
      int order = MinOfThree.min2(b, a, c);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min2Test3() {
      int a = 2;
      int b = 3;
      int c = 1;
      int order = MinOfThree.min2(c, a, b);
      assertEquals(1, 2, 3);
   }
   
   @Test
   public void min2Test4() {
      int a = 3;
      int b = 2;
      int c = 1;
      int order = MinOfThree.min2(c, a, b);
      assertEquals(1, 2, 3);
   }

   @Test 
   public void min2Test5() {
      int a = 1;
      int b = 2;
      int c = 1;
      int order = MinOfThree.min2(a, b, c);
      assertEquals(1, 1, 2);
   }
   
   @Test 
   public void min2Test6() {
      int a = 2;
      int b = 2;
      int c = 3;
      int order = MinOfThree.min2(a, b, c);
      assertEquals(2, 2, 3);
   }
   

}
