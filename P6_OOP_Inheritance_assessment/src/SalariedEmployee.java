public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetied;

    public void retire(){
        if (isRetied) {
            System.out.println("Already retired");
        } else {
            isRetied = true;
            System.out.println("Employ retired !");
        }
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeld, String hireDate, double annualSalary, boolean isRetied){
        super(name, birthDate, endDate, employeeld, hireDate);
        this.annualSalary = annualSalary;
        this.isRetied = isRetied;
    }


}
