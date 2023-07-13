
package Exercise2;

public class TestProgram {
    public static void main(String[] args) {
        
        PhdStudent phdStudent = new PhdStudent(1,"koka","Male", 20);
        GradStudent gradStudent = new GradStudent(18,"Jul", 2023);
        
        phdStudent.takeExam();
        gradStudent.takeExam();
    }
}
