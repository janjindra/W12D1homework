package staff;

public abstract class Employee {

    //instance variables
    private String name;
    private String NINUmber;
    private double salary;


    //constructor
    public Employee(String name, String NINUmber, double salary){
        this.name = name;
        this.NINUmber = NINUmber;
        this.salary = salary;
    }

    //methods
    public String getName() {
        return name;
    }

    public String getNINUmber() {
        return NINUmber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double salaryIncrement) {
        if (salaryIncrement > 0.0) {
            return getSalary() + salaryIncrement;
        }
        return 000;
    }

    public double payBonus(){
        double bonusPercentage = 0.01;
        return getSalary() * bonusPercentage;
    }
}
