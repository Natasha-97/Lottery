//********************************************************************************
// PantherID:  6222580
// CLASS: COP 2210 – [Fall 2019]
// ASSIGNMENT # [1]
// DATE: [9/14/2019]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//*******************************************************************************

import java.util.Random;
import javax.swing.JOptionPane;

public class winLot {
    public static void main(String[] args) {
        
        Random r = new Random();
        int fanT = 1 + r.nextInt(36);
        int fanT1 = 1 + r.nextInt(36);
        int fanT2 = 1 + r.nextInt(36);
        int fanT3 = 1 + r.nextInt(36);
        int fanT4 = 1 + r.nextInt(36);
        
        
        int lott = 1 + r.nextInt(53);
        int lott1 = 1 + r.nextInt(53);
        int lott2 = 1 + r.nextInt(53);
        int lott3 = 1 + r.nextInt(53);
        int lott4 = 1 + r.nextInt(53);
        int lott5 = 1 + r.nextInt(53);
        
        
        JOptionPane.showMessageDialog(null,"Hello MAMA, here are you winning "
                + "numbers, GOOD LUCK, LOVE YOU.\n" + "Your Fantasy 5: " 
                + fanT + " " + fanT1 + " " + fanT2 + " " + fanT3 + " "+ fanT4 +
                "\n" + "Your Lotto: " + lott + " " + lott1 + " " + lott2 + " " 
                + lott3 + " " + lott4 + " " + lott5 + " \n" + "Ready to Win?");    
       }
    }
    

