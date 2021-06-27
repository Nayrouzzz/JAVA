
package countries;

import cities.CityDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nayrouz
 */
public class CountryDaoClass implements CityDao<country>{

    @Override
    public List<country> getData(String path) {
        List<country> countryList = new ArrayList<country>();
        File cf = new File(path); 
        
        try {
            Scanner scc  = new Scanner(cf);
            scc.next();
            while(scc.hasNextLine()){
            String line = scc.nextLine();
            if(line.isEmpty()){
                //System.out.println("Empty line");
                continue;
            }
            
            String[] array = line.split(",");
            String iso3 = array[0];
            String country = array[1];
            
            
            country c = new country( iso3 ,  country);
            
            countryList.add(c);
            //System.out.println(c);
            }
        } catch (FileNotFoundException ex) {
        }
         
        return countryList;
    }
    
}
