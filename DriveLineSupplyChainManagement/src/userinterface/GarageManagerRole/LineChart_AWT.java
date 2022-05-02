/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarageManagerRole;

import Business.Automobile.Check;
import Business.Automobile.Automobile;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT extends ApplicationFrame {

    private Automobile automobile;

    public LineChart_AWT(Automobile automobile, String applicationTitle, String chartTitle) {
        super(applicationTitle);
        this.automobile = automobile;
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                "Checks", "Aggregate Vehicle Performance Indicator",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset() {

        Check check1 = automobile.searchCheck("Check1");
        Check check2 = automobile.searchCheck("Check2");
        Check check3 = automobile.searchCheck("Check3");
        Check check4 = automobile.searchCheck("Check4");
        String automobileForChart = automobile.getName();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(check1.getPerformanceMetricNumber(), automobileForChart, "Check1");
        dataset.addValue(check2.getPerformanceMetricNumber(), automobileForChart, "Check2");
        dataset.addValue(check3.getPerformanceMetricNumber(), automobileForChart, "Check3");
        dataset.addValue(check4.getPerformanceMetricNumber(), automobileForChart, "Check4");
        System.out.println(check1.getPerformanceMetricNumber());
        System.out.println(check2.getPerformanceMetricNumber());
        System.out.println(check3.getPerformanceMetricNumber());
        System.out.println(check4.getPerformanceMetricNumber());
        return dataset;

    }
}
