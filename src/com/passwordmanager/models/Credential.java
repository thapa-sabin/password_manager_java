package com.passwordmanager.models;

/**
 * This class represents a user credential for a specified service they choose.
 * Each credential contains the name of a service, username, and password
 */

public class Credential {
    private String service;
    private String username;
    private String password;

    /**
     * Constructs a new Credential with the given service name, username and password
     * @param service
     * @param username
     * @param password
     */
    public Credential(String service, String username, String password) {
        this.service = service;
        this.username = username;
        this.password = password;
    }

    public String getService() {return service;}
    public String getUsername() {return username;}
    public String getPassword() {return password;}

    @Override
    public String toString() {
        return "Service: " + service + " Username: " + username + " Password: " + password;
    }
}
