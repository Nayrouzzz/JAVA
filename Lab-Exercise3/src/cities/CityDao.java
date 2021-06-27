/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cities;

import java.util.List;

/**
 *
 * @author Nayrouz
 */
public interface CityDao<type> {
    public List<type> getData(String path);
    

    
}
