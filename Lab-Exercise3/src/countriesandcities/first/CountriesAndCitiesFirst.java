
package countriesandcities.first;

import cities.City;
import cities.CityDaoClass;
import countries.CountryDaoClass;
import countries.country;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List ;
import java.util.Map;

public class CountriesAndCitiesFirst {

    public static void main(String[] args) {
        
        CityDaoClass cd = new CityDaoClass();
        List<City> lst = cd.getData("D:\\ITI\\JAVAAA\\cities.csv");
        
        City maxCity = lst.stream().filter((t) -> {
            return t.capital; //To change body of generated lambdas, choose Tools | Templates.
        }).max((o1, o2) -> {
            return (int)(o1.population - o2.population); //To change body of generated lambdas, choose Tools | Templates.
        }).get();
        //System.out.println(maxCity);
       
//        

        
        
        
        
        CountryDaoClass cntry = new CountryDaoClass();
        List<country> lstCntry = cntry.getData("D:\\ITI\\JAVAAA\\countries.csv");
        //System.out.println(lstCntry);
        
        //Map   
         Map<String , List<City>> city_map = new HashMap();
            for (country cnt : lstCntry){
                List<City> new_lst = new ArrayList<City>();
                for (City cities : lst) {
                    if (cnt.getIso3().equals(cities.getIso3())){
                        new_lst.add(cities);
                
                    }
                }
            city_map.put(cnt.getIso3(), new_lst);
            //System.out.println(city_map.get("EGY"));
            
        
            
            
            }
            
            System.out.println(city_map);
                    
        city_map.keySet().forEach((t) -> {
            System.out.println(city_map.get(t).stream().max((o1, o2) -> {
                return (int)(o1.population - o2.population); 
            }));
        });
        
    }
    
}
