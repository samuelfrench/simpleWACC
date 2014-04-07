package wacc;

import java.util.Scanner;

/**
 *
 * @author sam french - samfrench@gmail.com - github: samuelfrench
 */
public class Wacc {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        System.out.println("NOTE: To calculate WACC where the firm is issuing new common stock, just enter r_e instead of r_s.");
        
        Scanner sc = new Scanner(System.in);
        double wd, rd, t, wp, rp, wc, rsCAPM, rsDCF, resultd, resultp, resultc, finalResult;
        
        t = promptIn("T", sc);
        
        wd = promptIn("W_D", sc);
        wp = promptIn("W_P", sc);
        wc = promptIn("W_C", sc);
        
        rd = promptIn("r_d", sc);
        rp = promptIn("r_p", sc);
        rsCAPM = promptIn("r_s(CAPM)", sc);
        rsDCF = promptIn("r_s(DCF)", sc);

        
        resultd = (wd*rd*(1-t));
        System.out.println("D: " + Double.toString(resultd));
        resultp = (wp*rp);
        System.out.println("P: " + Double.toString(resultp));
        resultc = wc*((rsCAPM+rsDCF)/2);
        System.out.println("C: " + Double.toString(resultc));
        
        finalResult=resultd+resultp+resultc;
        
        System.out.println("------");
        System.out.println("Final Result: " + Double.toString(finalResult));
    }
    
    private static double promptIn(String var, Scanner sc)
    {
        System.out.println("Enter " + var + ": ");
        return Double.parseDouble(sc.nextLine());
    }
}
