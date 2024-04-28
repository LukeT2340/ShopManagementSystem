package Employees;

/* 
Contains information about an employee
*/
public class Employee {
    private String name;
    private String id;
    private String role;

    // Constructor
    public Employee(String name, String id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
    }

    // Returns the user's name
    public String getName() {
        return this.name;
    }

    // Returns the user's id
    public String getId() {
        return this.id;
    }

    // Returns the user's role
    public String getRole() {
        return this.role;
    }

    // Sets the user's name
    public void setName(String name) {
        this.name = name;
    }

    // Sets the user's id
    public void setId(String id) {
        this.id = id;
    }

    // Sets the user's role
    public void setRole(String role) {
        this.role = role;
    }

    
}

