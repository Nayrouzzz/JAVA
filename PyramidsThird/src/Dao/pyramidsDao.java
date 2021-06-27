/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import pyramids.pyramids;

/**
 *
 * @author Nayrouz
 */
public interface pyramidsDao {
    List<pyramids> getAllPyramidsFromTxt(String path);
    
}
