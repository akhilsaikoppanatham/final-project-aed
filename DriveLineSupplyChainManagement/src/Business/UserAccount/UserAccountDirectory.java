/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        if(checkIfUsernameIsUnique(username)){
            UserAccount account = new UserAccount();
            account.setUsername(username);
            account.setPassword(password);
            account.setEmployee(employee);
            account.setRole(role);
            userAccountList.add(account);
            return account;
        }else 
            return null;   
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
   
}

