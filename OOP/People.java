package OOP;
public class People {
    protected int id;
    protected String name;
    protected String address;

    public People() {
    }

    public People(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.id+"\t"+this.name+"\t"+this.address;
    }
    public void Show(){
        System.out.print(id+"\t"+name+"\t"+address);
    }
    
}
