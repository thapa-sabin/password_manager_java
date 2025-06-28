# A Simple Password Manager CLI app built in Java

A simple command-line password manager built in Java using OOP principles.
This application allows users to manage their credentials for different services using an interactive menu.

## Features
1. Add new credentials for any service
2. View stored credentials based on service
3. Delete credentials based on service
4. View all the stored (in memory) credentials
5. Generate a random strong password

## Folder Structure
src/  
└── com/passwordmanager/  
├── app/               # Main CLI application (PasswordManagerApp.java)  
├── core/              # Core logic (Vault.java)  
├── models/            # Credential Logic (Credential.java)  
└── utils/             # Utility classes (PasswordGenerator.java)

## Requirements
* Java 8+
* Unix-like terminal (Linux/MacOS) or Git bash on Windows

## Usage
1. Compile the Project
```bash
javac -d out $(find src -name "*.java")
```
2. Run the Application
```bash
java -cp out com.passwordmanager.app.PasswordManagerApp
```

## Example Session
<--- Password Manager --->
1. Add Credential
2. View Credential
3. Delete Credential
4. Generate Password
5. List All
6. Exit 
Enter your choice:

## Future Scope
1. Persistent Storage of Credentials
2. Encrypt stored credentials
