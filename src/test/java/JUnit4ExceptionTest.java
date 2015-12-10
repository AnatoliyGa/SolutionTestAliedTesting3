import org.junit.Assert;
import org.junit.Test;


 /**Tests input file paths */

public class JUnit4ExceptionTest extends Assert {

 @Test(expected =IllegalArgumentException.class)
  public  void ExceptionTest1() throws IllegalArgumentException{
     String []  arg= new String[]{"C:/" };
     new Enjine(arg);
 }
    @Test(expected =IllegalArgumentException.class)
      public  void ExceptionTest2() throws IllegalArgumentException{
         String []  arg= new String[]{"C:/","D:/", "E:/"};
         new Enjine(arg);
     }

}

