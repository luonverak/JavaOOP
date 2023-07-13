package OOP;
public class Student_2 extends GPA{
    
    private float score_1;
    private float score_2;
    private float score_3;

    public Student_2() {
    }

    public Student_2(float score_1, float score_2, float score_3) {
        this.score_1 = score_1;
        this.score_2 = score_2;
        this.score_3 = score_3;
    }
    
    @Override
    public float Total() {
        return score_1 + score_2 + score_3;
    }

    @Override
    public float Average() {
        return Total()/3;
    }

    @Override
    public String Grade() {
        float avg=this.Average();
        String grade;
        if(avg>=90 && avg<=100){
            grade = "A";
        }else if(avg>=80 && avg<90){
            grade = "B";
        }
        else if(avg>=70 && avg<80){
            grade = "C";
        }
        else if(avg>=60 && avg<70){
            grade = "D";
        }else if(avg>=50 && avg<60){
            grade = "E";
        }else{
            grade = "F";
        }
        return grade;
    }

    @Override
    public String toString() {
        return this.score_1+"\t"+this.score_2+"\t"+this.score_3+"\t"+
               this.Total()+"\t"+this.Average()+"\t"+this.Grade();
    }

}
