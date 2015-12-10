/**
 * the main class to run. Accepts command line parameters: the path to the source files (two)
 * @author Anatoli Gabrusev
 * @version  1.0
 */
public class Main {

    public static void main(String[] args)  {
       Enjine enjine = new Enjine(args);
        enjine.EngineGetProperty();
        enjine.EnjineSortingSequence();
    }
}