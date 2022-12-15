package Main;



public class Employee {

    private String fullName;
    private double Salary;
    private double numOfHours;

    Employee(double salary, double numberOfHours, String FullName){
        this.Salary = salary;
        this.numOfHours = numberOfHours;
        this.fullName = FullName;
        addSalary();
    }
    public void addSalary(){
        if(Salary < 500)
            Salary = Salary + 10;
        if(numOfHours > 6) {
            for (int i = 6; i < numOfHours; i++) {
                Salary = Salary + 5;
            }
        }
    }
    public String toString(){

        String finalSalary = String.format("%.2f%n",Salary);
        return "\nName: "+fullName+"\nFinal Salary: "+finalSalary;
    }

}
