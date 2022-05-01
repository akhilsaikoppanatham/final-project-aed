/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Role;

import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author akhilsaikoppanatham
 */
public class GarageManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new GarageManagerWorkAreaJPanel(userProcessContainer, enterprise, account, organization, business);
    }
}
