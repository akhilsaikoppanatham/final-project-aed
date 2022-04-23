/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Role;

/**
 *
 * @author akhilsaikoppanatham
 */
public class Role {

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

}
