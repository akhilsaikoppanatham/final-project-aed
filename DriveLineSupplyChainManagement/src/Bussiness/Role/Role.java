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
public abstract class Role {
    public enum RoleType {
        Admin("Admin"),
        DealerRole("DealerRole"),
        AutomobileRole("AutomobileRole"),
        Receptionist("Receptionist"),
        InspectionMechanicRole("InspectionMechanicRole"),
        EnvironmentCompilanceCheckMechanicRole("EnvironmentCompilanceCheckMechanicRole"),
        GarageManagerRole("GarageManagerRole"),
        GarageMechanicRole("GarageMechanicRole"),
        SalesManagerRole("SalesManagerRole"),
        SalesEmployeeRole("SalesEmployeeRole");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
