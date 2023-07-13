
package Exercise1;

public class TestProgram {
    public static void main(String[] args) {
        
        MyDate dateHired = new MyDate(5,"Jul", 2023);
        
        Person person = new Person("Sok", "PP","09298383", "sok@gmail.com");
        Student student = new Student("Dara","Takeo", "039385856","dara@gmail.com",Student.JUNIOR);
        Employee employee = new Employee("Koko","PP", "03948853", "koko@gmail.com","In PP", 300,dateHired);
        FacultyMember facultyMember = new FacultyMember("Soda","Takeo","08377363","soda@gmail.com","CP Bank", 250, dateHired,8,"Developer");
        Staff staff = new Staff("Thyda","PP", "03848584", "thyda@gmail.com", "In PP", 300, dateHired,"UX/CI");
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(facultyMember);
        System.out.println(staff);
        
    }
}
