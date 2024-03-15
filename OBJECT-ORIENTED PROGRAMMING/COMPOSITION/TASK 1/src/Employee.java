public class Employee {
    private int employeeID;
    private String employeeName;
    private Address employeeAddress;

    public Employee(int employeeID, Address employeeAddress) {
        this.employeeID = employeeID;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public java.lang.String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(java.lang.String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }
}
