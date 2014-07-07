/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class TryCatchExceptions {

    public  void methodAboutExceptions(int option) throws Exception {
        System.out.println("\n\n\nStart of method about exceptions.");
        try {
            System.out.println("Starting to TRY...");
            if (option == 0) {
                throw new NullPointerException();
            }
            if (option == 1) {
                throw new RuntimeException();
            }
            if (option == 2) {
                throw new Exception();
            }
            System.out.println("Nothing else to TRY...");
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException... "
                    + "because it was not a NullPointerException");
        } finally {
            System.out.println("FINALLY, we do this, regardless of "
                    + "what happened in the try block.");
        }

        System.out.println("End of method about exceptions.");
    }
    
    public static void main(String[] args) throws Exception {
        TryCatchExceptions x = new TryCatchExceptions();
//        x.methodAboutExceptions(0);
//        x.methodAboutExceptions(1);
        x.methodAboutExceptions(2);

        
    }

}
