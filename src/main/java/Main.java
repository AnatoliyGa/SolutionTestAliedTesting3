import java.io.*;

/**
 * the main class to run. Accepts command line parameters: the path to the source files (two)
 * @author Anatoli Gabrusev
 * @version  1.0
 */
public class Main {

    private static String URIFileA;
    private static String URIFileB;
    private static String URIOutputFileC;
    static BufferedReader BuffInpA;
    static BufferedReader BuffInpB;
    static BufferedReader BuffInpC;
    static BufferedWriter BuffOutputC;
    static  String symbolA;
    static  String symbolB;
    static  Integer intA;
    static  Integer intB;
    // public  Main() throws ArrayIndexOutOfBoundsException{
    //   throw new  ArrayIndexOutOfBoundsException();

    // }
    public static void main(String[] args)  {

    /* if (args.length!=2) {
         throw new  ArrayIndexOutOfBoundsException();
     }
     */


     Enjine enjine = new Enjine(args);
        enjine.EngineGetProperty();
        enjine.EnjineSortingSequence();
        /* try {
             BuffInpA= new BufferedReader(new FileReader(URIFileA));
             BuffInpB= new BufferedReader(new FileReader(URIFileB));
             BuffInpC = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/java/config.txt"));
             URIOutputFileC = BuffInpC.readLine();
             BuffOutputC = new BufferedWriter(new FileWriter(URIOutputFileC));
             while (((symbolA = BuffInpA.readLine())!=null) | ((symbolB = BuffInpB.readLine())!= null) ) {
                if(symbolA != null)
                {intA=Integer.parseInt(symbolA);
                }
                 if(symbolB !=null)
                {intB=Integer.parseInt(symbolB);
                 }
                 if(symbolA==null){
                  BuffOutputC.write(symbolB.concat("\r\n"));
                 continue;
                 }
                   if(symbolB==null){
                  BuffOutputC.write(symbolA.concat("\r\n"));
                  continue;
                  }
                 if (intA<intB){
                 BuffOutputC.write(symbolA.concat("\r\n"));
                 BuffOutputC.write(symbolB.concat("\r\n"));
                 continue;
                 }
                 if (intA>intB){
                     BuffOutputC.write(symbolB.concat("\r\n"));
                     BuffOutputC.write(symbolA.concat("\r\n"));
                 continue;
                 }
                 if(intA==intB){
                     BuffOutputC.write(symbolB.concat("\r\n"));
                     BuffOutputC.write(symbolA.concat("\r\n"));
                     continue;
                 }

             }
             BuffInpA.close();
             BuffInpB.close();
             BuffInpC.close();
             BuffOutputC.close();
         } catch (IOException e) {
             System.out.println("Cannot open File A or B..");
             e.printStackTrace();

         }

      */

    }






}
