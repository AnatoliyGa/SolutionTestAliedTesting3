import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 09.12.15
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class JUnit4MainTest extends Assert {
private static BufferedWriter OutputA;
private static BufferedWriter OutputB;
private static String URIA;
private static String URIB;
private  static String[] URI = new String[2];
private static BufferedReader InputC;

Enjine enjine;

@BeforeClass
public  static void setUpBeforClass() throws Exception {
 URIA=System.getProperty("user.dir").concat("/src/main/java/A.txt");
 URIB=System.getProperty("user.dir").concat("/src/main/java/B.txt");
 URI[0]=URIA;
 URI[1]=URIB;
 OutputA = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/src/main/java/A.txt"));
 OutputB = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/src/main/java/B.txt"));
 InputC =  new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/java/C.txt"));
}
 @Test
  public void  Test1() throws Exception{
  OutputA.write("2\r\n");
  OutputA.write("4\r\n");
  OutputB.write("7\r\n");
  OutputB.write("9\r\n");
  enjine = new Enjine(URI);
  enjine.EngineGetProperty(System.getProperty("user.dir")+"/src/main/java/C.txt");
  enjine.EnjineSortingSequence();
  assertEquals("Fail!!",2,InputC.readLine());


 }
}
