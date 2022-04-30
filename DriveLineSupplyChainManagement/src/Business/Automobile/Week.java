/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Automobile;

/**
 *
 * @author yojanitammineni
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


    
}
