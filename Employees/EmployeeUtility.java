package Employees;

/* 
Contains a set of methods useful for Employee objects
*/
public class EmployeeUtility {
    
    // Checks whether Employee object is valid
    public boolean isEmployeeValid(Employee employee) {
        return isNameValid(employee.getName()) && isIdValid(employee.getId()) && isRoleValid(employee.getRole());
    }

    // Checks whether name is valid
    public boolean isNameValid(String name) {
        
        // Check if name length is between 3 and 30 characters
        if (name.length() < 3 || name.length() > 30) {
            return false;
        }

        // Check if name contains leading or trailing whitespace
        if (!name.equals(name.trim())) {
            return false;
        }

        // Check if name contains digits
        for (char c : name.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Checks whether id is valid
    public boolean isIdValid(String id) {
        return id.length() > 7 && id.replaceFirst("^0+", "").equals(id);
    }

    // Checks whether role is valid
    public boolean isRoleValid(String role) {
        String[] validRoles = {"SA", "RSM", "DSM", "AM", "SM", "SAM"};
        for (String validRole: validRoles) {
            if (role.equals(validRole)) {
                return true;
            }
        }
        return false;
    }
}
