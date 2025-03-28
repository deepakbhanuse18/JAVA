
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String fName, String lName, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        setMonthlySalary(salary);
    }

    // Setter and Getter for firstName
    public void setFirstName(String fName)
     {
         this.firstName = fName;
          }
    public String getFirstName() 
    {
         return firstName; 
         }

    // Setter and Getter for lastName
    public void setLastName(String lName) 
    {
         this.lastName = lName; 
         }
    public String getLastName() 
    {
         return lastName;
          }

    // Setter and Getter for monthlySalary
    public void setMonthlySalary(double salary) {
        if (salary >= 0)
            this.monthlySalary = salary;
        else
            this.monthlySalary = 0.0;
    }
    public double getMonthlySalary() 
    {
         return monthlySalary;
          }

    // Function to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Function to give a 10% raise
    public void giveRaise() {
        this.monthlySalary *= 1.1;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Sahil", "Padavale", 5000);
        Employee emp2 = new Employee("Deepak", "Bhanuse", 3000);

        // Display initial yearly salaries
        System.out.println("Initial Yearly Salaries:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": Rs" + emp2.getYearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Display updated yearly salaries
        System.out.println("\nYearly Salaries after 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": Rs" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": Rs" + emp2.getYearlySalary());
    }
}

