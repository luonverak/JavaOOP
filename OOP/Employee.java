package OOP;
public class Employee extends People implements InCome{
    private String position;
    private float salary;

    public Employee() {
    }

    public Employee(int id, String name, String address,String position, float salary) {
        super(id, name, address);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public float Salary() {
        if(salary>0 && salary<=200){
            salary +=5;
        }else if(salary>200 && salary<=300){
            salary +=7;
        }else if(salary>300 && salary<=400){
            salary +=9;
        }
        return salary;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\t"+this.position+"\t"+this.salary+"\t"+this.Salary();
    }
    

}
