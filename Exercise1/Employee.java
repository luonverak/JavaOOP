package Exercise1;

public class Employee extends Person {

    private String office;
    private float salary;
    private MyDate dateHired;

    public Employee() {
    }

    public Employee(String name, String address, String phone, String email,String office, float salary, MyDate dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    
    @Override
    public String toString() {
        return super.toString()+"\t"+ office + "\t" + salary + "\t" + dateHired;
    }
    
}
