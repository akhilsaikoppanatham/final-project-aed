/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
/**
 *
 * @author nikki
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        OutletEnterprise("OutletEnterprise"),
        GarageEnterprise("GarageEnterprise"),
        AutoMechanicEnterprise("AutoMechanicEnterprise"), SalesEnterprise("SalesEnterprise");

        private String value;
        private EnterpriseType(String value) {
            this.value = value;
        }