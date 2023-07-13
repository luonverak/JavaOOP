package OOP;
public class Banker extends People{
    private String position;
    private float salary;
    private String exp;

    public Banker() {
    }

    public Banker(int id, String name, String address,String position,String exp) {
        super(id, name, address);
        this.position = position;
        this.exp = exp;
    }
    
    public Banker(int id, String name, String address,String position, float salary, String exp) {
        super(id, name, address);
        this.position = position;
        this.salary = salary;
        this.exp = exp;
    }
    public void Show(){
        super.Show();
        System.out.println("\t"+position+"\t"+salary+"\t"+exp);
    }
    
}
