package com.passwordmanager.core;

import com.passwordmanager.models.Credential;
import java.util.*;

/**
 * Manages a list of credentials in memory by acting like a temporary database.
 * Provides different methods to add, find, delete, and list all the available credentials.
 */
public class Vault {
    private List<Credential> credentials;

    // Constructs a new and empty vault
    public Vault() {
        credentials = new ArrayList<>();
    }

    /** Adds new credential to the vault
     * @param c the credential to add
     */
    public void addCredential(Credential c) {
        credentials.add(c);
    }

    /**
     * Finds a credential by its service name.
     * @param service the service to search for
     * @return the Credential, or null if not found
     */
    public Credential findByService(String service) {
        for (Credential c : credentials) {
            if (c.getService().equalsIgnoreCase(service)) {
                return c;
            }
        }
        return null;
    }

    /**
     * Deletes a credential by its service name
     * @param service the service to delete
     * @return true if deletion was successful, and false if otherwise
     */
    public boolean deleteByService(String service) {
        return credentials.removeIf(c -> c.getService().equalsIgnoreCase(service));
    }

    public void listAll() {
        if (credentials.isEmpty()) {
            System.out.println("No credentials found. Vault is empty.");
            return;
        }
        for (Credential c : credentials) {
            System.out.println(c);
        }
    }
}