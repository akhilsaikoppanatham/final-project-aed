/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Automobile;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yojanitammineni
 */
public class Check {

    private String checkName;
    private ArrayList<Week> weekslist;
    private String checkStatus;
    private String dose;

    private int performanceMetricNumber;

    public Check() {
        this.weekslist = new ArrayList<Week>();
    }

    public int getPerformanceMetricNumber() {
        return performanceMetricNumber;
    }

    public void setPerformanceMetricNumber(int performanceMetric) {
        this.performanceMetricNumber = performanceMetric;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public Week searchWeek(String weekName) {
        for (Week week : weekslist) {
            if (week.getWeekName().equals(weekName)) {
                return week;
            }
        }
        return null;
    }

    public Week createWeek() {
        Week week = new Week();
        weekslist.add(week);
        return week;
    }

    public ArrayList<Week> getWeekslist() {
        return weekslist;
    }

    public void setWeekslist(ArrayList<Week> weekslist) {
        this.weekslist = weekslist;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getTest() {
        return dose;
    }

    public void setTest(String test) {
        this.dose = test;
    }

    @Override
    public String toString() {
        return this.getCheckName();
    }
}
