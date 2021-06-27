/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidsFinal;

import Dao.DaoClass;
import java.util.List;
import pyramids.pyramids;


/**
 *
 * @author Nayrouz
 */
public class PyramidsFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DaoClass dc = new DaoClass();
        String path = "C:\\Users\\ELTayeb\\OneDrive\\Desktop\\PyramidsThird\\src\\pyramidss.txt";
        List<pyramids> pyramids = dc.getAllPyramidsFromTxt(path);
        pyramids.forEach(System.out::println);
//        System.out.println(pyramids);
        
    }
    
}
