import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 09.12.15
 * Time: 21:51
 * To change this template use File | Settings | File Templates.
 */
public class Enjine {
    private  String URIOutputFileC;
    private BufferedReader BuffInpA;
    private BufferedReader BuffInpB;
    private BufferedReader BuffInpC;
    private BufferedWriter BuffOutputC;
    private   String symbolA;
    private   String symbolB;
    private   Integer intA;
    private   Integer intB;
    private  String URIFileA;
    private  String URIFileB;


     public Enjine(String [] args){
       if (args.length!=2) throw new IllegalArgumentException("incorrect file paths..");
      this.URIFileA=args[0];
      this.URIFileB=args[1];
     }
    /** Loads the basic processing parameters from the configuration file: version 1.0 - the  URI output file*/
    public  void EngineGetProperty (){
        try {
        this.BuffInpC = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/main/java/config.txt"));
         URIOutputFileC = this.BuffInpC.readLine();
         BuffInpC.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

      /**Easy option: accept input URI file */
    public void EngineGetProperty (String URIOutputFileC) {
      this.URIOutputFileC=URIOutputFileC;

    }
       /**The basic method of calculation and data recording */
    public void EnjineSortingSequence(){
        try {
        this.BuffInpA= new BufferedReader(new FileReader(URIFileA));
        this.BuffInpB= new BufferedReader(new FileReader(URIFileB));
        this.BuffOutputC = new BufferedWriter(new FileWriter(URIOutputFileC));
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
            BuffOutputC.close();

        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }



}
