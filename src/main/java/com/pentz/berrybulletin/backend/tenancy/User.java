package com.pentz.berrybulletin.backend.tenancy;

// ====================================================================== \\
//                               User Interface                           \\
// ====================================================================== \\

/**
 * Contract for all system tenants.
 */
public interface User {

    // Returns the unique identifier for the user.
    int getId(String userName, String password);
    
    // Returns the display name or username for the user.
    String getUserName(int id);
    
    // Sets the display name or username for the user.
    void setUserName(String userName);
    
    // Returns the role or type of this user (e.g. ADMIN, USER, GUEST).
    String getUserRole(int id);
}
    