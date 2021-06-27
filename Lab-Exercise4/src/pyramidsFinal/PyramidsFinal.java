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
        String path = "D:\\ITI\\JAVAAA\\pyramids.csv";
        List<pyramids> pyramids = dc.getAllPyramidsFromTxt(path);
        //pyramids.forEach(System.out::println);
        //System.out.println(pyramids);


        Double median = pyramids.stream().map((t) -> {
            return t.Base1; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get(pyramids.size()/2);
        System.out.println("Median" + median);
        
        double lowerQ = pyramids.stream().map((t) -> {
            return t.Base1; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get((int) (pyramids.size()*0.25));
        System.out.println("Lower quarter" + lowerQ);
        
        double upperQ = pyramids.stream().map((t) -> {
            return t.Base1; //To change body of generated lambdas, choose Tools | Templates.
        }).sorted().toList().get((int)(pyramids.size()*0.75));
        System.out.println("Upper Quarter" + upperQ);
        
    }
    
}
