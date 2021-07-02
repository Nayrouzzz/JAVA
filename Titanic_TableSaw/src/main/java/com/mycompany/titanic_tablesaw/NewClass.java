/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.titanic_tablesaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import joinery.DataFrame;
import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.Table;

/**
 *
 * @author Nayrouz
 */
public class NewClass {
    public static void main(String [] args) throws IOException
    {
            Table titanicData = Table.read().csv("D:\\ITI\\JAVAAA\\titanic.csv"); //reading table from csv
            DoubleColumn xx = DoubleColumn.create("XX");
            
            Table summary = titanicData.summary();

            for (int i=0; i<titanicData.rowCount(); i++)
            {   xx.append(i);
            }
            //System.out.println(xx.size());
            //System.out.println(titanicData.rowCount());
           
              
              titanicData.addColumns(xx);
              System.out.println(titanicData);
              System.out.println(summary.row(3)); //summary of table min , max 
              System.out.println(summary.row(4));
              System.out.println(summary.row(7));
            
              
            
            System.out.println("\n================================================================JOINERY======================================================");
                        
            DataFrame<Object> df= DataFrame.readCsv("D:\\ITI\\JAVAAA\\titanic.csv");//reading using joinery
            
            List<Integer> s = new ArrayList<>();

            for (int i=0; i<df.length(); i++)
            {   
                s.add(i);
            }
                                    
            DataFrame<Object> new_df = df.join(df);
            System.out.println(new_df);
            
            System.out.println(df.describe());
            
            
            
        }
    }

