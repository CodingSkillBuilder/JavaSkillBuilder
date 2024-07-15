public class Employee extends Worker{

    private long employeeld;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeld, String hireDate){
        super(name, birthDate, endDate);
        this.employeeld = employeeld;
        this.hireDate = hireDate;
    }


}
