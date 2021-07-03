/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testchart;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.nashorn.internal.objects.NativeDebug;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;
/**
 *
 * @author Nayrouz
 */
public class XchartClass {
    public static void main(String[] args) throws IOException {
        TitanicPassenger P = new TitanicPassenger();
        List<TitanicPassenger> Passengers = new ArrayList<>();
        Passengers = P.getPassengersFromJsonFile();

        //To get the age and name of all passengers as a set of data
        List<Float> pAges = Passengers.stream().map(TitanicPassenger::getAge).limit(8).collect(Collectors.toList());
        List<String> pNames = Passengers.stream().map(TitanicPassenger::getName).limit(8).collect(Collectors.toList());

        //////////////////////  Making GRAPHS  ///////////////
        //1- Create a Histogram of first 8 persons (Ages and names)
        //create chart
        
        CategoryChart chart = new CategoryChartBuilder().width(1024).height(768).title("Age Hist").xAxisTitle("Names").yAxisTitle("Age").build();
        //customize chart (style)
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);  //numbers inside blocks
        
        //adding the sets to chart
        chart.addSeries("Passenger's Ages", pNames, pAges);   //(Word inside Legends, x , y)
        //Display
        new SwingWrapper(chart).displayChart();

      
        //2- Create a graph represents the percentage of each class(a,b,c)
        //create chart
        PieChart pieChart = new PieChartBuilder().width(1024).height(768).title("Passenger's Classes").build();
        //style chart
        Color[] sliceColors = new Color[]{new Color(180, 40, 50), new Color(130, 105, 120), new Color(80, 120, 160)};
        pieChart.getStyler().setSeriesColors(sliceColors);
        //adding sets to chart
        Map<String, Long> result = Passengers.stream().collect(Collectors.groupingBy(TitanicPassenger::getPclass, Collectors.counting()));
        pieChart.addSeries("First Class", result.get("1"));
        pieChart.addSeries("Second Class", result.get("2"));
        pieChart.addSeries("Third Class", result.get("3"));
        
        new SwingWrapper(pieChart).displayChart();
        
        //3 - make piechart for gendres percentage
        
        PieChart pieChart2  = new PieChartBuilder().title("Gendres").build();
        Map<String,Long> gendreChart = Passengers.stream().collect(Collectors.groupingBy(TitanicPassenger::getSex,Collectors.counting()));
        
        pieChart2.addSeries("Female", gendreChart.get("female"));
        pieChart2.addSeries("Male", gendreChart.get("male"));
        
        new SwingWrapper(pieChart2).displayChart();
        
        
        //4 - make piechart for survivived gendre
        
        PieChart pieChart3 = new PieChartBuilder().title("Gendre Survived").build();
        Map<String,Long> SurvivedGendre = Passengers.stream().filter((name) -> name.getSurvived().equals("1")).collect(Collectors.groupingBy(TitanicPassenger::getSex,Collectors.counting()));
    
        pieChart3.addSeries("Female", SurvivedGendre.get("female"));
        pieChart3.addSeries("Male", SurvivedGendre.get("male"));
        
        new SwingWrapper(pieChart3).displayChart();
        
        
        //5 - make piechart for Deceased gendre

        PieChart pieChart4 = new PieChartBuilder().title("Gendre Deceased").build();
        Map<String,Long> DeceasedGendre = Passengers.stream().filter((name) -> name.getSurvived().equals("0")).collect(Collectors.groupingBy(TitanicPassenger::getSex,Collectors.counting()));
    
        pieChart4.addSeries("Female", DeceasedGendre.get("female"));
        pieChart4.addSeries("Male", DeceasedGendre.get("male"));
        

        
        new SwingWrapper(pieChart4).displayChart();


       

    }
    
}
