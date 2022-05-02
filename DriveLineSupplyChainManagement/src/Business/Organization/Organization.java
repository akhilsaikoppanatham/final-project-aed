/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Automobile.AutomobileDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author nikki
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private AutomobileDirectory automobileDirectory;
    private int organizationID;
    private static int counter = 0;
     public enum Type {
        AutomobileOrganization("AutomobileOrganization"), DealerOrganization("DealerOrganization"), InspectionOrganization("InspectionOrganization"),
        EnvironmentComplianceCheckOrganization("EnvironmentComplianceCheckOrganization"), GarageManagerOrganization("GarageManagerOrganization"), GarageMechanicOrganization("GarageMechanicOrganization"),
        SalesManagerOrganization("SalesManagerOrganization"), SalesEmployeeOrganization("SalesEmployeeOrganization");
        private String value;

        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
     public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        automobileDirectory = new AutomobileDirectory();
        organizationID = counter;
        ++counter;
    }
public AutomobileDirectory getAutomobileDirectory() {
        return automobileDirectory;
    }

    public void setAutomobileDirectory(AutomobileDirectory automobileDirectory) {
        this.automobileDirectory = automobileDirectory;
    }

    public static int getCounter() {
        return counter;
    }
public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
