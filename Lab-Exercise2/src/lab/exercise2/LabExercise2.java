/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise2;

import InterfacePackage.IsLetterInterface;
import InterfacePackage.StringInterface;

/**
 *
 * @author Nayrouz
 */
public class LabExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringInterface x = (a , b) -> a.length() >= b.length();
        StringInterface y = (m , n) -> m == "ahmed";
        
        
        IsLetterInterface l = (w)-> {
            
            for(int i=0 ; i<w.length(); i++){
                if(! Character.isLetter(w.charAt(i))){
                    return false;
                }
            }
            return true;
        
    };
        boolean q = x.TestString("nayrouz222" , "heba");
        System.out.println(q);
        
        boolean q1 = y.TestString("ahmed" , "nayrouz");
        System.out.println(q1);
        
        boolean q3 = l.Letters("n1ayrou7z");
        System.out.println(q3);  
        
         
    }
    
}
