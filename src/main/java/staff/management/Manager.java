package staff.management;

import staff.Employee;

public class Manager extends Employee {

    //instance variables
    private String deptName;

    //constructor
    public Manager(String name, String NINumber, double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    //methods
    public String getDeptName() {
        return deptName;
    }



}
