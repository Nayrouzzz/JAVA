/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pyramids.pyramids;

/**
 *
 * @author Nayrouz
 */
public class DaoClass implements pyramidsDao {

    @Override
    public List<pyramids> getAllPyramidsFromTxt(String path) {
        
        List<pyramids> allPyramids = new ArrayList<>();
        
        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            
            if(sc.hasNextLine()){ 
                sc.nextLine();
            }
            while(sc.hasNextLine()){
                    
                  String line  = sc.nextLine();
                  String[] parts = line.split("," , -1);
//                  System.out.println(parts.length);
                //int part3 = 0;
                    //if (parts[3] != ""){
                       // part3 = Integer.parseInt(parts[3]);
//                    }
                 
                  pyramids p = new pyramids(
                          parts[0], 
                          parts[1], 
                          parts[2], 
                          parts[3] != "" ? Integer.parseInt(parts[3]): 0, 
                          parts[4], 
                          parts[5] != "" ? Double.valueOf(parts[5]) : 0, 
                          parts[6] != "" ? Double.valueOf(parts[6]) : 0 , 
                          parts[7] != "" ? Double.valueOf(parts[7]) : 0);
                  //System.out.println(p);
                  allPyramids.add(p);
            }
        } catch (FileNotFoundException ex) {
           
        }
        
    return allPyramids;
    }

    
}
