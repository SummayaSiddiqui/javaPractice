public class Employee {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructors
    public Employee() {
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.salary = 0;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Methods
    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public String getName() {
        return (this.firstName + this.lastName);
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return (this.salary * 12);
    }

    public int raiseSalary(int percent) {
        return (((this.salary * percent)/100) + this.salary);
    }

    public String toString() {
        return ("Employee: id = " + this.id + " name = " + this.firstName + " " + this.lastName + ", salary = $"
                + this.salary);
    }
}