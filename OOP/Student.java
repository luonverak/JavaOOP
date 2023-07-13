package OOP;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String gender;
    private float score;

    public Student() {
    }

    public Student(int id, String name, String gender, float score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Id     = "); id=scanner.nextInt();scanner.nextLine();
        System.out.print("Input Name   = "); name=scanner.nextLine();
        System.out.print("Input Gender = "); gender=scanner.next();
        System.out.print("Input Score  = "); score=scanner.nextFloat();
    }
    
    @Override
    public String toString() {
        return "\t"+id+"\t"+name+"\t"+gender+"\t"+score;
    }
    
}
