/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class SalesEnterprise extends Enterprise {
    
    public SalesEnterprise(String name){
        super(name,Enterprise.EnterpriseType.SalesEnterprise);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
