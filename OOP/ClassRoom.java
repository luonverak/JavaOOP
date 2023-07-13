package OOP;
public class ClassRoom extends People{
    
    Student_2 stu;

    public ClassRoom(int id,String name,String address,float score1,float score2,float score3) {
        super(id, name, address);
        stu = new Student_2(score1, score2, score3);
    }
    
    @Override
    public String toString() {
        return super.toString()+"\t"+stu.toString();
    }
    
}
