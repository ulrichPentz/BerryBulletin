package com.pentz.berrybulletin.backend.tenancy;

// ====================================================================== \\

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//                                  Admin                                 \\
// ====================================================================== \\

/**
 * Administrator tenant with elevated permissions.
 */
public class Admin extends AbstractUser {

    private int id;
    private String userName;
    private boolean isRegistered;
    private List<String> privileges;
    
    // Constructor accepting unique identifier and display name.
    public Admin(int id, String userName){
        super(id, userName);
    }
    
    @Override
    public int getId(String userName, String password) {
        return super.getId(userName, password);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUserName(int id) {
        return super.getUserName(id);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setUserName(String userName) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUserRole(int id) {
        return super.getUserRole(id);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Add any admin-specific methods if required.
    
    

}