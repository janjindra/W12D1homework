package staff.management;

public class Director extends Manager {

    //instance variables
    private double budget;

    //constructor
    public Director(String name, String NINumber, double salary, String deptName, double budget){
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    //methods

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double bonusPercentage = 0.02;
        return getSalary() * bonusPercentage;
    }
}
