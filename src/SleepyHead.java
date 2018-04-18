
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int question2 = JOptionPane.showConfirmDialog(null, "Are you on vacation??", "",  JOptionPane.YES_NO_OPTION);  
        int question = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",  JOptionPane.YES_NO_OPTION);

       if (question == 1) {
    	   isWeekday = false;
       }
       else {
    	   isWeekday = true;
       }
       if (question2 == 1) {
    	   isVacation = false;
       }
       else {
    	   isVacation = true;
       }
        if (isVacation) {
    	   System.out.println("Sleep in.");
       }
        else { 
        	if (isWeekday) {
    	   System.out.println("Get up lazybones!");
       }
       
       else {
    	   System.out.println("Sleep in.");
    	   
       }
        /*
         * Print â€œsleep inâ€� if it is a vacation or a weekend. If itâ€™s a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
	}
}
