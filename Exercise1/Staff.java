
package Exercise1;

public class Staff extends Employee{
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, String phone, String email, String office, float salary, MyDate dateHired,String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+ title;
    }
    
}
