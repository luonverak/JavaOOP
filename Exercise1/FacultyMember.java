
package Exercise1;

public class FacultyMember extends Employee{
    private int officeHours;
    private String position;

    public FacultyMember() {
    }

    public FacultyMember(String name, String address, String phone, String email, String office, float salary, MyDate dateHired,int officeHours, String position) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.position = position;
    }

   
    
    @Override
    public String toString() {
        return super.toString()+"\t"+ officeHours + "\t" + position;
    }
    
}
