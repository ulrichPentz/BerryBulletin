package com.pentz.berrybulletin.backend.tenancy;

// ====================================================================== \\

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//                             AbstractUser Base                          \\
// ====================================================================== \\

/**
 * Common base for all user types.
 */
public abstract class AbstractUser implements User {

    private int id;
    private String userName;
    
    // Constructor accepting unique identifier and display name.
    
    public AbstractUser(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    
    
    // Returns the unique identifier for the user.
    public int getId(String userName, String password){
        int id = 0;
        // db stuff
        return id;
    }

    // Returns the display name or username for the user.
    public String getUserName(int id){
        String username = "";
        // db stuff
        return username;
    }

    // Sets the display name or username for the user.
    public void setUserName(String userName){
        this.userName = userName;
    }

    // Returns the role or type of this user (to be implemented by subclass).
    public String getUserRole(int id){
        String userRole = "";
        // db stuff
        return userRole;
    }
    
    public Map<String , List<String>> getPrivileges(int userId){
        Map<String , List<String>> privilegesMap = new HashMap<>();
        // db stuff
        return privilegesMap;
    }
    
    public void assignPrivileges(int userId, int privilegeId){
        // db stuff
    }
    
    public boolean isUserRegistered(int id){
        boolean isRegistered = false;
        // db stuff
        return isRegistered;
    }
}