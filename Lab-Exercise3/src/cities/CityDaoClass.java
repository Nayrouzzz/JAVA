
package cities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CityDaoClass implements CityDao<City> {

    @Override
    public List<City> getData(String path) {
        List<City> cityList = new ArrayList<City>();
        File f = new File(path); 
        
        try {
            Scanner sc  = new Scanner(f);
            sc.next();
            while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.isEmpty()){
                //System.out.println("Empty line");
                continue;
            }
            
            String[] arr = line.split(",");
            String iso3 = arr[0];
            String city_ascii = arr[1];
            double lat;
            if(arr[2].equals("")){
                lat = 0;
            }
            else {
               lat = Double.valueOf(arr[2]);
            }
            
            
            
            double lng = "".equals(arr[3])? 0 : Double.valueOf(arr[3]);
            boolean capital = "yes".equals(arr[4]);
            double population = "".equals(arr[5])? 0 : Double.valueOf(arr[5]); 
            String id = arr[6];
            
            City c = new City( iso3 ,  city_ascii,  lat , lng , capital , population , id);
            
            cityList.add(c);
            //System.out.println(c);
            }
        } catch (FileNotFoundException ex) {
        }
         
        return cityList;
        
    }
    
}
