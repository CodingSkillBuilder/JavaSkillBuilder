public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public double getDoublePay(){
        System.out.println("Payer amount doubled!");
        return (hourlyPayRate * 2);
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long employeeld, String hireDate, double hourlyPayRate){
        super(name, birthDate, endDate, employeeld, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }
}
