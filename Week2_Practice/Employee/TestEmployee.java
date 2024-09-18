

public class TestEmployee {
    public static void main(String[] args) {
        Employee E1 = new Employee(0001, "John", "Doe", 0000);
        Employee E2 = new Employee(0002, "James", "Kennedy", 0000);

        System.out.println(E1);
        System.out.println(E2);

        // Setting salaries to 4500 and 5000 respectively
        E1.setSalary(4500);
        System.out.println("\nThe salary of " + E1.getFirstName() + " is: $" + E1.getSalary());
        E2.setSalary(5000);
        System.out.println("The salary of " + E2.getFirstName() + " is: $" + E2.getSalary());

        // Display annual salaries of John and James
        System.out.println("\nThe annual salary of " + E1.getFirstName() + " is: $" + E1.getAnnualSalary());
        System.out.println("The annual salary of " + E2.getFirstName() + " is: $" + E2.getAnnualSalary());

        // Raise both the salaries by 20%
        System.out.println("\nThe salary (after 20% raise) of " + E1.getFirstName() + " is: $" + E1.raiseSalary(20));
        System.out.println("The salary (after 20% raise) of " + E2.getFirstName() + " is: $" + E2.raiseSalary(20));
    }
}
