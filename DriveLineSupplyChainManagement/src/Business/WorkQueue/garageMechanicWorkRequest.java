/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
/**
 *
 * @author akhilsaikoppanatham
 */
public class garageMechanicWorkRequest extends WorkRequest{
    
    private String automobileName;

    public String getAutomobileName() {
        return automobileName;
    }

    public void setAutomobileName(String automobileName) {
        this.automobileName = automobileName;
    }
}
