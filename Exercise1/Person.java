package Exercise1;

public class Person {
    
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person() {
    }

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    

    @Override
    public String toString() {
        return name + "\t" + address + "\t" + phone + "\t" + email;
    }
    
}
