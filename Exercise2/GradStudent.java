
package Exercise2;

public class GradStudent extends Student{
    
    private int day;
    private String month;
    private int year;

    public GradStudent() {
    }

    public GradStudent(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public GradStudent(int id, String name, String gender,int day, String month, int year) {
        super(id, name, gender);
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    void takeExam() {
        System.out.println("Exam on "+day+"th "+month+" "+year);
    }
    
}
