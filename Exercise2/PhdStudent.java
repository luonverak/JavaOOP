
package Exercise2;

public class PhdStudent extends Student{

    private int slide;
    private float score;
    private String grade;

    public PhdStudent() {
    }

    public PhdStudent(int id, String name, String gender,int slide) {
        super(id, name, gender);
        this.slide = slide;
        this.score = 0;
        this.grade = "F";
    }
    
    @Override
    void takeExam() {
        if(slide<5){
            score=49.0f;
        }else if(slide>=5 && slide<=10){
            score=50.0f;
        }else if(slide>10 && slide<=15){
            score=60.f;
        }else if(slide>15 && slide<=20){
            score=70.0f;
        }else if(slide>20 && slide<=25){
            score=80.0f;
        }else if(slide>25 && slide<=30){
            score=90.0f;
        }else if(slide>30 && slide<=35){
            score=100.0f;
        }
        if(score>=90 && score<=100){
            grade = "A";
        }else if(score>=80 && score<90){
            grade = "B";
        }else if(score>=70 && score<80){
            grade = "C";
        }else if(score>=60 && score<70){
            grade = "D";
        }else if(score>=50 && score<60){
            grade = "E";
        }else{
            grade = "F";
        }
        System.out.println("Number of slide presentations = "+slide);
        System.out.println("Score of slide presentations  = "+score);
        System.out.println("Grade of slide presentations  = "+grade);
    }
    
}
