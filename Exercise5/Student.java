package Exercise5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private String classesTaken;
    private String grade;

    public void addClasses(String classesTaken){
        List list = new ArrayList<>();
        list.add(classesTaken);
    }
    public void dropClasses(String classesTaken){
        List list = new ArrayList<>();
        if(list.contains(classesTaken))
            list.remove(classesTaken);
        else
            System.out.println("No class !");       
    }
    public String GPA(double average){
        String grade="";
        if(average>=3.7 && average<=4.0){
            grade = "A";
        }else if(average>=3.3 && average<3.7){
            grade = "A-";
        }else if(average>=3.0 && average<3.3){
            grade = "B";
        }else if(average>=2.7 && average<3.0){
            grade = "B-";
        }else if(average>=2.3 && average<2.7){
            grade = "C+";
        }else if(average>=2.0 && average<2.3){
            grade = "C";
        }else if(average>=1.7 && average<2.0){
            grade = "C-";
        }else if(average>=1.3 && average<1.7){
            grade = "D+";
        }else if(average>=1.0 && average<1.3){
            grade = "D";
        }else if(average<0.0){
            grade = "F";
        }
        return grade;
    }
    
}
