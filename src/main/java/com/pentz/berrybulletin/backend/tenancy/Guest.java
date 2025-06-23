package com.pentz.berrybulletin.backend.tenancy;

// ====================================================================== \\

import java.util.ArrayList;
import java.util.List;

//                                   Guest                                \\
// ====================================================================== \\

/**
 * Guest or anonymous user with restricted privileges.
 */
public class Guest extends AbstractUser {

    private int id;
    private String userName;
    private boolean isRegistered;
    private List<String> privileges;
    
    // Constructor accepting unique identifier and display name.
    public Guest (int id, String userName){
        super(id, userName);
    }
    
    // Returns the role or type of this user ("GUEST").
    public String returnRoleType(int id){
        String roleType = "";
        // db stuff
        return roleType;
    }
    
    // Add any guest-specific methods if required.
    

}
 