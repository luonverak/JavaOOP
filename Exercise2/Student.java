
package Exercise2;

public abstract class Student {
    
    protected int id;
    protected String name;
    protected String gender;

    public Student() {
    }

    public Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    abstract void takeExam();
}
