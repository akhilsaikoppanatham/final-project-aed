/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Automobile;

import java.util.Date;

/**
 *
 * @author akhilsaikoppanatham
 */
public class Week {

    private String weekName;
    private String weekStatus;
    private Specifications specifications;

    public Week() {
        this.specifications = new Specifications();
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

    public Specifications getSpecification() {
        return specifications;
    }

    public void setSpecification(Specifications specifications) {
        this.specifications = specifications;
    }

    public String getWeekStatus() {
        return weekStatus;
    }

    public void setWeekStatus(String weekStatus) {
        this.weekStatus = weekStatus;
    }

    public boolean isAutomobileInGoodCondition(double vehicleAge, int mileage, int engineRPM, int ignitionLevel, float vehicleWeight, float vehicleLength) {

//        if ((vehicleAge >= 0.08) && (vehicleAge < 1)) {
//            return (mileage >= 20) && (mileage < 30) && (engineRPM >= 80) && (engineRPM < 140) && (ignitionLevel >= 70) && (ignitionLevel < 100) && (vehicleWeight >= 4) && (vehicleWeight < 10) && (vehicleLength >= 97.5) && (vehicleLength < 100.4);
//        }
//        if ((vehicleAge >= 1) && (vehicleAge < 3)) {
//            return (mileage >= 20) && (mileage < 30) && (engineRPM >= 80) && (engineRPM < 130) && (ignitionLevel >= 80) && (ignitionLevel < 110) && (vehicleWeight >= 10) && (vehicleWeight < 14) && (vehicleLength >= 97.5) && (vehicleLength < 100.4);
//        }
//        if ((vehicleAge >= 3) && (vehicleAge <= 5)) {
//            return (mileage >= 20) && (mileage < 30) && (engineRPM >= 80) && (engineRPM < 120) && (ignitionLevel >= 80) && (ignitionLevel < 110) && (vehicleWeight >= 14) && (vehicleWeight < 18) && (vehicleLength >= 98.6) && (vehicleLength < 99.5);
//        }
//        if ((vehicleAge >= 6) && (vehicleAge <= 12)) {
//            return (mileage >= 20) && (mileage < 30) && (engineRPM >= 70) && (engineRPM < 110) && (ignitionLevel >= 80) && (ignitionLevel < 120) && (vehicleWeight >= 20) && (vehicleWeight < 42) && (vehicleLength >= 98.6) && (vehicleLength < 99.5);
//        }
//        if (vehicleAge >= 13) {
//            return (mileage >= 12) && (mileage < 20) && (engineRPM >= 55) && (engineRPM < 105) && (ignitionLevel >= 110) && (ignitionLevel < 120) && (vehicleWeight > 50) && (vehicleLength >= 97.7) && (vehicleLength < 98.5);
//        } else {
//            return (mileage >= 30) && (mileage < 50) && (engineRPM >= 120) && (engineRPM < 160) && (ignitionLevel >= 50) && (ignitionLevel < 70) && (vehicleWeight >= 2) && (vehicleWeight < 3) && (vehicleLength >= 97.7) && (vehicleLength < 98.5);
//        }
        return true;
    }

    @Override
    public String toString() {
        return this.getWeekName();
    }
}
