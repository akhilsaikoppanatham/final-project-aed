/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Automobile;

import java.util.Date;

/**
 *
 * @author yojanitammineni
 */
public class Specifications {
    private int mileage;
    private int engineRPM;
    private int ignitionLevel;
    private float automobileWeight;
    private int bodyLength;
    private Date time;

    public Specifications() {
        
    }
     public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    
}
