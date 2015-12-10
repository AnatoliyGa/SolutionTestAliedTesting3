import org.junit.*;

import java.io.*;

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
private static Enjine enjine;

@BeforeClass
public  static void setUpBeforClass() throws Exception {
 URIA=System.getProperty("user.dir").concat("/src/test/java/A.txt");
 URIB=System.getProperty("user.dir").concat("/src/test/java/B.txt");
 URI[0]=URIA;
 URI[1]=URIB;
 OutputA = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/src/test/java/A.txt"));
 OutputB = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/src/test/java/B.txt"));
InputC =  new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/test/java/C.txt"));
}
 @Test
  public void  Test1() throws Exception{
  OutputA.write("2\r\n");
  OutputA.write("4\r\n");
  OutputB.write("7\r\n");
  OutputB.write("9\r\n");
  OutputA.flush();
  OutputB.flush();
  enjine = new Enjine(URI);
  enjine.EngineGetProperty(System.getProperty("user.dir")+"/src/test/java/C.txt");
  enjine.EnjineSortingSequence();
  InputC =  new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/test/java/C.txt"));
  assertEquals("Fail!! Data does not match!!", 2, Integer.parseInt(InputC.readLine()));
 }
  @After
    public void closeDescriptor(){
      try {
          OutputB.close();
          OutputB.close();
          InputC.close();
      } catch (IOException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
      }
  }
}
